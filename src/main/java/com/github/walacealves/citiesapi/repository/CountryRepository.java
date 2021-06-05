package com.github.walacealves.citiesapi.repository;

import com.github.walacealves.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
