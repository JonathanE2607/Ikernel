package com.ikernelback.ikernel.Service;

import com.ikernelback.ikernel.Entity.ActivityEntity;
import com.ikernelback.ikernel.Repository.ActivityRepository;
import com.ikernelback.ikernel.Service.Dao.Idao;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActivityService implements Idao<ActivityEntity, Long> {

    @Autowired
    private ActivityRepository activityRepository;


    @Override
    public List<ActivityEntity> findAll() {
        return activityRepository.findAll();
    }

    @Override
    public ActivityEntity getById(Long id) {
        Optional<ActivityEntity> activity = activityRepository.findById(id);
        return activity.orElse(null);
    }

    @Override
    public void update(ActivityEntity entity) {
     activityRepository.save(entity);
    }

    @Override
    public void save(ActivityEntity entity) {
     activityRepository.save(entity);
    }

    @Override
    public void delete(ActivityEntity entity) {
      activityRepository.delete(entity);
    }

    @Override
    public void create(ActivityEntity entity) {
        activityRepository.save(entity);
    }

    @Override
    public void delete(Long id) {
       activityRepository.deleteById(id);
    }
}
