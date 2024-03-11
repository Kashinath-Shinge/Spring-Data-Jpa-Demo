package com.kashi.springdatajpademo.dto;

import com.kashi.springdatajpademo.entity.Department;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link Department}
 */
@Value
public class DepartmentDto implements Serializable {
    String id;
    String departmentName;
}