package com.ikernelback.ikernel.Business;

import com.ikernelback.ikernel.Dto.PeopleDto;
import com.ikernelback.ikernel.Entity.PeopleEntity;
import com.ikernelback.ikernel.Service.PeopleService;

import java.util.ArrayList;
import java.util.List;

import com.ikernelback.ikernel.utilities.CustomException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PeopleBusiness {
    @Autowired
    private PeopleService userService;

    private final ModelMapper modelMapper = new ModelMapper();
    @Autowired
    private PeopleService peopleService;

    public List<PeopleDto> findAll() {
        try{
            List<PeopleEntity> peopleEntityList = userService.findAll();
            List<PeopleDto> peopleDtoList = new ArrayList<>();

            for (PeopleEntity people : peopleEntityList) {
                peopleDtoList.add(modelMapper.map(people, PeopleDto.class));
            }
            return peopleDtoList;
        } catch (Exception e) {
            throw new CustomException("Error al crear el servicio", e);
        }

    }

    public void create (PeopleDto peopleDto){
        try{
            PeopleEntity usersEntity = modelMapper.map(peopleDto, PeopleEntity.class);
            userService.save(usersEntity);
        }catch (CustomException e){
            throw new CustomException("Error al crear el servicio",  e);
        }
    }

    public void update (Long id, PeopleDto peopleDto){
        try{
            PeopleEntity peopleEntity = peopleService.getById(id);
            peopleEntity.setName(peopleDto.getName());
            peopleEntity.setEmail(peopleDto.getEmail());
            peopleEntity.setBirthDate(peopleDto.getBirthDate());
            peopleEntity.setDirecction(peopleDto.getDirecction());
            peopleEntity.setProfession(peopleDto.getProfession());
            peopleEntity.setSpecialty(peopleDto.getSpecialty());
            peopleEntity.setTypeOfWorker(peopleDto.getTypeOfWorker());
            peopleEntity.setEmail(peopleDto.getEmail());

            peopleService.update(peopleEntity);
        }catch (CustomException e){
            throw new CustomException("Error al actualizar el servicio",  e);
        }
    }

    public void delete (PeopleEntity entity){
        try{
            peopleService.delete(entity);
        }catch (CustomException e){
            throw new CustomException("Error al eliminar el servicio",  e);
        }
    }

}
