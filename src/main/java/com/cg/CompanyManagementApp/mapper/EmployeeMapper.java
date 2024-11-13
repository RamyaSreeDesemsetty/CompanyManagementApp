package com.cg.CompanyManagementApp.mapper;

import com.cg.CompanyManagementApp.dto.EmployeeDto;
import com.cg.CompanyManagementApp.models.Employee;

public class EmployeeMapper {

	public static Employee mapToEmployee(EmployeeDto empDto, Employee employee) {
		employee.setEmployeeId(empDto.getEmployeeId());
		employee.setName(empDto.getName());
		employee.setEmail(empDto.getEmail());
		employee.setPosition(empDto.getPosition());
		employee.setSalary(empDto.getSalary());
		employee.setDepartmentId(empDto.getDepartmentId());
		return employee;
	}

	public static EmployeeDto mapToEmployeeDto(Employee employee, EmployeeDto employeeDto) {
		employeeDto.setEmployeeId(employee.getEmployeeId());
		employeeDto.setName(employee.getName());
		employeeDto.setEmail(employee.getEmail());
		employeeDto.setPosition(employee.getPosition());
		employeeDto.setSalary(employee.getSalary());
		employeeDto.setDepartmentId(employee.getDepartmentId());
		return employeeDto;
	}

	/*
	 * public static List<EmployeeDto> mapToEmployeeDtoList(List<Employee>
	 * employees) { return
	 * employees.stream().map(EmployeeMapper::mapToEmployeeDto).collect(Collectors.
	 * toList()); }
	 */
}
