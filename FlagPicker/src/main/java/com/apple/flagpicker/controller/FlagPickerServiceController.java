package com.apple.flagpicker.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.apple.flagpicker.dto.ContinentDetail;
import com.apple.flagpicker.service.FlagPickerService;

@RestController
public class FlagPickerServiceController {

	@Autowired
	private FlagPickerService flagPickerService;

	private static final Logger LOGGER = LoggerFactory.getLogger(FlagPickerServiceController.class);
	
	/**
	 * Method to get all the continent details
	 * @return List<ContinentDetail>
	 */
	@GetMapping("${continent}")
	public List<ContinentDetail> getAllContinent() {
		LOGGER.info("Getting all continent details");
		return this.flagPickerService.getAllContinentAndCountryDetails();
	}

	/**
	 * Method to get the continent detail by continent Name
	 * @param continentName
	 * @return
	 */
	@GetMapping("${continent.name}")
	public ContinentDetail getContinentByName(@PathVariable("name") String continentName) {
		LOGGER.info("Getting continent detail for {}",continentName);
		return this.flagPickerService.getContinentByName(continentName);
	}
}