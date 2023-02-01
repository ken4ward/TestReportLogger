package com.mobiquity.nl.idareports.data;

import com.mobiquity.nl.idareports.model.ImageComparison;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageComparisonRepository extends JpaRepository<ImageComparison, Long> {
}
