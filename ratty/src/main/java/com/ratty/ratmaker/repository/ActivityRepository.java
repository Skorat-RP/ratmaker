package com.ratty.ratmaker.repository;

import com.ratty.ratmaker.entity.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ActivityRepository extends JpaRepository<Activity, String> {

    Optional<Activity> findByName(String name);

}