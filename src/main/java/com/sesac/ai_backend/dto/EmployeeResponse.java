package com.sesac.ai_backend.dto;

import com.sesac.ai_backend.domain.Employee;

public record EmployeeResponse(Long id, String employeeName, String grade, String departmentName) {

    public static EmployeeResponse from(Employee employee){
        return new EmployeeResponse(
                employee.getId(),
                employee.getEmployeeName(),
                employee.getGrade(),
                employee.getDepartment().getDepartmentName()
        );
    }
}
