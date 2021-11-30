package dev.harritest.api.apicountries.countries;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContinentRepository extends PagingAndSortingRepository<Continent, Integer>, JpaRepository<Continent, Integer>{

}
