package com.tracker.up.universalpackagetracker.domain.tracker.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tracker.up.universalpackagetracker.domain.tracker.model.TrackerModel;

public interface TrackerRepository extends JpaRepository<TrackerModel, UUID> {

}
