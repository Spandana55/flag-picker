package com.apple.flagpicker.test.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.util.CollectionUtils;

import com.apple.flagpicker.dto.ContinentDetail;
import com.apple.flagpicker.entity.Continent;
import com.apple.flagpicker.entity.Countries;
import com.apple.flagpicker.repository.ContinentRepository;
import com.apple.flagpicker.service.FlagPickerServiceImpl;

public class FlagPickerServiceTest {

	@InjectMocks
	private FlagPickerServiceImpl flagPickerServiceImpl = new FlagPickerServiceImpl();
	
	@Mock
	ContinentRepository continentRepository;
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testGetAllContinentAndCountryDetails() {
		Countries countries = new Countries();
		countries.setName("Nigeria");
		Continent continent = new Continent();
		continent.setContinent("Africa");
		continent.setCountries(Collections.singletonList(countries));
		List<ContinentDetail> continents = new ArrayList<>();
		ContinentDetail continentDetail = new ContinentDetail();
		continent.setContinent("Africa");
		continents.add(continentDetail);
		Mockito.when(continentRepository.findAll()).thenReturn(Collections.singletonList(continent));
		assertTrue(!CollectionUtils.isEmpty(flagPickerServiceImpl.getAllContinentAndCountryDetails()));
	}
	
	@Test
	public void testGetContinentByName() {
		Countries countries = new Countries();
		countries.setName("Nigeria");
		Continent continent = new Continent();
		continent.setContinent("Africa");
		continent.setCountries(Collections.singletonList(countries));
		List<ContinentDetail> continents = new ArrayList<>();
		ContinentDetail continentDetail = new ContinentDetail();
		continent.setContinent("Africa");
		continents.add(continentDetail);
		Mockito.when(continentRepository.findByContinent("Africa")).thenReturn(continent);
		ContinentDetail continentByName = flagPickerServiceImpl.getContinentByName("Africa");
		assertEquals("Africa", continentByName.getContinent());
	}
	
}
