package com.reports.report;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;
import com.reports.model.Product;

public class PdfGenerator extends AbstractPdfView {
	@Override
	protected void buildPdfDocument(Map map, Document doc, PdfWriter writer, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		List<Product> pList = (List) map.get("products");

		Paragraph p = new Paragraph("Product Details");
		p.setAlignment("center");
		Table t = new Table(3);
		t.setAlignment("center");
		t.addCell("PID");
		t.addCell("PName");
		t.addCell("Price");
		if (!pList.isEmpty()) {
			for (Product prod : pList) {
				t.addCell(prod.getPid() + "");
				t.addCell(prod.getPname() + " ");
				t.addCell(prod.getPrice() + " ");
			}
		}
		doc.add(p);
		doc.add(t);
	}
}
