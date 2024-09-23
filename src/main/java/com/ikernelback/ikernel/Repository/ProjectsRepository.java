package com.ikernelback.ikernel.Repository;

import com.ikernelback.ikernel.Entity.ProjectsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectsRepository extends JpaRepository<ProjectsEntity, Long> {
}
