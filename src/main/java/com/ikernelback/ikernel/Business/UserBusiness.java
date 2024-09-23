package com.ikernelback.ikernel.Business;

import com.ikernelback.ikernel.Dto.UserDto;
import com.ikernelback.ikernel.Entity.UserEntity;
import com.ikernelback.ikernel.Service.UserService;
import com.ikernelback.ikernel.utilities.CustomException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserBusiness {
       @Autowired
        private UserService userService;

        private final ModelMapper modelMapper = new ModelMapper();

        public List<UserDto> findAll() {
            try{
                List<UserEntity> userEntityList = userService.findAll();
                List<UserDto> userDtosList = new ArrayList<>();

                for (UserEntity user : userEntityList) {
                    userDtosList.add(modelMapper.map(user, UserDto.class));
                }
                return userDtosList;
            } catch (Exception e) {
                throw new CustomException("Error al crear el servicio", e);
            }

        }

        public void create (UserDto userDto){
            try{
                UserEntity userEntity = modelMapper.map(userDto, UserEntity.class);
                userService.save(userEntity);
            }catch (CustomException e){
                throw new CustomException("Error al crear el servicio",  e);
            }
        }

        public void update (Long id, UserDto userDto) {
            try {

                UserEntity usersEntity = userService.getById(id);
                usersEntity.setUser_Id(userDto.getUser_Id());
                usersEntity.setDocument(userDto.getDocument());
                usersEntity.setPassword(userDto.getPassword());

                userService.update(usersEntity);
            } catch (CustomException e) {
                throw new CustomException("Error al actualizar el servicio", e);
            }
        }

    public void delete (UserEntity entity){
        try{
            userService.delete(entity);
        }catch (CustomException e){
            throw new CustomException("Error al eliminar el servicio",  e);
        }
    }
}

