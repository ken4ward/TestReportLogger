package com.mobiquity.nl.idareports.android.service.status;

import com.mobiquity.nl.idareports.android.data.AStatusFontPropertiesRepository;
import com.mobiquity.nl.idareports.android.model.AStatusFontProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class AStatusFontPropertiesService implements AIStatusFontProperties {

    @Autowired
    AStatusFontPropertiesRepository statusFontPropertiesRepository;

    @Override
    public Page<AStatusFontProperties> listStatusFontProperties(Pageable pageable) {
        Page<AStatusFontProperties> page = statusFontPropertiesRepository.findAll(pageable);
        return page;
    }

    @Override
    public AStatusFontProperties save(AStatusFontProperties statusFontProperties) {
        AStatusFontProperties newStatusFontProperties = null;
        newStatusFontProperties = statusFontPropertiesRepository.save(statusFontProperties);
        if (newStatusFontProperties.equals(null)){
            throw new NoSuchElementException("Record not created, please try again");
        }
        return newStatusFontProperties;
    }
}
