package com.tracker.up.universalpackagetracker.internal.jadlog.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JadlogController {
    public static List<Map<String, String>> jadlog(String trackingCode) throws IOException {
        String url = "http://www.jadlog.com.br/siteInstitucional/tracking_dev.jad";
        Document doc = Jsoup.connect(url).data("cte", trackingCode).get();
        Elements trs = doc.select("tr");
        List<Map<String, String>> events = new ArrayList<>();
        String[] keys = { "data/hora", "origem", "status", "destino", "documento" };
        for (Element tr : trs.subList(1, trs.size())) {
            Elements tds = tr.select("td");
            if (tds.size() == 5) {
                Map<String, String> event = new HashMap<>();
                for (int i = 0; i < keys.length; i++) {
                    event.put(keys[i], tds.get(i).text().trim());
                }
                events.add(event);
            }
        }
        return events;
    }
}
