package com.rabobank.nl.idareports.controller;

import com.rabobank.nl.idareports.model.FontProperties;
import com.rabobank.nl.idareports.model.ImageComparison;
import com.rabobank.nl.idareports.service.IImageComparison;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping( value = "/api/v1/imagecomparison")
public class ImageComparisonController {

    @Autowired
    private IImageComparison iImageComparison;

    @RequestMapping(method = RequestMethod.GET)
    public Page<ImageComparison> getImageComparison(Pageable pageable) {
        return iImageComparison.listImageComparison(pageable);
    }

    @RequestMapping( method = RequestMethod.POST)
    public ImageComparison save(@RequestBody @Valid ImageComparison imageComparison){
        return iImageComparison.save(imageComparison);
    }

}
