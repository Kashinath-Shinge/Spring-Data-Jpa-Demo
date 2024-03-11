package com.kashi.springdatajpademo.dto;

import com.kashi.springdatajpademo.entity.Project;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link Project}
 */
@Value
public class ProjectDto implements Serializable {
    String id;
    String projectName;
    Double projectCost;
}