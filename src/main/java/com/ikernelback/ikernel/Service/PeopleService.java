package com.ikernelback.ikernel.Service;

import com.ikernelback.ikernel.Entity.PeopleEntity;
import com.ikernelback.ikernel.Repository.PeopleRepository;
import com.ikernelback.ikernel.Service.Dao.Idao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PeopleService implements Idao<PeopleEntity, Long> {
    @Autowired
    private PeopleRepository usersRepository;

    @Override
    public List<PeopleEntity> findAll() {
        return usersRepository.findAll();
    }

    @Override
    public PeopleEntity getById(Long id) {
        Optional<PeopleEntity> optionalUserEntity = usersRepository.findById(id);
        return optionalUserEntity.orElse(null);
    }

    @Override
    public void update(PeopleEntity entity) {


        this.usersRepository.save(entity);
    }

    @Override
    public void save(PeopleEntity entity) {
        this.usersRepository.save(entity);
    }

    @Override
    public void delete(PeopleEntity entity) {
        this.usersRepository.delete(entity);
    }

    @Override
    public void create(PeopleEntity entity) {
         this.usersRepository.save(entity);
    }

    @Override
    public void delete(Long id) {

    }
}
