package com.example.springboot_manytomany_ver2.customserializer;

import com.example.springboot_manytomany_ver2.entity.Book_Pulisher;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CustomBookPublisherSerializer extends StdSerializer<List<Book_Pulisher>> {
    public CustomBookPublisherSerializer() {
        this(null);
    }

    public CustomBookPublisherSerializer(Class<List<Book_Pulisher>> t) {
        super(t);
    }

    @Override
    public void serialize(List<Book_Pulisher> book_pulishers, JsonGenerator jsonGenerator, SerializerProvider serializerProvider)
            throws IOException {
        List<WriteCustom> customList = new ArrayList<>();
        for (Book_Pulisher bookPulisher : book_pulishers) {
            WriteCustom writeCustom = new WriteCustom();
            writeCustom.setId(bookPulisher.getId());
            customList.add(writeCustom);
        }
        jsonGenerator.writeObject(customList);
    }
}
