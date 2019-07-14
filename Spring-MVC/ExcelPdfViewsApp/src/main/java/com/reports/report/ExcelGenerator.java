package com.reports.report;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsView;

import com.reports.model.Product;

public class ExcelGenerator extends AbstractXlsView {

	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		Sheet sheet = workbook.createSheet("Products Data");

		// Creating Header Row in Excel sheet
		Row headerRow = sheet.createRow(0);
		headerRow.createCell(0).setCellValue("PID");
		headerRow.createCell(1).setCellValue("PName");
		headerRow.createCell(2).setCellValue("Price");

		// Getting Products data
		List<Product> products = (List<Product>) model.get("products");

		// Create Data rows in Excel sheet with products data
		int rowIndex = 1;
		for (Product p : products) {
			
			Row dataRow = sheet.createRow(rowIndex);
			
			dataRow.createCell(0).setCellValue(p.getPid());
			dataRow.createCell(1).setCellValue(p.getPname());
			dataRow.createCell(2).setCellValue(p.getPrice());
			
			rowIndex++;
		}

	}

}
