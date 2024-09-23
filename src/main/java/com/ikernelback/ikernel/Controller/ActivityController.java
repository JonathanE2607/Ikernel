package com.ikernelback.ikernel.Controller;

import com.ikernelback.ikernel.Business.ActivityBusiness;
import com.ikernelback.ikernel.Dto.ActivityDto;
import com.ikernelback.ikernel.Entity.ActivityEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/activities")
public class ActivityController {

    @Autowired
    private ActivityBusiness activityBusiness;

    @GetMapping( "/all")
    public List<ActivityDto> getAllActivities() {
        return activityBusiness.findAll();
    }

    @PostMapping( "/create")
    public void createActivity(@RequestBody ActivityDto activityDto) {
        activityBusiness.create(activityDto);
    }

    @PutMapping( "/update")
    public void updateActivity(@RequestBody ActivityDto activityDto) {
        activityBusiness.update(activityDto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteActivity(@PathVariable("id") ActivityEntity entity) {
        activityBusiness.delete(entity);
    }

}
