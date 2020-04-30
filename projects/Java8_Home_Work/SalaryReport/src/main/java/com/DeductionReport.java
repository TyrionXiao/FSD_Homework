package com;

public class DeductionReport {
	private String year;
	private String startingSalary;
	private String numberOfDeduction;
	private String deduction;
	private double deducationAmout;
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
	public String getNumberOfDeduction() {
		return numberOfDeduction;
	}
	public void setNumberOfDeduction(String numberOfDeduction) {
		this.numberOfDeduction = numberOfDeduction;
	}
	public String getDeduction() {
		return deduction;
	}
	public void setDeduction(String deduction) {
		this.deduction = deduction;
	}

	public double getDeducationAmout() {
		return deducationAmout;
	}
	public void setDeducationAmout(double deducationAmout) {
		this.deducationAmout = deducationAmout;
	}
	@Override
	public String toString() {
		return "DeductionReport [year=" + year + ", startingSalary=" + startingSalary + ", numberOfDeduction="
				+ numberOfDeduction + ", deduction=" + deduction + ", deducationAmout=" + deducationAmout
			    + "]";
	}
	

}
