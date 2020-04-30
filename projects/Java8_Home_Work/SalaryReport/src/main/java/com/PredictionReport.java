package com;

public class PredictionReport {
	private String year;
	private String startingSalary;
	private String deductionAmount;
	private String salaryGrowth;
	private String IncrementAmout;
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getStartingSalary() {
		return startingSalary;
	}
	public void setStartingSalary(String startingSalary) {
		this.startingSalary = startingSalary;
	}
	public String getDeductionAmount() {
		return deductionAmount;
	}
	public void setDeductionAmount(String deductionAmount) {
		this.deductionAmount = deductionAmount;
	}
	public String getSalaryGrowth() {
		return salaryGrowth;
	}
	public void setSalaryGrowth(String salaryGrowth) {
		this.salaryGrowth = salaryGrowth;
	}
	public String getIncrementAmout() {
		return IncrementAmout;
	}
	public void setIncrementAmout(String incrementAmout) {
		IncrementAmout = incrementAmout;
	}
	@Override
	public String toString() {
		return "PredictionReport [year=" + year + ", startingSalary=" + startingSalary + ", deductionAmount="
				+ deductionAmount + ", salaryGrowth=" + salaryGrowth + ", IncrementAmout=" + IncrementAmout
			    + "]";
	}
	
	

}
