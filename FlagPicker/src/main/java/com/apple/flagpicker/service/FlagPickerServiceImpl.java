package com.apple.flagpicker.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.apple.flagpicker.dto.ContinentDetail;
import com.apple.flagpicker.dto.CountriesDetail;
import com.apple.flagpicker.entity.Continent;
import com.apple.flagpicker.entity.Countries;
import com.apple.flagpicker.exception.ContinentNotFoundException;
import com.apple.flagpicker.repository.ContinentRepository;

@Service
public class FlagPickerServiceImpl implements FlagPickerService {

	/**
	 * continentRepository bean
	 */
	@Autowired
	private ContinentRepository continentRepository;

	private static final Logger LOGGER = LoggerFactory.getLogger(FlagPickerServiceImpl.class);
	
	/**
	 * 
	 */
	public List<ContinentDetail> getAllContinentAndCountryDetails() {
		LOGGER.debug("FlagPickerServiceImpl :: getAllContinentAndCountryDetails : method execution starts");
		List<ContinentDetail> continentDetails = null;
		List<CountriesDetail> countriesDetails = null;
		List<Continent> continents = continentRepository.findAll();
		if (CollectionUtils.isEmpty(continents)) {
			LOGGER.info("Continent data not found");
			throw new ContinentNotFoundException("Continent data not found");
		}
		continentDetails = new ArrayList<>();
		for (Continent continent : continents) {
			ContinentDetail continentdetail = new ContinentDetail();
			continentdetail.setContinent(continent.getContinent());
			countriesDetails = new ArrayList<>();
			if (!CollectionUtils.isEmpty(continents)) {
			for (Countries country : continent.getCountries()) {
				CountriesDetail countriesDetail = new CountriesDetail();
				countriesDetail.setName(country.getName());
				countriesDetail.setFlag(country.getFlag());
				countriesDetails.add(countriesDetail);

			}
			}
			continentdetail.setCountries(countriesDetails);
			continentDetails.add(continentdetail);
		}
		LOGGER.debug("FlagPickerServiceImpl :: getAllContinentAndCountryDetails : method execution ends");
		return continentDetails;
	}

	/**
	 * 
	 */
	@Override
	public ContinentDetail getContinentByName(String continentName) {
		LOGGER.debug("FlagPickerServiceImpl :: getContinentByName : method execution starts");
		Continent continent = continentRepository.findByContinent(continentName);
		if (continent == null) {
			throw new ContinentNotFoundException("Continent data not found. Please provide valid continent");
		}
		ContinentDetail continentdetail = new ContinentDetail();
		List<CountriesDetail> countriesDetails = new ArrayList<>();
		continentdetail.setContinent(continent.getContinent());
		if (!CollectionUtils.isEmpty(continent.getCountries())) {
			continent.getCountries().forEach(country -> {
				CountriesDetail countriesDetail = new CountriesDetail();
				countriesDetail.setName(country.getName());
				countriesDetail.setFlag(country.getFlag());
				countriesDetails.add(countriesDetail);
			});
		}
		continentdetail.setCountries(countriesDetails);
		LOGGER.debug("FlagPickerServiceImpl :: getAllContinentAndCountryDetails : method execution ends");
		return continentdetail;
	}

}
