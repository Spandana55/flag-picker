package com.apple.flagpicker.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.apple.flagpicker.dto.ContinentDetail;

@Service
public interface FlagPickerService {

	/**
	 * 
	 * @return List<ContinentDetails>
	 */
	List<ContinentDetail> getAllContinentAndCountryDetails();
	
	/**
	 * 
	 * @param 
	 * @return ContinentDetails
	 */
	ContinentDetail getContinentByName(String continent);

}
