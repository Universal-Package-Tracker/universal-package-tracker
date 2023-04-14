package com.tracker.up.universalpackagetracker.internal.correios.payload.request;

import java.util.List;

public class Evento {

  private String data;
  private String hora;
  private String local;
  private String status;
  private List<String> subStatus;

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public String getHora() {
    return hora;
  }

  public void setHora(String hora) {
    this.hora = hora;
  }

  public String getLocal() {
    return local;
  }

  public void setLocal(String local) {
    this.local = local;
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
