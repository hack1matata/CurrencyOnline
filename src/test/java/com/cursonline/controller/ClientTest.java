package com.cursonline.controller;

import com.cursonline.model.ValCurs;
import org.junit.Test;

import javax.xml.bind.JAXBException;
import java.net.MalformedURLException;

public class ClientTest {

    @Test
    public void test() throws MalformedURLException, JAXBException {
        Client client = new Client();
        ValCurs curs = client.readXML("https://www.bnm.md/ro/official_exchange_rates?get_xml=1&date=25.06.2018");
//        System.out.println(curs.getCurrencies().size());

        String str = "";
    }
}
