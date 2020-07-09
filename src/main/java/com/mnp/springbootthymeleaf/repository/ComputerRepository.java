package com.mnp.springbootthymeleaf.repository;

import com.mnp.springbootthymeleaf.model.Computer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComputerRepository extends JpaRepository<Computer, Integer> {
}
