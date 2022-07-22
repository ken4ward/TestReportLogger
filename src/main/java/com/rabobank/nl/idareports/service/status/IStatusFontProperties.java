package com.rabobank.nl.idareports.service.status;

import com.rabobank.nl.idareports.model.StatusFontProperties;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public interface IStatusFontProperties {
    Page<StatusFontProperties> listStatusFontProperties(Pageable pageable);
    StatusFontProperties save(StatusFontProperties statusFontProperties);
}
