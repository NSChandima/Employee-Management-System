package org.ems.service;

import org.ems.dto.Employee;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface EmployeeService {

    void save(Employee employee);

    List<Employee> get();

    void deleteEmployee(@PathVariable Long id);

    void updateEmployee(Employee employee);

    Employee retrieveById(Long id);

    Employee retrieveByFirstName(String firstName);
}
