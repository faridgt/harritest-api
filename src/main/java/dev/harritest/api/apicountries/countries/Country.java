package dev.harritest.api.apicountries.countries;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;



//@Entity
public class Country {

	
	@Id
	@GeneratedValue
	private int id;
	
	@Size(min=2, message="Name should have atleast 2 characters")
	private String code;

	private String name;
	private String fullName;
	private String iso3;
	private String number;
	private  String continentCode;

	@ManyToOne(fetch=FetchType.LAZY)
	@JsonIgnore
	private Continent continent;





public Country() {
	
}

public Country(@Size(min = 2, message = "Name should have atleast 2 characters") String code, String name, String fullName, String iso3, String number, String continentCode) {
	super();
	this.code = code;
	this.name = name;
	this.fullName = fullName;
	this.iso3 = iso3;
	this.number = number;
	this.continentCode = continentCode;
}

public Country(@Size(min = 2, message = "Name should have atleast 2 characters") String code, String name,
		String fullName, String iso3, String number, String continentCode, Continent continent) {
	super();
	this.code = code;
	this.name = name;
	this.fullName = fullName;
	this.iso3 = iso3;
	this.number = number;
	this.continentCode = continentCode;
	this.continent = continent;
}

public String getCode() {
	return code;
}

public void setCode(String code) {
	this.code = code;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getFullName() {
	return fullName;
}

public void setFullName(String fullName) {
	this.fullName = fullName;
}

public String getIso3() {
	return iso3;
}

public void setIso3(String iso3) {
	this.iso3 = iso3;
}

public String getNumber() {
	return number;
}

public void setNumber(String number) {
	this.number = number;
}

public String getContinentCode() {
	return continentCode;
}

public void setContinentCode(String continentCode) {
	this.continentCode = continentCode;
}

public Continent getContinent() {
	return continent;
}

public void setContinent(Continent continent) {
	this.continent = continent;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}


}