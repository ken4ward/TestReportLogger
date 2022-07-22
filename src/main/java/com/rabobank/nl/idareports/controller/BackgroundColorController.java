package com.rabobank.nl.idareports.controller;

import com.rabobank.nl.idareports.model.BackgroundColor;
import com.rabobank.nl.idareports.service.IBackgroundColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping( value = "/api/v1/backgroundcolor")
public class BackgroundColorController {

    @Autowired
    private IBackgroundColor iBackgroundColor;

    @RequestMapping(method = RequestMethod.GET)
    public Page<BackgroundColor> getBackgroundColor(Pageable pageable) {
        return iBackgroundColor.listBackgroundColor(pageable);
    }

    @RequestMapping( method = RequestMethod.POST)
    public BackgroundColor save(@RequestBody @Valid BackgroundColor backgroundcolor){
        return iBackgroundColor.save(backgroundcolor);
    }

}
