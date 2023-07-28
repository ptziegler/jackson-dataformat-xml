package test;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class Main {
    public static void main(String[] args) throws JacksonException {
        String xmlFile = """
            <example xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
                <metaData>
                    <data key="MadeWith">Created with XXX</data>
                    <data key="Version">12345</data>
                </metaData>
            </example>
            """;
        XmlMapper objectMapper = new XmlMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        Example example = objectMapper.readValue(xmlFile, Example.class);
        System.out.println(example.metaData);
    }
}
