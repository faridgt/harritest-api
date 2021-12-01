package dev.harritest.api.apicountries.countries;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CountryRepository extends PagingAndSortingRepository<Country, Integer>, JpaRepository<Country, Integer>{

}
