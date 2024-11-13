package com.cg.CompanyManagementApp.mapper;

import com.cg.CompanyManagementApp.dto.DepartmentDto;
import com.cg.CompanyManagementApp.models.Department;

public class DepartmentMapper {

	public static Department mapToDepartment(DepartmentDto departmentDto, Department department) {
		department.setDepartmentId(departmentDto.getDepartmentId());
		department.setDepartmentName(departmentDto.getDepartmentName());
		return department;
	}

	public static DepartmentDto mapToDepartmentDto(Department department, DepartmentDto departmentDto) {
		departmentDto.setDepartmentId(department.getDepartmentId());
		departmentDto.setDepartmentName(department.getDepartmentName());
		return departmentDto;
	}

}
