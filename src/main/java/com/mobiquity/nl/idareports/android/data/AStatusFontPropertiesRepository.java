package com.mobiquity.nl.idareports.android.data;

import com.mobiquity.nl.idareports.android.model.AStatusFontProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AStatusFontPropertiesRepository extends JpaRepository<AStatusFontProperties, Long>{
}
