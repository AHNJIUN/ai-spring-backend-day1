package com.sesac.ai_backend.repository;

import com.sesac.ai_backend.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

@Query(
                """
        SELECT e FROM Employee e Join FETCH e.department)
        """
        )
    List<Employee> findAllWithDepartment();
}
