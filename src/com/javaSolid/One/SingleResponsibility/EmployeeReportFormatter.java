package com.javaSolid.One.SingleResponsibility;

public class EmployeeReportFormatter extends ReportFormatter{

	public EmployeeReportFormatter(Employee employee, FormatType formatType) {
		super(employee, formatType);
	}

	public String getFormattedEmployee(){
		return getFormattedValue();
	}
	
}
