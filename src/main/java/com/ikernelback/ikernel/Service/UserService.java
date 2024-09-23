package com.ikernelback.ikernel.Service;


import com.ikernelback.ikernel.Entity.UserEntity;
import com.ikernelback.ikernel.Repository.UserRepository;
import com.ikernelback.ikernel.Service.Dao.Idao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements Idao<UserEntity, Long> {
    @Autowired
    private UserRepository UserRepository;
    @Autowired
    private UserRepository userRepository;


    @Override
    public List<UserEntity> findAll() {
        return userRepository.findAll();
    }

    @Override
    public UserEntity getById(Long id) {
        Optional<UserEntity> userEntity = UserRepository.findById(id);
        return userEntity.orElse(null);
    }

    @Override
    public void update(UserEntity entity) {
      UserRepository.save(entity);
    }

    @Override
    public void save(UserEntity entity) {
      UserRepository.save(entity);
    }

    @Override
    public void delete(UserEntity entity) {
        userRepository.delete(entity);
    }

    @Override
    public void create(UserEntity entity) {
      UserRepository.save(entity);
    }

    @Override
    public void delete(Long id) {

    }
}
