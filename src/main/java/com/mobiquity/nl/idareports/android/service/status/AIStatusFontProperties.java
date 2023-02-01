package com.mobiquity.nl.idareports.android.service.status;

import com.mobiquity.nl.idareports.android.model.AStatusFontProperties;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public interface AIStatusFontProperties {
    Page<AStatusFontProperties> listStatusFontProperties(Pageable pageable);
    AStatusFontProperties save(AStatusFontProperties statusFontProperties);
}
