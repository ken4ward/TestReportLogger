package com.mobiquity.nl.idareports.service;

import com.mobiquity.nl.idareports.data.ImageComparisonRepository;
import com.mobiquity.nl.idareports.model.ImageComparison;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ImageComprisonService implements IImageComparison {

    @Autowired
    ImageComparisonRepository imageComparisonRepository;

    @Override
    public Page<ImageComparison> listImageComparison(Pageable pageable) {
        return imageComparisonRepository.findAll(pageable);
    }

    @Override
    public ImageComparison save(ImageComparison imageComparison) {
        ImageComparison newImageComparison = null;
        newImageComparison = imageComparisonRepository.save(imageComparison);
        return newImageComparison;
    }
}
