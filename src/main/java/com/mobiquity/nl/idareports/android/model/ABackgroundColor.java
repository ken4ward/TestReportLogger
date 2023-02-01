package com.mobiquity.nl.idareports.android.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "abackground_colors")
public class ABackgroundColor {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "mobileelement")
    private String mobileElement;
    @Column(name = "actualvalue")
    private String actualValue;
    @Column(name = "expectedvalue")
    private String expectedValue;
    @Column(name = "status")
    private String status;

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

    public ABackgroundColor() {
    }

    public ABackgroundColor(Long id, String mobileElement, String image, String actualValue, String expectedValue, String status) {
        this.id = id;
        this.mobileElement = mobileElement;
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
                ", actualValue='" + actualValue + '\'' +
                ", expectedValue='" + expectedValue + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
