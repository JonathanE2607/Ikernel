package com.ikernelback.ikernel.Business;

import com.ikernelback.ikernel.Dto.RolesDto;
import com.ikernelback.ikernel.Entity.RolesEntity;
import com.ikernelback.ikernel.Service.RolesService;
import com.ikernelback.ikernel.utilities.CustomException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RolesBusiness {
    @Autowired
    private RolesService rolesService;

    private final ModelMapper modelMapper = new ModelMapper();

    public List<RolesDto> findAll() {
        try{
            List<RolesEntity> rolesEntityList = rolesService.findAll();
            List<RolesDto> rolesDtosList = new ArrayList<>();

            for (RolesEntity rol : rolesEntityList) {
                rolesDtosList.add(modelMapper.map(rol, RolesDto.class));
            }
            return rolesDtosList;
        } catch (Exception e) {
            throw new CustomException("Error al crear el servicio", e);
        }

    }

    public void create (RolesDto rolesDto){
        try{
            RolesEntity rolesEntity = modelMapper.map(rolesDto, RolesEntity.class);
            rolesService.save(rolesEntity);
        }catch (CustomException e){
            throw new CustomException("Error al crear el servicio",  e);
        }
    }

    public void update (RolesDto rolesDto){
        try{
            RolesEntity rolesEntity = modelMapper.map(rolesDto, RolesEntity.class);
            rolesService.update(rolesEntity);
        }catch (CustomException e){
            throw new CustomException("Error al actualizar el servicio",  e);
        }
    }

    public void delete (RolesEntity entity){
        try{
            rolesService.delete(entity);
        }catch (CustomException e){
            throw new CustomException("Error al eliminar el servicio",  e);
        }
    }
}
