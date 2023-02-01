package com.mobiquity.nl.idareports.model;

import com.mobiquity.nl.idareports.util.ConvertBooleantoString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "status_font_properties")
public class StatusFontProperties {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "mobileelement")
    private String mobileElement;

    @Column(name = "savereadfile")
    private String saveReadFile;

    @Column(name = "uifontname")
    private String uiFontName;

    @Convert(converter= ConvertBooleantoString.class)
    @Column(name = "bold")
    private boolean bold;

    @Convert(converter= ConvertBooleantoString.class)
    @Column(name = "italic")
    private boolean italic;

    @Convert(converter= ConvertBooleantoString.class)
    @Column(name = "underline")
    private boolean underline;

    @Convert(converter= ConvertBooleantoString.class)
    @Column(name = "monospace")
    private boolean monospace;

    @Convert(converter= ConvertBooleantoString.class)
    @Column(name = "serif")
    private boolean serif;

    @Convert(converter= ConvertBooleantoString.class)
    @Column(name = "smallcaps")
    private boolean smallcaps;

    @Column(name = "pointsize")
    private int pointSize;

    @Column(name = "uifontnames")
    private String uiFontNameS;

    @Convert(converter= ConvertBooleantoString.class)
    @Column(name = "bolds")
    private boolean boldS;

    @Convert(converter= ConvertBooleantoString.class)
    @Column(name = "italics")
    private boolean italicS;

    @Convert(converter= ConvertBooleantoString.class)
    @Column(name = "underlines")
    private boolean underlineS;

    @Convert(converter= ConvertBooleantoString.class)
    @Column(name = "monospaces")
    private boolean monospaceS;

    @Convert(converter= ConvertBooleantoString.class)
    @Column(name = "serifs")
    private boolean serifS;

    @Convert(converter= ConvertBooleantoString.class)
    @Column(name = "smallcapss")
    private boolean smallcapsS;

    @Convert(converter= ConvertBooleantoString.class)
    @Column(name = "pointsizes")
    private int pointSizeS;

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

    public StatusFontProperties() {
    }

    public StatusFontProperties(long id, String mobileElement, String saveReadFile, String uiFontName, boolean bold, boolean italic, boolean underline, boolean monospace, boolean serif, boolean smallcaps, int pointSize, String uiFontNameS, boolean boldS, boolean italicS, boolean underlineS, boolean monospaceS, boolean serifS, boolean smallcapsS, int pointSizeS) {
        this.id = id;
        this.mobileElement = mobileElement;
        this.saveReadFile = saveReadFile;
        this.uiFontName = uiFontName;
        this.bold = bold;
        this.italic = italic;
        this.underline = underline;
        this.monospace = monospace;
        this.serif = serif;
        this.smallcaps = smallcaps;
        this.pointSize = pointSize;
        this.uiFontNameS = uiFontNameS;
        this.boldS = boldS;
        this.italicS = italicS;
        this.underlineS = underlineS;
        this.monospaceS = monospaceS;
        this.serifS = serifS;
        this.smallcapsS = smallcapsS;
        this.pointSizeS = pointSizeS;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMobileElement() {
        return mobileElement;
    }

    public void setMobileElement(String mobileElement) {
        this.mobileElement = mobileElement;
    }

    public String getSaveReadFile() {
        return saveReadFile;
    }

    public void setSaveReadFile(String saveReadFile) {
        this.saveReadFile = saveReadFile;
    }

    public String getUiFontName() {
        return uiFontName;
    }

    public void setUiFontName(String uiFontName) {
        this.uiFontName = uiFontName;
    }

    public boolean isBold() {
        return bold;
    }

    public void setBold(boolean bold) {
        this.bold = bold;
    }

    public boolean isItalic() {
        return italic;
    }

    public void setItalic(boolean italic) {
        this.italic = italic;
    }

    public boolean isUnderline() {
        return underline;
    }

    public void setUnderline(boolean underline) {
        this.underline = underline;
    }

    public boolean isMonospace() {
        return monospace;
    }

    public void setMonospace(boolean monospace) {
        this.monospace = monospace;
    }

    public boolean isSerif() {
        return serif;
    }

    public void setSerif(boolean serif) {
        this.serif = serif;
    }

    public boolean isSmallcaps() {
        return smallcaps;
    }

    public void setSmallcaps(boolean smallcaps) {
        this.smallcaps = smallcaps;
    }

    public int getPointSize() {
        return pointSize;
    }

    public void setPointSize(int pointSize) {
        this.pointSize = pointSize;
    }

    public String getUiFontNameS() {
        return uiFontNameS;
    }

    public void setUiFontNameS(String uiFontNameS) {
        this.uiFontNameS = uiFontNameS;
    }

    public boolean isBoldS() {
        return boldS;
    }

    public void setBoldS(boolean boldS) {
        this.boldS = boldS;
    }

    public boolean isItalicS() {
        return italicS;
    }

    public void setItalicS(boolean italicS) {
        this.italicS = italicS;
    }

    public boolean isUnderlineS() {
        return underlineS;
    }

    public void setUnderlineS(boolean underlineS) {
        this.underlineS = underlineS;
    }

    public boolean isMonospaceS() {
        return monospaceS;
    }

    public void setMonospaceS(boolean monospaceS) {
        this.monospaceS = monospaceS;
    }

    public boolean isSerifS() {
        return serifS;
    }

    public void setSerifS(boolean serifS) {
        this.serifS = serifS;
    }

    public boolean isSmallcapsS() {
        return smallcapsS;
    }

    public void setSmallcapsS(boolean smallcapsS) {
        this.smallcapsS = smallcapsS;
    }

    public int getPointSizeS() {
        return pointSizeS;
    }

    public void setPointSizeS(int pointSizeS) {
        this.pointSizeS = pointSizeS;
    }

    @Override
    public String toString() {
        return "StatusFontProperties{" +
                "id=" + id +
                ", mobileElement='" + mobileElement + '\'' +
                ", saveReadFile='" + saveReadFile + '\'' +
                ", uiFontName='" + uiFontName + '\'' +
                ", bold=" + bold +
                ", italic=" + italic +
                ", underline=" + underline +
                ", monospace=" + monospace +
                ", serif=" + serif +
                ", smallcaps=" + smallcaps +
                ", pointSize=" + pointSize +
                ", uiFontNameS='" + uiFontNameS + '\'' +
                ", boldS=" + boldS +
                ", italicS=" + italicS +
                ", underlineS=" + underlineS +
                ", monospaceS=" + monospaceS +
                ", serifS=" + serifS +
                ", smallcapsS=" + smallcapsS +
                ", pointSizeS=" + pointSizeS +
                '}';
    }
}
