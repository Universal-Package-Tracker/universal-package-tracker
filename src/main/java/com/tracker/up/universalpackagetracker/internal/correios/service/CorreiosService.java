package com.tracker.up.universalpackagetracker.internal.correios.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.tracker.up.universalpackagetracker.internal.correios.CorreiosResponse;

@Service
public class CorreiosService {

  private final RestTemplate restTemplate;

  public CorreiosService(RestTemplate restTemplate) {
    this.restTemplate = restTemplate;
  }

  @Value("${correios.api.url}")
  private String apiUrl;

  @Value("${correios.api.user}")
  private String apiUser;

  @Value("${correios.api.token}")
  private String apiToken;

  public CorreiosResponse consultar(String codigo) {
    String url = apiUrl + "?user=" + apiUser + "&token=" + apiToken + "&codigo=" + codigo;

    ResponseEntity<CorreiosResponse> response = restTemplate.getForEntity(
        url,
        CorreiosResponse.class);

    return response.getBody();
  }
}
