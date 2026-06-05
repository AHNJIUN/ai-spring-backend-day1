package com.sesac.ai_backend.dto;

import com.sesac.ai_backend.domain.Department;
import jakarta.validation.constraints.NotBlank;

public record DepartmentRequest(
        @NotBlank String departmentName
        ){
    public Department toEntity(){
        return Department.builder()
                .departmentName(departmentName)
                .build();
    }
}
