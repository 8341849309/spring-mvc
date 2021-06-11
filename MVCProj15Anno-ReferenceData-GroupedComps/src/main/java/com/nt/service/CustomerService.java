package com.nt.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {

	public List<String> populateGenders() {
		System.out.println("CustomerService.populateGenders()");
		
		List<String> gendersList = new ArrayList<String>();
		gendersList.add("Male");
		gendersList.add("Female");

		return gendersList;
	}

	public List<String> populatehobbies() {
		System.out.println("CustomerService.populatehobbies()");
		
		List<String> hobbiesList = new ArrayList<String>();
		hobbiesList.add("Reading Books");
		hobbiesList.add("Playing Kabaddi");
		hobbiesList.add("Watching movies");

		return hobbiesList;
	}

	public List<String> populateCountries() {
		System.out.println("CustomerService.populateCountries()");
		
		Locale[] locales=Locale.getAvailableLocales();
		List<String> countriesList = new ArrayList<String>();

		for (Locale l : locales) {
			countriesList.add(l.getDisplayCountry());
		}
		
		return countriesList;
	}

	public List<String> populateLanguages() {
		System.out.println("CustomerService.populateLanguages()");
		
		Locale[] locales=Locale.getAvailableLocales();
		List<String> languagesList = new ArrayList<String>();

		for (Locale l : locales) {
			languagesList.add(l.getDisplayLanguage());
		}
		
		return languagesList;
	}

}
