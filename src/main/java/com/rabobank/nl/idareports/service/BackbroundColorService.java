package com.rabobank.nl.idareports.service;

import com.rabobank.nl.idareports.data.BackgroundColorRepository;
import com.rabobank.nl.idareports.model.BackgroundColor;
import com.rabobank.nl.idareports.model.FontProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class BackbroundColorService implements IBackgroundColor{

    @Autowired
    BackgroundColorRepository backgroundColorRepository;


    @Override
    public Page<BackgroundColor> listBackgroundColor(Pageable pageable) {
        return backgroundColorRepository.findAll(pageable);
    }

    @Override
    public BackgroundColor save(BackgroundColor backgroundColor) {
        BackgroundColor newBackgroundColor = null;
        newBackgroundColor = backgroundColorRepository.save(backgroundColor);
        if (newBackgroundColor.equals(null)){
            throw new NoSuchElementException("Record not created, please try again");
        }
        return newBackgroundColor;
    }
}
