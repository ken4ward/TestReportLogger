package com.mobiquity.nl.idareports.android.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "afont_properties")
public class AFontProperties {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "mobileelement")
    private String mobileElement;

    @Column(name = "width")
    private String width;

    @Column(name = "height")
    private String height;

    @Column(name = "font_family")
    private String fontFamily;

    @Column(name = "font_style")
    private String fontStyle;

    @Column(name = "font_weight")
    private int fontWeight;

    @Column(name = "font_size")
    private int fontSize;

    @Column(name = "line_height")
    private String lineHeight;

    @Column(name = "color")
    private String color;

    @Column(name = "bg_color")
    private String bgColor;

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
