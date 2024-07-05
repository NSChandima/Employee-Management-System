package org.ems.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.ems.dto.Employee;
import org.ems.entity.EmployeeEntity;
import org.ems.repository.EmployeeRepository;
import org.ems.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    ObjectMapper mapper;

    @Override
    public void save(Employee employee) {
        employeeRepository.save(mapper.convertValue(employee, EmployeeEntity.class));
    }

    @Override
    public List<Employee> get() {
        Iterable<EmployeeEntity> allEmployee = employeeRepository.findAll();
        List<Employee> employeeList = new ArrayList<>();

        allEmployee.forEach(employeeEntity -> {
            Employee employee = mapper.convertValue(employeeEntity, Employee.class);
            employeeList.add(employee);
        });
        return employeeList;
    }

    @Override
    public void deleteEmployee(Long id) {
        if (employeeRepository.existsById(id)) {
            employeeRepository.deleteById(id);
        }
    }

    @Override
    public void updateEmployee(Employee employee) {
        boolean isExist = employeeRepository.existsById(employee.getEmployeeId());
        if (isExist){
            employeeRepository.save(mapper.convertValue(employee,EmployeeEntity.class));
        }
    }


}
