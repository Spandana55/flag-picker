package com.apple.flagpicker.dto;

import java.util.List;

public class ContinentDetail {

	private String continent;
	
	private List<CountriesDetail> countries;

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public List<CountriesDetail> getCountries() {
		return countries;
	}

	public void setCountries(List<CountriesDetail> countries) {
		this.countries = countries;
	}
}
