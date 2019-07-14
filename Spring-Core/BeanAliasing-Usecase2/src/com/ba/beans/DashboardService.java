package com.ba.beans;

public class DashboardService {

	private IReport report;

	public void generateReport() {
		report.generate();
	}

	public void setReport(IReport report) {
		this.report = report;
	}

}
