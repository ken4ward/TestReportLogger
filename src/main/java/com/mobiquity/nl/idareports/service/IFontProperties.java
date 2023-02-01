package com.mobiquity.nl.idareports.service;

import com.mobiquity.nl.idareports.model.FontProperties;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public interface IFontProperties {
    Page<FontProperties> listFontProperties(Pageable pageable);
    FontProperties save(FontProperties fontProperties);

    void truncateFontPropertyTable();
    void createFontPropertyTable();
}
