package com.rabobank.nl.idareports.data;


import com.rabobank.nl.idareports.model.BackgroundColor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BackgroundColorRepository extends JpaRepository<BackgroundColor, Long> {
}
