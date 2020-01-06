package com.keplercloud.xein.repository;

import com.keplercloud.xein.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author MHS DILSHAN
 */

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
