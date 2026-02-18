package com.ratty.ratmaker.service;

import com.ratty.ratmaker.dto.ActivityDto;
import com.ratty.ratmaker.dto.StatusDto;
import com.ratty.ratmaker.entity.Activity;
import com.ratty.ratmaker.repository.ActivityRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class ActivityService {

    private final ActivityRepository activityRepository;

    public StatusDto registerActivity(ActivityDto activityDto) {
        Optional<Activity> activity = findActivity(activityDto);

        if (activity.isEmpty()){
            return null;
        }

        return null;

    }

    private Optional<Activity> findActivity(ActivityDto activityDto) {
        return activityDto.activityId() == null ? activityRepository.findByName(activityDto.activityName())
                : activityRepository.findById(activityDto.activityId());
    }
}
