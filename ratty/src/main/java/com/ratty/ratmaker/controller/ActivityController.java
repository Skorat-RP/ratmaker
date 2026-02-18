package com.ratty.ratmaker.controller;

import com.ratty.ratmaker.dto.ActivityDto;
import com.ratty.ratmaker.dto.StatusDto;
import com.ratty.ratmaker.service.ActivityService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActivityController {

    private final ActivityService activityService;

    ActivityController(ActivityService activityService){
        this.activityService = activityService;
    }

    @PostMapping
    public ResponseEntity<StatusDto> registerActivity(@RequestBody ActivityDto activityDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(activityService.registerActivity(activityDto));
    }


}
