package com.kashi.springdatajpademo.controller;

import com.kashi.springdatajpademo.entity.Employee;
import com.kashi.springdatajpademo.services.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
@AllArgsConstructor
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/all")
    public List<Employee> getAllEmployee() {
        var result = employeeService.getAllEmployee();
        System.out.println(result);
        return result;
    }
}
