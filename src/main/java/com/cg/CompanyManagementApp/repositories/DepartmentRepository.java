package com.cg.CompanyManagementApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.CompanyManagementApp.models.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {


}
