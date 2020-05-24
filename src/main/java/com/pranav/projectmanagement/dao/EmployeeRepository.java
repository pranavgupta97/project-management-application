package com.pranav.projectmanagement.dao;

import com.pranav.projectmanagement.entities.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
