package com.ikernelback.ikernel.Repository;

import com.ikernelback.ikernel.Entity.ActivityEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityRepository extends JpaRepository<ActivityEntity, Long> {
}
