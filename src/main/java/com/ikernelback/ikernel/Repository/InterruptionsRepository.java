package com.ikernelback.ikernel.Repository;
import com.ikernelback.ikernel.Entity.InterruptionsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterruptionsRepository extends JpaRepository<InterruptionsEntity, Long> {
}
