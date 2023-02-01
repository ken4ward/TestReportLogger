package com.mobiquity.nl.idareports.android.controller;

import com.mobiquity.nl.idareports.android.model.AImageComparison;
import com.mobiquity.nl.idareports.android.service.AIImageComparison;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping( value = "/api/v1/android/imagecomparison")
public class AImageComparisonController {

    @Autowired
    private AIImageComparison AIImageComparison;

    @RequestMapping(method = RequestMethod.GET)
    public Page<AImageComparison> getImageComparison(Pageable pageable) {
        return AIImageComparison.listImageComparison(pageable);
    }

    @RequestMapping( method = RequestMethod.POST)
    public AImageComparison save(@RequestBody @Valid AImageComparison AImageComparison){
        return AIImageComparison.save(AImageComparison);
    }

}
