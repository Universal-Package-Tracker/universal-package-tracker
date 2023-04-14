package com.tracker.up.universalpackagetracker.domain.tracker.payload.request;

import java.util.UUID;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class TrackerDTO {

  private UUID uuid;

  @NotBlank
  @NotEmpty(message = "The tracking code is empty")
  @Size(min = 3, max = 100)
  private String trackingCode;

}
