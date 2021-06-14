package com.nt.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.Font;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;
import com.nt.model.Employee;

@Component("pdfReport")
public class EmployeePdfReport extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(Map<String, Object> map, Document doc, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		List<Employee> list=(List<Employee>) map.get("empList");
		
		//Add Paragraph
		Paragraph para=new Paragraph("Employee Report", new Font(Font.BOLD));
		doc.add(para);
		
		//Create table
		Table table=new Table(4, list.size());
		
		table.addCell(String.valueOf("Employee Number"));
		table.addCell(String.valueOf("Employee Name"));
		table.addCell(String.valueOf("Employee Address"));
		table.addCell(String.valueOf("Employee Salary"));
		
		for (Employee emp : list) {
			table.addCell(String.valueOf(emp.getEno()));
			table.addCell(emp.getEname());
			table.addCell(emp.getEadd());
			table.addCell(String.valueOf(emp.getSalary()));
		}
	
		doc.add(table);
		
	}

	

}
