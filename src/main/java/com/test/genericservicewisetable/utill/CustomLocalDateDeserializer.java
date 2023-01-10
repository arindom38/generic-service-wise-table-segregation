package com.test.genericservicewisetable.utill;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class CustomLocalDateDeserializer extends StdDeserializer<LocalDate> {

    protected CustomLocalDateDeserializer() {
        this(null);
    }

    protected CustomLocalDateDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public LocalDate deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        String str = jsonParser.getText();
        try {
            return LocalDate.parse(str, CustomLocalDateSerializer.formatter);
        } catch (DateTimeParseException e) {
            System.err.println(e);
            return null;
        }
    }
}
