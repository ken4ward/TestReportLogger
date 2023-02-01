package com.mobiquity.nl.idareports.android.controller;

import com.mobiquity.nl.idareports.android.model.ABackgroundColor;
import com.mobiquity.nl.idareports.android.service.AIBackgroundColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping( value = "/api/v1/android/backgroundcolor")
public class ABackgroundColorController {

    @Autowired
    private AIBackgroundColor AIBackgroundColor;

    @RequestMapping(method = RequestMethod.GET)
    public Page<ABackgroundColor> getBackgroundColor(Pageable pageable) {
        return AIBackgroundColor.listBackgroundColor(pageable);
    }

    @RequestMapping( method = RequestMethod.POST)
    public ABackgroundColor save(@RequestBody @Valid ABackgroundColor backgroundcolor){
        return AIBackgroundColor.save(backgroundcolor);
    }

}
