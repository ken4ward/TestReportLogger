package com.mobiquity.nl.idareports.service;

import com.mobiquity.nl.idareports.data.BackgroundColorRepository;
import com.mobiquity.nl.idareports.model.BackgroundColor;
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
