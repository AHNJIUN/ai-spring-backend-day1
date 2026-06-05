package com.sesac.ai_backend.repository;

import com.sesac.ai_backend.domain.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

    Optional<Department> findByDepartmentName(String departmentName);
    boolean existsByDepartmentName(String departmentName);


}
