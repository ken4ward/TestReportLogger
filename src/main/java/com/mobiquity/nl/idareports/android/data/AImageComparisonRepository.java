package com.mobiquity.nl.idareports.android.data;

import com.mobiquity.nl.idareports.android.model.AImageComparison;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AImageComparisonRepository extends JpaRepository<AImageComparison, Long> {
}
