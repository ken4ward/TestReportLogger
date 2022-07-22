package com.rabobank.nl.idareports.model;

import javax.persistence.*;

@Entity
@Table(name = "background_colors")
public class BackgroundColor {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "mobileelement")
    private String mobileElement;

    @Column(name = "image")
    private String image;

    @Column(name = "actualvalue")
    private String actualValue;

    @Column(name = "expectedvalue")
    private String expectedValue;

    @Column(name = "status")
    private String status;

    public BackgroundColor() {
    }

    public BackgroundColor(Long id, String mobileElement, String image, String actualValue, String expectedValue, String status) {
        this.id = id;
        this.mobileElement = mobileElement;
        this.image = image;
        this.actualValue = actualValue;
        this.expectedValue = expectedValue;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMobileElement() {
        return mobileElement;
    }

    public void setMobileElement(String mobileElement) {
        this.mobileElement = mobileElement;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getActualValue() {
        return actualValue;
    }

    public void setActualValue(String actualValue) {
        this.actualValue = actualValue;
    }

    public String getExpectedValue() {
        return expectedValue;
    }

    public void setExpectedValue(String expectedValue) {
        this.expectedValue = expectedValue;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "BackgroundColor{" +
                "id=" + id +
                ", mobileElement='" + mobileElement + '\'' +
                ", image='" + image + '\'' +
                ", actualValue='" + actualValue + '\'' +
                ", expectedValue='" + expectedValue + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
