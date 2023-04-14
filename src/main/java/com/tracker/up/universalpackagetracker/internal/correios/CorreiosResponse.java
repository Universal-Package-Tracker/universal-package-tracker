package com.tracker.up.universalpackagetracker.internal.correios;

import java.util.List;

import com.tracker.up.universalpackagetracker.internal.correios.payload.request.Evento;

public class CorreiosResponse {

  private String codigo;
  private String host;
  private List<Evento> eventos;
  private double time;
  private int quantidade;
  private String servico;
  private String ultimo;

  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public List<Evento> getEventos() {
    return eventos;
  }

  public void setEventos(List<Evento> eventos) {
    this.eventos = eventos;
  }

  public double getTime() {
    return time;
  }

  public void setTime(double time) {
    this.time = time;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }

  public String getServico() {
    return servico;
  }

  public void setServico(String servico) {
    this.servico = servico;
  }

  public String getUltimo() {
    return ultimo;
  }

  public void setUltimo(String ultimo) {
    this.ultimo = ultimo;
  }
}
