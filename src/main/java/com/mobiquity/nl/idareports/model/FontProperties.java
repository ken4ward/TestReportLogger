package com.mobiquity.nl.idareports.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

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

    @Column(name = "created")
    private LocalDateTime created;

    @Column(name = "currentBasePackage")
    private String currentBasePackage;

    @Column(name = "currentPackage")
    private String currentPackage;

    @Column(name = "currentClass")
    private String currentClass;

    @Column(name = "currentMethod")
    private String currentMethod;
}
