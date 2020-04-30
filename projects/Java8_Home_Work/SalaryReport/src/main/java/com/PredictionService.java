package com;

public class PredictionService {
	public PredictionReport Report(IncrementReport incrementReport,DeductionReport deductionReport) {
		PredictionReport predictionReport=new PredictionReport();
		double increment=incrementReport.getIncrementAmout();
		double deduction=deductionReport.getDeducationAmout();
		String salaryGrowth=String.valueOf(increment-deduction);
		
		predictionReport.setYear(incrementReport.getYear());
		predictionReport.setStartingSalary(incrementReport.getStartingSalary());
		predictionReport.setIncrementAmout(String.valueOf(increment));
		predictionReport.setDeductionAmount(String.valueOf(deduction));
		predictionReport.setSalaryGrowth(salaryGrowth);
		return predictionReport;
		
	}

}
