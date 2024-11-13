package com.cg.CompanyManagementApp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class EmployeeDto {

	private Long employeeId;

	private String name;
	private String email;
	private String position;
	private double salary;

	private Long departmentId;


}
