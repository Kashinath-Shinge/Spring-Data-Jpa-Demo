package com.kashi.springdatajpademo.repository;

import com.kashi.springdatajpademo.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, String> {
}