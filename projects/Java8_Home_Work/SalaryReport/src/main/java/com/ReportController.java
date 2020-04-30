package com;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReportController {
	
	@RequestMapping("/ReportGenerate")
	public  String ReportGenerate(HttpServletRequest request,HttpServletResponse Response,Map<String,Object> map) {
		
		ReportController reportController=new ReportController();
		//获取前端参数
		int SS=Integer.parseInt(request.getParameter("Starting_Salary"));
		int IC=Integer.parseInt(request.getParameter("Increment"));
		String IF=request.getParameter("Frequency");
		int DC=Integer.parseInt(request.getParameter("Deductions"));
		String DF=request.getParameter("DFrequency");
		
		//获取年增长率
		double yearIncrementF=reportController.getYearFrequency(IF,IC);
		System.out.println("yearIncrementF:"+yearIncrementF);
		System.out.println("IF:"+IF);
		
		//获取年扣除率
		double yearDeductionF=reportController.getYearDFrequency(DF,DC);
		//初始化要计算的年份
		int[] year= {5,10,20,30,50};
		//
		IncrementService incrementService=new IncrementService();
		DeductionService deductionService=new DeductionService();
		PredictionService predictionService=new PredictionService();
		//初始化report类型数组，用于接收生成的预期数据并反馈给前端
		ArrayList<IncrementReport>  incrementReportList=new ArrayList<IncrementReport>();
		ArrayList<DeductionReport>  deductionReportList=new ArrayList<DeductionReport>();
		ArrayList<PredictionReport>  predictionReportList=new ArrayList<PredictionReport>();
		
		//按年生成预期数据
		for (int i=0;i<year.length;i++) {
			IncrementReport incrementReport=incrementService.Report(SS, yearIncrementF, year[i]);
			DeductionReport deductionReport=deductionService.Report(SS, yearDeductionF, year[i]);
			PredictionReport predictionReport=predictionService.Report(incrementReport, deductionReport);
			incrementReportList.add(incrementReport);
			deductionReportList.add(deductionReport);
			predictionReportList.add(predictionReport);
			System.out.println("incrementReport:"+incrementReport);
			System.out.println("deductionReport:"+deductionReport);
			System.out.println("predictionReport:"+predictionReport);
			
		}
		//将预期数据添加到map集合
		map.put("incrementReportList", incrementReportList);
		map.put("deductionReportList", deductionReportList);
		map.put("predictionReportList", predictionReportList);
		
		

		
		return "Successful";	
	} 
	
	//计算年增长率
	public static double getYearFrequency(String incrementF,int increment) {
		double yearIncrementF = 0;
		switch(incrementF) {
		case "y" : 
			yearIncrementF=increment/100;
		    break;
		
		case "q" :
			yearIncrementF=Math.pow(1+increment/100, 2)-1;
			break;
		case "m" :
			yearIncrementF=Math.pow(1+increment/100, 12)-1;
			break;
		}
		return yearIncrementF;
	}

	//计算年扣除率
	public static double getYearDFrequency(String deductionF,int deductions) {
		double yearDeductionF = 0;
		switch(deductionF) {
		case "y" :
			yearDeductionF=deductions/100;
			break;
		case "q" :
			yearDeductionF=1-Math.pow(1-deductions/100, 2);
			break;
		case "m" : 
			yearDeductionF=1-Math.pow(1-deductions/100, 12);
			break;
		}
		return yearDeductionF;
	}
	
}
