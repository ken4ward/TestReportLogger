package com.mobiquity.nl.idareports.android.controller.status;

import com.mobiquity.nl.idareports.android.model.AStatusFontProperties;
import com.mobiquity.nl.idareports.android.service.status.AIStatusFontProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


@RestController
@RequestMapping( value = "/api/v1/astatusfontproperties")
public class AStatusFontPropertiesController {

    @Autowired
    private AIStatusFontProperties iStatusFontProperties;

    @RequestMapping(method = RequestMethod.GET)
    public Page<AStatusFontProperties> getFontProperties(Pageable pageable) {
        return iStatusFontProperties.listStatusFontProperties(pageable);
    }

    @RequestMapping( method = RequestMethod.POST)
    public AStatusFontProperties save(@RequestBody @Valid AStatusFontProperties statusFontProperties){
        return iStatusFontProperties.save(statusFontProperties);
    }

}
