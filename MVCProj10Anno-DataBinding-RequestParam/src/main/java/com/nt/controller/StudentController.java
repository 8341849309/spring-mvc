package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {

	/*
	 * //Url Param name Variable names are matched you can take like this...
	 * 
	 * @GetMapping("/student") public String registerStudent(Map<String, Object>
	 * map, @RequestParam int sno, @RequestParam String name, @RequestParam float
	 * avg) { System.out.println("sno "+sno+" name "+name+" avg "+avg);
	 * 
	 * map.put("sno", sno); map.put("name", name); map.put("avg", avg);
	 * 
	 * return "result"; }
	 */

	/*
	 * //No.of params need not to match but their names need to match otherwise bad
	 * request
	 * 
	 * @GetMapping("/student") public String registerStudent(Map<String, Object>
	 * map, @RequestParam int sno, @RequestParam String name) {
	 * System.out.println("sno " + sno + " name " + name);
	 * 
	 * map.put("sno", sno); map.put("name", name); //map.put("avg", avg);
	 * 
	 * return "result"; }
	 */

	/*
	 * //If Param is not passing we write some default message
	 * 
	 * @GetMapping("/student") public String registerStudent(Map<String, Object>
	 * map, @RequestParam int sno,
	 * 
	 * @RequestParam(required = false, defaultValue = "Default") String name) {
	 * System.out.println("sno " + sno + " name " + name);
	 * 
	 * map.put("sno", sno); map.put("name", name); //map.put("avg", avg);
	 * 
	 * return "result"; }
	 */

	/*
	 * //multiple values to the single param as comma seperated
	 * 
	 * @GetMapping("/student") public String registerStudent(Map<String, Object>
	 * map, @RequestParam int sno,
	 * 
	 * @RequestParam String name) { System.out.println("sno " + sno + " name " +
	 * name);
	 * 
	 * map.put("sno", sno); map.put("name", name); //map.put("avg", avg);
	 * 
	 * return "result"; }
	 */

	/*
	 * //param as array type
	 * 
	 * @GetMapping("/student") public String registerStudent(Map<String, Object>
	 * map, @RequestParam int sno,
	 * 
	 * @RequestParam String[] name) { System.out.println("sno " + sno + " name " +
	 * name);
	 * 
	 * map.put("sno", sno); map.put("name", name); //map.put("avg", avg);
	 * 
	 * return "result"; }
	 */

	// for primitive values we need to put default values otherwise 500 error
	@GetMapping("/student")
	public String registerStudent(Map<String, Object> map, @RequestParam(required = false, defaultValue = "0") int sno,

			@RequestParam(required = false, defaultValue = "Default") String name) {
		System.out.println("sno " + sno + " name " + name);

		map.put("sno", sno);
		map.put("name", name); // map.put("avg", avg);

		return "result";
	}

}
