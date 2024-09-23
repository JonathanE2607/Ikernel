package com.ikernelback.ikernel.Business;

import org.modelmapper.ModelMapper;
import com.ikernelback.ikernel.Dto.ErrorsDto;
import com.ikernelback.ikernel.Entity.ErrorsEntity;
import com.ikernelback.ikernel.Service.ErrorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.View;
import java.util.List;
import java.util.ArrayList;

@Component
public class ErrorsBusiness {
    @Autowired
    private ErrorsService errorsService;

    private final ModelMapper modelMapper = new ModelMapper();

    public List<ErrorsDto> findAll() {
            try {
                List<ErrorsEntity> errorsEntityList = errorsService.findAll();
                List<ErrorsDto> errorsDtoList = new ArrayList<>();

                for (ErrorsEntity errors : errorsEntityList) {
                    errorsDtoList.add(modelMapper.map(errors, ErrorsDto.class));
                }
                return errorsDtoList;
            } catch (Exception e) {
                throw new com.ikernelback.ikernel.utilities.CustomException("Error al obtener los servicios", e);

            }
        }

        public void create(ErrorsDto errorsDto) {
            try {
                ErrorsEntity errors = modelMapper.map(errorsDto, ErrorsEntity.class);
                errorsService.save(errors);
            } catch (Exception e) {
                throw new com.ikernelback.ikernel.utilities.CustomException("Error al crear el servicio",  e);
            }
        }

        public void update(ErrorsDto errorsDto) {
            try {
                ErrorsEntity errors = modelMapper.map(errorsDto, ErrorsEntity.class);
                errorsService.update(errors);
            } catch (Exception e) {
                throw new com.ikernelback.ikernel.utilities.CustomException("Error al actualizar el servicio", e);
            }
        }

        public void delete(ErrorsEntity entity) {
            try {
                errorsService.delete(entity);
            } catch (Exception e) {
                throw new com.ikernelback.ikernel.utilities.CustomException("Se produjo un incoveniente al eliminar el error", e);
            }
        }
}
