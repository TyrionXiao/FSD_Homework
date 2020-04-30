package com;

public class DeductionService {
	public DeductionReport  Report(int SS,double DC,int year) {
		DeductionReport deductionReport=new DeductionReport();
		//计算总增长率NumberOfDeduction
		double nod=Math.pow((1-DC), year);
		
		//计算扣除总额
		double da=SS*nod;
		deductionReport.setYear(String.valueOf(year));
		deductionReport.setStartingSalary(String.valueOf(SS));
		deductionReport.setNumberOfDeduction(String.valueOf(da));
		deductionReport.setDeducationAmout(da);
		deductionReport.setDeduction(String.valueOf(nod));
		
		return deductionReport;
	}

}
