package com.rabobank.nl.idareports.controller;

import com.rabobank.nl.idareports.model.FontProperties;
import com.rabobank.nl.idareports.service.IFontProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping( value = "/api/v1/fontproperties")
public class FontPropertiesController {

    @Autowired
    private IFontProperties iFontProperties;

    @RequestMapping(method = RequestMethod.GET)
    public Page<FontProperties> getFontProperties(Pageable pageable) {
        return iFontProperties.listFontProperties(pageable);
    }

    @RequestMapping( method = RequestMethod.POST)
    public FontProperties save(@RequestBody @Valid FontProperties fontProperties){
        return iFontProperties.save(fontProperties);
    }

}
