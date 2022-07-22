package com.rabobank.nl.idareports.service;

import com.rabobank.nl.idareports.model.FontProperties;
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
