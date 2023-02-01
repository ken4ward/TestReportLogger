package com.mobiquity.nl.idareports.android.service;

import com.mobiquity.nl.idareports.android.model.AFontProperties;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public interface AIFontProperties {
    Page<AFontProperties> listFontProperties(Pageable pageable);
    AFontProperties save(AFontProperties AFontProperties);

    void truncateFontPropertyTable();
    void createFontPropertyTable();
}
