package com.nt.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.bo.EmployeeBO;

@Controller
public class EmployeeController {

	public EmployeeController() {
		System.out.println("EmployeeController.EmployeeController()");
	}

	@RequestMapping("/showEmps")
	public String showEmployees(Map<String, Object> map) {

		//Collection data
		List<String> fruits=new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Banana");
		
		Set<Long> phoneNums=new HashSet<Long>();
		phoneNums.add(8341849309L);
		phoneNums.add(9618265905L);
		
		Map<String, Float> subMarks=new HashMap<String, Float>();
		subMarks.put("Maths", 149f);
		subMarks.put("Physics", 130f);
		subMarks.put("Chemistry", 106f);
		
		//Array data
		String favColors[]=new String[] {"Red","Green","White"};
		
		//Java Bean or Model object data
		EmployeeBO bo1=new EmployeeBO(100, "Venkateswarlu", 30000f, "MPL");
		EmployeeBO bo2=new EmployeeBO(100, "Kishore", 30000f, "MPL");
		EmployeeBO bo3=new EmployeeBO(100, "Kowshil", 30000f, "MPL");
		
		List<EmployeeBO> listbo=new ArrayList<EmployeeBO>();
		listbo.add(bo1);	listbo.add(bo2);	listbo.add(bo3);
		
		//Add all data to Map object to DataRendering
		map.put("fruits", fruits);
		map.put("phoneNums", phoneNums);
		map.put("subMarks", subMarks);
		map.put("favColors", favColors);
		map.put("listBo", listbo);
		
		return "show";
	}

}
