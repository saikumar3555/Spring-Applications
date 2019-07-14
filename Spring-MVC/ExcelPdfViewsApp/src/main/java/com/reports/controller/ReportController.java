package com.reports.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.reports.model.Product;
import com.reports.service.ReportService;

@Controller
public class ReportController {

	@Autowired
	private ReportService reportService;

	/*
	 * @RequestMapping("/") public String index(Model model) { return "report";
	 * }
	 */

	@RequestMapping("/excel")
	public ModelAndView generateExcel(Model model) {

		ModelAndView mav = new ModelAndView();
		List<Product> productsData = reportService.getProductsData();
		mav.setViewName("excelView");
		mav.addObject("products", productsData);

		return mav;
	}

	@RequestMapping("/pdf")
	public ModelAndView generatePdf(Model model) {

		ModelAndView mav = new ModelAndView();
		List<Product> productsData = reportService.getProductsData();
		mav.setViewName("pdfView");
		mav.addObject("products", productsData);

		return mav;
	}

}
