package com.ikernelback.ikernel.Service;

import com.ikernelback.ikernel.Entity.ErrorsEntity;
import com.ikernelback.ikernel.Repository.ErrorsRepository;
import com.ikernelback.ikernel.Service.Dao.Idao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ErrorsService implements Idao<ErrorsEntity, Long> {
@Autowired
private ErrorsRepository errorsRepository;

    @Override
    public List<ErrorsEntity> findAll() {
        return errorsRepository.findAll();
    }

    @Override
    public ErrorsEntity getById(Long id) {
        Optional<ErrorsEntity>optionalErrorsEntity = errorsRepository.findById(id);
        return optionalErrorsEntity.orElse(null);
    }

    @Override
    public void update(ErrorsEntity entity) {
        this.errorsRepository.save(entity);
    }

    @Override
    public void save(ErrorsEntity entity) {
        this.errorsRepository.save(entity);

    }

    @Override
    public void delete(ErrorsEntity entity) {
      this.errorsRepository.delete(entity);
    }

    @Override
    public void create(ErrorsEntity entity) {
       this.errorsRepository.save(entity);
    }

    @Override
    public void delete(Long idError) {

    }
}
