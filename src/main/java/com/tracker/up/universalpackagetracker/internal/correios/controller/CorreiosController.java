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

  @GetMapping("/correios/{code}")
  public CorreiosResponse consult(@PathVariable String code) {
    return correiosService.consult(code);
  }
}
