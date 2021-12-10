package com.caito.bussinesdomain.pavillon.repository;

import com.caito.bussinesdomain.pavillon.entity.Pavillon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PavillonRepository extends JpaRepository<Pavillon, Long> {
}
