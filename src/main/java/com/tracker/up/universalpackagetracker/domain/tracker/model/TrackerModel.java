package com.tracker.up.universalpackagetracker.domain.tracker.model;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TrackerModel {

  @Id
  private UUID uuid;

  @Column(name = "tracking_code", nullable = false)
  private String trackingCode;

}
