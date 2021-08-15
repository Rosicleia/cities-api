package com.bootcampdio.rosicleia.citiesapi.countries;

import com.bootcampdio.rosicleia.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country,Long> {
}
