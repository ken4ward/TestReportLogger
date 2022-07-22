package com.rabobank.nl.idareports.service;

import com.rabobank.nl.idareports.data.FontPropertiesRepository;
import com.rabobank.nl.idareports.model.FontProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.NoSuchElementException;

@Service
public class FontPropertiesService implements IFontProperties{

    @Autowired
    FontPropertiesRepository fontPropertiesRepository;

    @Override
    public Page<FontProperties> listFontProperties(Pageable pageable) {
        return fontPropertiesRepository.findAll(pageable);
    }

    @Override
    public FontProperties save(FontProperties fontProperties) {
        FontProperties newFontProperties = null;
        newFontProperties = fontPropertiesRepository.save(fontProperties);
        if (newFontProperties.equals(null)){
            throw new NoSuchElementException("Record not created, please try again");
        }
        return newFontProperties;
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
