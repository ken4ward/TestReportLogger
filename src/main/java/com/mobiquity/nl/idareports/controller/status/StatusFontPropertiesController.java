package com.mobiquity.nl.idareports.controller.status;

import com.mobiquity.nl.idareports.model.StatusFontProperties;
import com.mobiquity.nl.idareports.service.status.IStatusFontProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


@RestController
@RequestMapping( value = "/api/v1/statusfontproperties")
public class StatusFontPropertiesController {

    @Autowired
    private IStatusFontProperties iStatusFontProperties;

    @RequestMapping(method = RequestMethod.GET)
    public Page<StatusFontProperties> getFontProperties(Pageable pageable) {
        return iStatusFontProperties.listStatusFontProperties(pageable);
    }

    @RequestMapping( method = RequestMethod.POST)
    public StatusFontProperties save(@RequestBody @Valid StatusFontProperties statusFontProperties){
        return iStatusFontProperties.save(statusFontProperties);
    }

}
