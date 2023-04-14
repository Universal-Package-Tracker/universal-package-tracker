package com.tracker.up.universalpackagetracker.internal.correios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tracker.up.universalpackagetracker.internal.correios.CorreiosResponse;
import com.tracker.up.universalpackagetracker.internal.correios.service.CorreiosService;

@RestController
public class CorreiosController {

  @Autowired
  CorreiosService correiosService;

  @GetMapping("/correios/{codigo}")
  public CorreiosResponse consultar(@PathVariable String codigo) {
    return correiosService.consultar(codigo);
  }
}
