package com.ba.beans;

public class POIReport implements IReport {

	@Override
	public void generate() {
		System.out.println("Report generated using POI API...");
	}
}
