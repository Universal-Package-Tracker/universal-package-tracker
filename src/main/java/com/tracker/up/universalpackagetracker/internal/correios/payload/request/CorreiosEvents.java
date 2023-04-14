package com.tracker.up.universalpackagetracker.internal.correios.payload.request;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CorreiosEvents {

  @JsonProperty("data")
  private String date;

  @JsonProperty("hora")
  private String time;

  @JsonProperty("local")
  private String place;
  
  private String status;
  private List<String> subStatus;

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public String getPlace() {
    return place;
  }

  public void setPlace(String place) {
    this.place = place;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public List<String> getSubStatus() {
    return subStatus;
  }

  public void setSubStatus(List<String> subStatus) {
    this.subStatus = subStatus;
  }
}
