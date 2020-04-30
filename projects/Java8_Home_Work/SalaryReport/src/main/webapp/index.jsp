<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ page  import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<title>Salary Income Predictor</title>
</head>
<body>
<form action="ReportGenerate">
    <h2>Salary Income Predictor</h2>
    <table cellpadding="3">
        <tr>
            <th>Fill in the basic infomation</th>
        </tr>
        <tr>
            <td>
                <input id="SS" name="Starting_Salary" type="number" required min="1" />
            </td>
            <td>
                <label for="SS" >Starting Salary</label>
            </td>
            <td>
                <input id="Increment" name="Increment" type="number" required min="0" max="100"/>%
            </td>
            <td>
                <label for="Increment" >Increment</label>
            </td>
            <td>
                <select id="Frequence" name="Frequency">
                    <option value="y">Year</option>
                    <option value="q">Quarter</option>
                    <option value="m">MOnth</option>
                </select>
            </td>
            <td>
                <label for="Frequence" >Income Frequencey</label>
            </td>
                        <td>
                <input id="Deductions" name="Deductions" type="number" required min="0" max="100"/>%
            </td>
            <td>
                <label for="Deductions" >Deductions</label>
            </td>
            <td>
                <select id="DFrequence" name="DFrequency">
                    <option value="y">Year</option>
                    <option value="q">Quarter</option>
                    <option value="m">MOnth</option>
                </select>
            </td>
            <td>
                <label for="DFrequence" >Deductions Frequencey</label>
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit" value="submit"/>
                <input type="reset" value="reset"/>
            </td>
        </tr>
    </table>

</form>
</body>
</html>
