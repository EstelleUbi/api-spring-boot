package com.asi.api.repository;

import com.asi.api.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
/*
* @Repository est une annotation Spring pour indiquer que la classe est un bean,
* et que son rôle est de communiquer avec une source de données
*
* */
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
