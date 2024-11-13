package com.cg.CompanyManagementApp.services;

import org.springframework.stereotype.Service;

import com.cg.CompanyManagementApp.dto.DepartmentDto;
import com.cg.CompanyManagementApp.mapper.DepartmentMapper;
import com.cg.CompanyManagementApp.models.Department;
import com.cg.CompanyManagementApp.repositories.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	private DepartmentRepository departmentRepo;

	public DepartmentServiceImpl(DepartmentRepository departmentRepo) {
		super();
		this.departmentRepo = departmentRepo;
	}

	@Override
	public void addDepartment(DepartmentDto departmentDto) {
		Department departments = DepartmentMapper.mapToDepartment(departmentDto, new Department());
		departmentRepo.save(departments);
	}

}
