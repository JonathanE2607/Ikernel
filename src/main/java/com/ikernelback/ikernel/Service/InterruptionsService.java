package com.ikernelback.ikernel.Service;

import com.ikernelback.ikernel.Entity.InterruptionsEntity;
import com.ikernelback.ikernel.Repository.InterruptionsRepository;
import com.ikernelback.ikernel.Service.Dao.Idao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class InterruptionsService implements Idao<InterruptionsEntity, Long> {
    @Autowired
    private InterruptionsRepository interruptionsRepository;


    @Override
    public List<InterruptionsEntity> findAll() {
        return interruptionsRepository.findAll();
    }

    @Override
    public InterruptionsEntity getById(Long id) {
        Optional<InterruptionsEntity> optionalInterruptionsEntity = interruptionsRepository.findById(id);
        return optionalInterruptionsEntity.orElse(null);
    }

    @Override
    public void update(InterruptionsEntity entity) {
      this.interruptionsRepository.save(entity);
    }

    @Override
    public void save(InterruptionsEntity entity) {
        this.interruptionsRepository.save(entity);
    }

    @Override
    public void delete(InterruptionsEntity entity) {
        this.interruptionsRepository.delete(entity);
    }

    @Override
    public void create(InterruptionsEntity entity) {
       this.interruptionsRepository.save(entity);
    }

    @Override
    public void delete(Long id) {

    }
}
