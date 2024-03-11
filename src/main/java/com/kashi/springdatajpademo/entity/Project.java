package com.kashi.springdatajpademo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "project")
public class Project {

    @Id
    @UuidGenerator
    private String id;
    private String projectName;
    private Double projectCost;
    @ManyToMany(mappedBy = "projects")
    private Set<Employee> employees;
}
