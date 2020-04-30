package com;

public class IncrementService {
	public IncrementReport Report(int SS,double IC,int year) {
		IncrementReport incrementReport=new IncrementReport();
		//计算总增长率NumberOfDeduction
		double noi=Math.pow((1+IC), year);
		
		//计算扣除总额
		double da=SS*noi;
		incrementReport.setYear(String.valueOf(year));
		incrementReport.setStartingSalary(String.valueOf(SS));
		incrementReport.setNumberOfIncrements(String.valueOf(da));
		incrementReport.setIncrementAmout(da);
		incrementReport.setIncrement(String.valueOf(noi));
		
		return incrementReport;
	}

}
