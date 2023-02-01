package com.mobiquity.nl.idareports.service;

import com.mobiquity.nl.idareports.model.ImageComparison;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public interface IImageComparison {
    Page<ImageComparison> listImageComparison(Pageable pageable);
    ImageComparison save(ImageComparison imageComparison);
}
