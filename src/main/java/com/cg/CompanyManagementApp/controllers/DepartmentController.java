package com.cg.CompanyManagementApp.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.CompanyManagementApp.dto.DepartmentDto;
import com.cg.CompanyManagementApp.services.DepartmentService;

@RestController
@RequestMapping("/api/department")
public class DepartmentController {

	private DepartmentService departService;

	public DepartmentController(DepartmentService departService) {
		super();
		this.departService = departService;
	}

	@PostMapping("/create")
	public void createDepartment(@RequestBody DepartmentDto departmentDto) {
		departService.addDepartment(departmentDto);

	}

}
