package com.tracker.up.universalpackagetracker.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class TrackerDTO {

    @NotBlank
    @NotEmpty(message = "The tracking code is empty")
    @Size(min = 3, max = 100)
    private String trackingCode;
}
