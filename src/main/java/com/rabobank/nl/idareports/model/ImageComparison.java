package com.rabobank.nl.idareports.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "image_comparisons")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ImageComparison {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "figmaFiles")
    private String figmaFiles;

    @Column(name = "mobileScreenshot")
    private String mobileScreenshot;

    @Column(name = "widthB")
    private int widthB;

    @Column(name = "heightB")
    private int heightB;

    @Column(name = "widthS")
    private int widthS;

    @Column(name = "heightS")
    private int heightS;

    @Column(name = "formattedValue")
    private String formattedValue;
}
