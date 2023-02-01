package com.mobiquity.nl.idareports.android.service;

import com.mobiquity.nl.idareports.android.data.ABackgroundColorRepository;
import com.mobiquity.nl.idareports.android.model.ABackgroundColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class ABackbroundColorService implements AIBackgroundColor {

    @Autowired
    ABackgroundColorRepository backgroundColorRepository;


    @Override
    public Page<ABackgroundColor> listBackgroundColor(Pageable pageable) {
        return backgroundColorRepository.findAll(pageable);
    }

    @Override
    public ABackgroundColor save(ABackgroundColor backgroundColor) {
        ABackgroundColor newBackgroundColor = null;
        newBackgroundColor = backgroundColorRepository.save(backgroundColor);
        if (newBackgroundColor.equals(null)){
            throw new NoSuchElementException("Record not created, please try again");
        }
        return newBackgroundColor;
    }
}
