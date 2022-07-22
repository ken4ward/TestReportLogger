package com.rabobank.nl.idareports.service;

import com.rabobank.nl.idareports.model.ImageComparison;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public interface IImageComparison {
    Page<ImageComparison> listImageComparison(Pageable pageable);
    ImageComparison save(ImageComparison imageComparison);
}
