package com.mobiquity.nl.idareports.android.service;

import com.mobiquity.nl.idareports.android.data.AFontPropertiesRepository;
import com.mobiquity.nl.idareports.android.model.AFontProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.NoSuchElementException;

@Service
public class AFontPropertiesService implements AIFontProperties {

    @Autowired
    AFontPropertiesRepository fontPropertiesRepository;

    @Override
    public Page<AFontProperties> listFontProperties(Pageable pageable) {
        return fontPropertiesRepository.findAll(pageable);
    }

    @Override
    public AFontProperties save(AFontProperties AFontProperties) {
        AFontProperties newAFontProperties = null;
        newAFontProperties = fontPropertiesRepository.save(AFontProperties);
        if (newAFontProperties.equals(null)){
            throw new NoSuchElementException("Record not created, please try again");
        }
        return newAFontProperties;
    }

    @Override
    @Transactional
    public void truncateFontPropertyTable() {
        fontPropertiesRepository.truncateFontPropertyTable();
    }

    @Override
    @Transactional
    public void createFontPropertyTable() {
        fontPropertiesRepository.createFontPropertyTable();
    }


}
