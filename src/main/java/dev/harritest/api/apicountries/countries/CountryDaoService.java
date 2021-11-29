package dev.harritest.api.apicountries.countries;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;


@Component
public class CountryDaoService {
	static private List<Country> countries=new ArrayList<>();
			static {
				countries.add(new Country("AF", "AS", "Afghanistan", "AFG", "004", "Islamic Republic of Afghanistan"));
				countries.add(new Country ("AX", "EU", "Åland Islands", "ALA", "248", "Åland Islands"));
				countries.add(new Country ("AL", "EU", "Albania", "ALB", "008", "Republic of Albania"));
				countries.add(new Country ("AO", "AF", "Angola", "AGO", "024", "Republic of Angola"));
				countries.add(new Country ("DZ", "AF", "Algeria", "DZA", "012", "People\"s Democratic Republic of Algeria"));
				countries.add(new Country ("AS", "OC", "American Samoa", "ASM", "016", "American Samoa"));
				countries.add(new Country ("AD", "EU", "Andorra", "AND", "020", "Principality of Andorra"));

				
			}

			public List<Country> findAll() {
				return countries;
			}

			public Country save(Country country) {
				countries.add(country);
				return country;
			}

			public Country findOne(String code) {
				for (Country country : countries) {
					if (country.getCode() == code) {
						return country;
					}
				}
				return null;
			}



}
