package org.ems.controller;

import org.ems.dto.Employee;
import org.ems.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody Employee employee){
       employeeService.save(employee);
    }

    @GetMapping()
    public List<Employee> get(){
        return employeeService.get();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        employeeService.deleteEmployee(id);
    }

    @PatchMapping
    public void update(@RequestBody Employee employee){
        employeeService.updateEmployee(employee);
    }
}
