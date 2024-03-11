package com.kashi.springdatajpademo.repository;

import com.kashi.springdatajpademo.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, String> {
}