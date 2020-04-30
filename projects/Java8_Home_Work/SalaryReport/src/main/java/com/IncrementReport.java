package com;

public class IncrementReport {
	private String year;
	private String startingSalary;
	private String numberOfIncrements;
	private String Increment;
	private double IncrementAmout;
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
	public String getNumberOfIncrements() {
		return numberOfIncrements;
	}
	public void setNumberOfIncrements(String numberOfIncrements) {
		this.numberOfIncrements = numberOfIncrements;
	}
	public String getIncrement() {
		return Increment;
	}
	public void setIncrement(String increment) {
		Increment = increment;
	}

	public double getIncrementAmout() {
		return IncrementAmout;
	}
	public void setIncrementAmout(double incrementAmout) {
		IncrementAmout = incrementAmout;
	}
	@Override
	public String toString() {
		return "IncrementReport [year=" + year + ", startingSalary=" + startingSalary + ", numberOfIncrements="
				+ numberOfIncrements + ", Increment=" + Increment + ", IncrementAmout=" + IncrementAmout
				+ "]";
	}
	

}
