package com.apple.flagpicker.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.apple.flagpicker.entity.Countries;

public interface CountriesRepository extends CrudRepository<Countries, Long>{

	/* List<Countries> findByContinent(String continent); */
	
}
