package com.cg.CompanyManagementApp.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.CompanyManagementApp.dto.EmployeeDto;
import com.cg.CompanyManagementApp.models.Department;
import com.cg.CompanyManagementApp.services.EmployeeService;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

	private EmployeeService empService;

	public EmployeeController(EmployeeService empService) {

		this.empService = empService;
	}

	@PostMapping("/create")
	public void createEmployee(@RequestBody EmployeeDto empDto) {
		empService.addEmployee(empDto);
		// return new ResponseEntity<>(newEmployee, HttpStatus.CREATED);
	}

	@GetMapping("/bysalary")
	public ResponseEntity<List<EmployeeDto>> getAllEmployeesBySalaryLessThan(@RequestParam double salary) {
		List<EmployeeDto> employees = empService.getEmployeesBySalaryLessThan(salary);
		return new ResponseEntity<>(employees, HttpStatus.OK);
	}

	@GetMapping("/{id}/department")
	public Department getEmployeeDepartment(@PathVariable Long id) {
		return empService.getDepartmentByEmployeeId(id);

	}
}
