package com.rabobank.nl.idareports.data;

import com.rabobank.nl.idareports.model.StatusFontProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusFontPropertiesRepository extends JpaRepository<StatusFontProperties, Long>{
}
