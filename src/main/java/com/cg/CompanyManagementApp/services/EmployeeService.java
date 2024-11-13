package com.cg.CompanyManagementApp.services;

import java.util.List;

import com.cg.CompanyManagementApp.dto.EmployeeDto;
import com.cg.CompanyManagementApp.models.Department;

public interface EmployeeService {

	void addEmployee(EmployeeDto employeeDto);

	List<EmployeeDto> getEmployeesBySalaryLessThan(double salary);

	Department getDepartmentByEmployeeId(Long employeeId);
}
