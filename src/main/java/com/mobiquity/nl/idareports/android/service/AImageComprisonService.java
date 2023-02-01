package com.mobiquity.nl.idareports.android.service;

import com.mobiquity.nl.idareports.android.data.AImageComparisonRepository;
import com.mobiquity.nl.idareports.android.model.AImageComparison;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class AImageComprisonService implements AIImageComparison {

    @Autowired
    AImageComparisonRepository imageComparisonRepository;

    @Override
    public Page<AImageComparison> listImageComparison(Pageable pageable) {
        return imageComparisonRepository.findAll(pageable);
    }

    @Override
    public AImageComparison save(AImageComparison AImageComparison) {
        AImageComparison newAImageComparison = null;
        newAImageComparison = imageComparisonRepository.save(AImageComparison);
        return newAImageComparison;
    }
}
