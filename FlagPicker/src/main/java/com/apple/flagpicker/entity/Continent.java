package com.apple.flagpicker.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Table(name = "continent")
@Entity
public class Continent implements Serializable {

	private static final long serialVersionUID = 8659152170704777087L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "continent_id")
	private long continentId;

	@Column(name = "continent")
	private String continent;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="continent", referencedColumnName="continent")
	private List<Countries> countries = null;
	
	public Continent(){	
	}
	
	public long getContinentId() {
		return continentId;
	}

	public void setContinentId(long continentId) {
		this.continentId = continentId;
	}


	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}
	
	public List<Countries> getCountries() {
		return countries;
	}

	public void setCountries(List<Countries> countries) {
		this.countries = countries;
	}
}