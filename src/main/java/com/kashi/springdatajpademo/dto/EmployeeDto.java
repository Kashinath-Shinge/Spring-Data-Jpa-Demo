package com.kashi.springdatajpademo.dto;

import com.kashi.springdatajpademo.entity.Employee;
import lombok.Value;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

/**
 * DTO for {@link Employee}
 */
@Value
public class EmployeeDto implements Serializable {
    String id;
    String employeeName;
    LocalDate dateOfJoining;
    DepartmentDto department;
    Set<ProjectDto> projects;
}