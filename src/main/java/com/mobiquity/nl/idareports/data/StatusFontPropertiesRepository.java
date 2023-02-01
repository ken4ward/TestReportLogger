package com.mobiquity.nl.idareports.data;

import com.mobiquity.nl.idareports.model.StatusFontProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusFontPropertiesRepository extends JpaRepository<StatusFontProperties, Long>{
}
