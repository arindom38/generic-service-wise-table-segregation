package com.test.genericservicewisetable.utill;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;

public class CustomLocalDateTimeDeserializer extends StdDeserializer<LocalDateTime> {

    protected CustomLocalDateTimeDeserializer() {
        this(null);
    }

    protected CustomLocalDateTimeDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public LocalDateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)
            throws IOException, JsonProcessingException {
        String str = jsonParser.getText();
        try {
            return LocalDateTime.parse(str, CustomLocalDateTimeSerializer.formatter);
        } catch (DateTimeParseException e) {
            System.err.println(e);
            return null;
        }
    }
}
