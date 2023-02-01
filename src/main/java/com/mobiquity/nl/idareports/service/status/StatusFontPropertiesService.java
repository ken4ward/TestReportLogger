package com.mobiquity.nl.idareports.service.status;

import com.mobiquity.nl.idareports.data.StatusFontPropertiesRepository;
import com.mobiquity.nl.idareports.model.StatusFontProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class StatusFontPropertiesService implements IStatusFontProperties{

    @Autowired
    StatusFontPropertiesRepository statusFontPropertiesRepository;

    @Override
    public Page<StatusFontProperties> listStatusFontProperties(Pageable pageable) {
        Page<StatusFontProperties> page = statusFontPropertiesRepository.findAll(pageable);
        return page;
    }

    @Override
    public StatusFontProperties save(StatusFontProperties statusFontProperties) {
        StatusFontProperties newStatusFontProperties = null;
        newStatusFontProperties = statusFontPropertiesRepository.save(statusFontProperties);
        if (newStatusFontProperties.equals(null)){
            throw new NoSuchElementException("Record not created, please try again");
        }
        return newStatusFontProperties;
    }
}
