package com.mobiquity.nl.idareports.android.service;

import com.mobiquity.nl.idareports.android.model.ABackgroundColor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public interface AIBackgroundColor {
    Page<ABackgroundColor> listBackgroundColor(Pageable pageable);
    ABackgroundColor save(ABackgroundColor backgroundColor);
}
