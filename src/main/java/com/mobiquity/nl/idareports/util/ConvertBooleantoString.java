package com.mobiquity.nl.idareports.util;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class ConvertBooleantoString implements AttributeConverter<Boolean, Character> {
    @Override
    public Character convertToDatabaseColumn(Boolean aBoolean) {
        System.out.println("boolean value" +aBoolean);
        if (aBoolean !=  null){
            if(aBoolean){
                System.out.println("2nd boolean value" +aBoolean);
                return 'Y';
            } else {
                System.out.println("3rd boolean value" +aBoolean);
                return 'N';
            }
        }
        return null;
    }

    @Override
    public Boolean convertToEntityAttribute(Character character) {
        System.out.println("I am called" +character);
        if (character != null){
            System.out.println(" char value" +character);
            return character.equals('Y');
        }
        return null;
    }
}
