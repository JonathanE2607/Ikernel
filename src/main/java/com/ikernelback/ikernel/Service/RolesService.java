package com.ikernelback.ikernel.Service;

import com.ikernelback.ikernel.Entity.RolesEntity;
import com.ikernelback.ikernel.Repository.RolesRepository;
import com.ikernelback.ikernel.Service.Dao.Idao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
public class RolesService implements Idao<RolesEntity, Long> {
    @Autowired
    private RolesRepository rolesRepository;


    @Override
    public List<RolesEntity> findAll() {
        return rolesRepository.findAll();
    }

    @Override
    public RolesEntity getById(Long id) {
        Optional<RolesEntity> optionalRolesEntity = rolesRepository.findById(id);
        return optionalRolesEntity.orElse(null);
    }

    @Override
    public void update(RolesEntity entity) {
     rolesRepository.save(entity);
    }

    @Override
    public void save(RolesEntity entity) {
     rolesRepository.save(entity);
    }

    @Override
    public void delete(RolesEntity entity) {
     rolesRepository.delete(entity);
    }

    @Override
    public void create(RolesEntity entity) {
     rolesRepository.save(entity);
    }

    @Override
    public void delete(Long id) {

    }
}
