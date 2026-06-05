package com.sesac.ai_backend.dto;

import com.sesac.ai_backend.domain.Department;
import com.sesac.ai_backend.domain.Employee;

import java.util.List;

public record DepartmentResponse(
        Long id,
        String departmentName,
        List<String> employeeNames
) {

    public static DepartmentResponse from(Department department){
        return new DepartmentResponse(
                department.getId(),
                department.getDepartmentName(),
                department.getEmployees().stream()
                        .map(Employee::getEmployeeName)
                        .toList()
        );
    }
}
