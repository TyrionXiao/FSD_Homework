<%@ page language="java" contentType="text/html" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ page  import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>Salary Income Predictor</title>
</head>
<body>
<h2>Success Report</h2>
<br/>
<h4>a. Increment Report</h4>
<table border="1" cellpadding="0">
    <tr>
       <td style="width:20%">Year</td>
       <td style="width:20%">Starting Salary</td>
       <td style="width:20%">Number of Increments</td>
       <td style="width:20%">Increment</td>
       <td style="width:20%">Increment Amount</td>
    </tr>
    <c:forEach items="${incrementReportList}" var="incrementReport">
      <tr>
        <td>${incrementReport.year}</td>
        <td>${incrementReport.startingSalary}</td>
        <td>${incrementReport.numberOfIncrements}</td>
        <td>${incrementReport.Increment}</td>
        <td>${incrementReport.IncrementAmout}</td>
      </tr>    
    </c:forEach>
    
</table>
<h4>b. Deduction Report</h4>
<table border="1" cellpadding="0">
    <tr>
       <td style="width:20%">Year</td>
       <td style="width:20%">Starting Salary</td>
       <td style="width:20%">Number of Deductions</td>
       <td style="width:20%">Deduction %</td>
       <td style="width:20%">Deduction Amount</td>
    </tr>
    <c:forEach items="${deductionReportList}" var="deductionReport">
      <tr>
        <td>${deductionReport.year}</td>
        <td>${deductionReport.startingSalary}</td>
        <td>${deductionReport.numberOfDeduction}</td>
        <td>${deductionReport.deduction}</td>
        <td>${deductionReport.deducationAmout}</td>
      </tr>    
    </c:forEach>
    
</table>

<h4>c. Prediction </h4>
<table border="1" cellpadding="0">
    <tr>
       <td style="width:20%">Year</td>
       <td style="width:20%">Starting Salary</td>
       <td style="width:20%">Increment Amount</td>
       <td style="width:20%">Deduction Amount</td>
       <td style="width:20%">Salary Growth</td>
       
    </tr>
    <c:forEach items="${predictionReportList}" var="predictionReport">
      <tr>
        <td>${predictionReport.year}</td>
        <td>${predictionReport.startingSalary}</td>
        <td>${predictionReport.IncrementAmout}</td>
        <td>${predictionReport.deductionAmount}</td>
        <td>${predictionReport.salaryGrowth}</td>
      </tr>    
    </c:forEach>
    
</table>

</body>
</html>