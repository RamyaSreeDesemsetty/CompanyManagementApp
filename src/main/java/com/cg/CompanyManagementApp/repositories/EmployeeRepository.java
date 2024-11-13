package com.cg.CompanyManagementApp.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.CompanyManagementApp.models.Department;
import com.cg.CompanyManagementApp.models.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	@Query(value = "SELECT * FROM employees WHERE salary< :salary", nativeQuery = true)
	List<Employee> findEmployeesBySalaryLessThan(@Param("salary") double salary);

	Optional<Employee> findById(Long employeeId);

	@Query(value = "SELECT d.department_id, d.department_name FROM employees e JOIN departments d ON e.department_id = d.department_id WHERE e.employee_id = :employeeId", nativeQuery = true)
	Department getDepartmentByEmployeeId(Long employeeId);

}
