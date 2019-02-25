package com.sell.utils.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.util.Date;

/**
 * @Auther: CRJ
 * @Date: 2019-02-18 16:56
 * @Description:
 */
public class Date2LongSerializer extends JsonSerializer<Date> {
    @Override
    public void serialize(Date date, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
         jsonGenerator.writeNumber(date.getTime() / 1000);
    }
}
