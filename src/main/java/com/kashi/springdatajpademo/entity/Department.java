package com.kashi.springdatajpademo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "department")
public class Department {

    @Id
    @UuidGenerator
    private String id;

    private String departmentName;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL /*, fetch = FetchType.EAGER*/)
    private Set<Employee> employees;
}
