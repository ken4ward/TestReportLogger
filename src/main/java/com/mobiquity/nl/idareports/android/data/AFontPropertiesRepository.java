package com.mobiquity.nl.idareports.android.data;

import com.mobiquity.nl.idareports.android.model.AFontProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AFontPropertiesRepository extends JpaRepository<AFontProperties, Long> {
    @Modifying
    @Query(value = "truncate table font_properties", nativeQuery = true)
    void truncateFontPropertyTable();

    @Modifying
    @Query(value = "create table font_properties if not exists", nativeQuery = true)
    void createFontPropertyTable();
}
