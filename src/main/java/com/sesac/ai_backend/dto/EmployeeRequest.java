package com.sesac.ai_backend.dto;

import com.sesac.ai_backend.domain.Department;
import com.sesac.ai_backend.domain.Employee;
import jakarta.validation.constraints.NotBlank;

public record EmployeeRequest(
        @NotBlank String employeeName,
        @NotBlank String grade,
        Long departmentId
) {
    public Employee toEntity(Department department){
        return Employee.builder()
                .employeeName(employeeName)
                .grade(grade)
                .department(department)
                .build();
    }
}
