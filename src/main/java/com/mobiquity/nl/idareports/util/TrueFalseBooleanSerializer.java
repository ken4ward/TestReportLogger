package com.mobiquity.nl.idareports.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class TrueFalseBooleanSerializer extends JsonSerializer<Boolean> {
    @Override
    public void serialize(Boolean aBoolean, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        System.out.println("I am never called");
        jsonGenerator.writeString(aBoolean ? "Y" : "N");
    }
}
