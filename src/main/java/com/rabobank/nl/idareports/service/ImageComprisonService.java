package com.rabobank.nl.idareports.service;

import com.rabobank.nl.idareports.data.ImageComparisonRepository;
import com.rabobank.nl.idareports.model.FontProperties;
import com.rabobank.nl.idareports.model.ImageComparison;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

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
