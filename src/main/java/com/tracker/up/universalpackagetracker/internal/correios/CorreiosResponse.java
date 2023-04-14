package com.tracker.up.universalpackagetracker.internal.correios;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tracker.up.universalpackagetracker.internal.correios.payload.request.CorreiosEvents;

public class CorreiosResponse {

  @JsonProperty("codigo")
  private String code;
  
  private String host;
  
  @JsonProperty("eventos")
  private List<CorreiosEvents> events;
  
  @JsonProperty("hora")
  private double time;

  @JsonProperty("quantidade")
  private int amount;
  
  @JsonProperty("servico")
  private String service;

  @JsonProperty("ultimo")
  private String latest;

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public List<CorreiosEvents> getEvents() {
    return events;
  }

  public void setEvents(List<CorreiosEvents> events) {
    this.events = events;
  }

  public double getTime() {
    return time;
  }

  public void setTime(double time) {
    this.time = time;
  }

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public String getService() {
    return service;
  }

  public void setService(String service) {
    this.service = service;
  }

  public String getLatest() {
    return latest;
  }

  public void setLatest(String latest) {
    this.latest = latest;
  }
}
