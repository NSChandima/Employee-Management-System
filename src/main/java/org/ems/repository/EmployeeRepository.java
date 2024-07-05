package org.ems.repository;

import org.ems.entity.EmployeeEntity;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository <EmployeeEntity,Long>{
}
