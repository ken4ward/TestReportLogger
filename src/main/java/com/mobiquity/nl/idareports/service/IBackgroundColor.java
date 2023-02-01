package com.mobiquity.nl.idareports.service;

import com.mobiquity.nl.idareports.model.BackgroundColor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public interface IBackgroundColor {
    Page<BackgroundColor> listBackgroundColor(Pageable pageable);
    BackgroundColor save(BackgroundColor backgroundColor);
}
