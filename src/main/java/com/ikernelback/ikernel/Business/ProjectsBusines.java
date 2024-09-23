package com.ikernelback.ikernel.Business;

import com.ikernelback.ikernel.Dto.ProjectsDto;
import com.ikernelback.ikernel.Entity.ProjectsEntity;
import com.ikernelback.ikernel.Service.ProjectsService;

import java.util.ArrayList;
import java.util.List;

import com.ikernelback.ikernel.utilities.CustomException;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProjectsBusines {
    @Autowired
    private ProjectsService projectsService;

    private final ModelMapper modelMapper = new ModelMapper();

    public List<ProjectsDto> findAll(){
        try{
            List<ProjectsEntity> projectsEntityList = projectsService.findAll();
            List<ProjectsDto> projectsDtosList = new ArrayList<>();

            for (ProjectsEntity projects : projectsEntityList) {
                projectsDtosList.add(modelMapper.map(projects, ProjectsDto.class));
            }

                 return projectsDtosList;

        }catch (CustomException e){
            throw new CustomException("Error al crear el servicio",  e);
        }
    }

    public void create (ProjectsDto projectsDto){
        try{
            ProjectsEntity projectsEntity = modelMapper.map(projectsDto, ProjectsEntity.class);
            projectsService.save(projectsEntity);
        }catch (CustomException e){
            throw new CustomException("Error al crear el servicio",  e);
        }
    }

    public void update(ProjectsDto projectsDto){
        try{
            ProjectsEntity projectsEntity = modelMapper.map(projectsDto, ProjectsEntity.class);
            projectsService.update(projectsEntity);
        }catch (CustomException e){
            throw new CustomException("Error al actualizar el servicio",  e);
        }
    }

    public void delete(ProjectsEntity entity){
        try{
           projectsService.delete(entity);

        }catch (CustomException e){
            throw new CustomException("Error al eliminar el servicio",  e);
        }
    }
}
