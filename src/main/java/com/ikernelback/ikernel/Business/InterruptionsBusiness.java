package com.ikernelback.ikernel.Business;

import com.ikernelback.ikernel.Dto.InterruptionsDto;
import com.ikernelback.ikernel.Entity.InterruptionsEntity;
import com.ikernelback.ikernel.Service.InterruptionsService;
import com.ikernelback.ikernel.utilities.CustomException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class InterruptionsBusiness {
    @Autowired
    private InterruptionsService interruptionsService;

    private final ModelMapper modelMapper = new ModelMapper();

    public List<InterruptionsDto> findAll() {
        try {
            List<InterruptionsEntity> interruptionsEntityList = interruptionsService.findAll();
            List<InterruptionsDto> interruptionsDtoList = new ArrayList<>();

            for (InterruptionsEntity interruptions: interruptionsEntityList){
                interruptionsDtoList.add(modelMapper.map(interruptions, InterruptionsDto.class));
            }
            return interruptionsDtoList;
        } catch (Exception e){
            throw new CustomException("Error al crear el servicio",  e);
        }
    }

    public void create(InterruptionsDto interruptionsDto) {
        try{
            InterruptionsEntity interruptions = modelMapper.map(interruptionsDto, InterruptionsEntity.class);
            interruptionsService.save(interruptions);
        }catch (Exception e){
            throw new CustomException("Error al crear el servicio",  e);
        }
    }

    public void update (InterruptionsDto interruptionsDto) {
       try {
           InterruptionsEntity interruptions = modelMapper.map(interruptionsDto, InterruptionsEntity.class);
           interruptionsService.update(interruptions);
       }catch (Exception e){
           throw new CustomException("Error al actualizar el servicio",  e);
       }
    }

    public void delete (InterruptionsEntity entity) {
        try{
            interruptionsService.delete(entity);
        }catch (Exception e){
            throw new CustomException("Error al eliminar el servicio",  e);
        }
    }
}
