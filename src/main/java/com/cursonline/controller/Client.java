package com.cursonline.controller;

import com.cursonline.model.ValCurs;
import com.cursonline.model.Valute;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Locale;

public class Client {
    public ValCurs readXML(String urlStr) throws MalformedURLException, JAXBException {
        ValCurs curencies = null;
        try {
            JAXBContext jaxbContext  = JAXBContext.newInstance(ValCurs.class);
            URL url = new URL(urlStr);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            curencies = (ValCurs) jaxbUnmarshaller.unmarshal(url);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return curencies;
    }
}
