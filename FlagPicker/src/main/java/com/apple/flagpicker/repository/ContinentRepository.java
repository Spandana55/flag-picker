package com.apple.flagpicker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.apple.flagpicker.entity.Continent;

@Repository
public interface ContinentRepository extends JpaRepository<Continent, Long> {

	Continent findByContinent(@Param("continent") String continentName);

}
