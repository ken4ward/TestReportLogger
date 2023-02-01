package com.mobiquity.nl.idareports.android.data;


import com.mobiquity.nl.idareports.android.model.ABackgroundColor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ABackgroundColorRepository extends JpaRepository<ABackgroundColor, Long> {
}
