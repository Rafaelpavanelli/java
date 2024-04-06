package com.example.ayla.xml;

import java.io.*;
import javax.xml.bind.*;
import javax.xml.transform.stream.*;

import com.example.ayla.xml.lista.xmlcep;

public class XmlcepJAXB {
    public static String marshal(Object obj) {
        final StringWriter out = new StringWriter();
        JAXBContext context = null;
        try {
            context = JAXBContext.newInstance(obj.getClass());
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(obj, new StreamResult(out));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return out.toString();
    }

    public static xmlcep unmarshal(Class<?> classe, String stringXml) {
        JAXBContext context = null;
        try {
            context = JAXBContext.newInstance(classe);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            return (xmlcep) unmarshaller.unmarshal(new StreamSource(
                    new StringReader(stringXml)));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }
}
