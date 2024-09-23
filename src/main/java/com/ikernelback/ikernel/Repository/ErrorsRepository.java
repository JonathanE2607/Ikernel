package com.ikernelback.ikernel.Repository;
import com.ikernelback.ikernel.Entity.ErrorsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ErrorsRepository extends JpaRepository<ErrorsEntity, Long> {
}
