package com.tracker.up.universalpackagetracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tracker.up.universalpackagetracker.model.TrackerModel;

public interface TrackerRepository extends JpaRepository<TrackerModel, String> {

}
