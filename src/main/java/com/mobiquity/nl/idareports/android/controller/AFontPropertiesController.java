package com.mobiquity.nl.idareports.android.controller;

import com.mobiquity.nl.idareports.android.model.AFontProperties;
import com.mobiquity.nl.idareports.android.service.AIFontProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping( value = "/api/v1/android/fontproperties")
public class AFontPropertiesController {

    @Autowired
    private AIFontProperties AIFontProperties;

    @RequestMapping(method = RequestMethod.GET)
    public Page<AFontProperties> getFontProperties(Pageable pageable) {
        return AIFontProperties.listFontProperties(pageable);
    }

    @RequestMapping( method = RequestMethod.POST)
    public AFontProperties save(@RequestBody @Valid AFontProperties AFontProperties){
        return AIFontProperties.save(AFontProperties);
    }

}
