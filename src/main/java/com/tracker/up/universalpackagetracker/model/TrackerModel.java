package com.tracker.up.universalpackagetracker.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class TrackerModel {

    @Column(name = "tracking_code", nullable = false)
    private String trackingCode;

}
