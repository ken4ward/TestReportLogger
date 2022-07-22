package com.rabobank.nl.idareports.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.rabobank.nl.idareports.util.BooleanEnum;
import com.rabobank.nl.idareports.util.ConvertBooleantoString;
import com.rabobank.nl.idareports.util.TrueFalseBooleanSerializer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "font_properties")
public class FontProperties {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "mobileelement")
    private String mobileElement;

    @Column(name = "savereadfile")
    private String saveReadFile;

    @Column(name = "uifontname")
    private String uiFontName;

    @Column(name = "bold")
    private boolean bold;

    @Column(name = "italic")
    private boolean italic;

    @Column(name = "underline")
    private boolean underline;

    @Column(name = "monospace")
    private boolean monospace;

    @Column(name = "serif")
    private boolean serif;

    @Column(name = "smallcaps")
    private boolean smallcaps;

    @Column(name = "pointsize")
    private int pointSize;
}
