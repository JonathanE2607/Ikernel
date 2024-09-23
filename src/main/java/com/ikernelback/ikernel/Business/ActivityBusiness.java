package com.ikernelback.ikernel.Business;

import com.ikernelback.ikernel.Dto.ActivityDto;
import com.ikernelback.ikernel.Entity.ActivityEntity;
import com.ikernelback.ikernel.Service.ActivityService;
import com.ikernelback.ikernel.utilities.CustomException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;


@Component
public class ActivityBusiness {
    @Autowired
    private ActivityService activityService;

    private final ModelMapper modelMapper = new ModelMapper();

    public List<ActivityDto> findAll() {
        try {
            List<ActivityEntity> activityEntityList = activityService.findAll();
            List<ActivityDto> activityDtoList = new ArrayList<>();

            for (ActivityEntity activities : activityEntityList) {
                activityDtoList.add(modelMapper.map(activities, ActivityDto.class));
            }
            return activityDtoList;
        } catch (Exception e) {
            throw new com.ikernelback.ikernel.utilities.CustomException("Error al obtener los servicios", e);

        }
    }

    public void create(ActivityDto activityDto) {
        try{
            ActivityEntity activities = modelMapper.map(activityDto, ActivityEntity.class);
            activityService.save(activities);

        }catch (Exception e){
          throw new CustomException("Error al crear el activity", e);
        }
    }

    public void update(ActivityDto activityDto) {
        try{
            ActivityEntity activities = modelMapper.map(activityDto, ActivityEntity.class);
            activityService.update(activities);
        }catch (Exception e){
            throw new CustomException("Error al actualizar el activity", e);
        }
    }
    public void delete(ActivityEntity entity) {
        try {
            activityService.delete(entity);
        }catch (Exception e){
            throw new CustomException("Error al eliminar el activity", e);
        }
    }
}
