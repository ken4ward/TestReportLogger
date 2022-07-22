package com.rabobank.nl.idareports.data;

import com.rabobank.nl.idareports.model.FontProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FontPropertiesRepository extends JpaRepository<FontProperties, Long> {
    @Modifying
    @Query(value = "truncate table font_properties", nativeQuery = true)
    void truncateFontPropertyTable();

    @Modifying
    @Query(value = "create table font_properties if not exists", nativeQuery = true)
    void createFontPropertyTable();
}
