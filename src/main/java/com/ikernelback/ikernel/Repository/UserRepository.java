package com.ikernelback.ikernel.Repository;

import com.ikernelback.ikernel.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
