package com.cg.CompanyManagementApp.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.CompanyManagementApp.dto.EmployeeDto;
import com.cg.CompanyManagementApp.mapper.EmployeeMapper;
import com.cg.CompanyManagementApp.models.Department;
import com.cg.CompanyManagementApp.models.Employee;
import com.cg.CompanyManagementApp.repositories.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository empRepository;

	public EmployeeServiceImpl(EmployeeRepository empRepository) {

		this.empRepository = empRepository;
	}

	@Override
	public void addEmployee(EmployeeDto employeeDto) {
		Employee employee = EmployeeMapper.mapToEmployee(employeeDto, new Employee());
		empRepository.save(newAddemployee(employee));
		// return EmployeeMapper.mapToEmployeeDto(savedEmployee);
	}


	private Employee newAddemployee(Employee employee) {
		employee.setName("ramya");
		employee.setEmail("ramya@gmail.com");
		employee.setPosition("SoftwareEngineer");
		employee.setSalary(30000);
		employee.setDepartmentId(Long.valueOf(1));
		return employee;
	}

	/*
	 * public List<EmployeeDto> getEmployeesBySalaryLessThan(double salary) {
	 * List<Employee> employees =
	 * empRepository.findEmployeesBySalaryLessThan(salary); if (employees.isEmpty())
	 * { throw new
	 * EmployeesNotFoundException("No Employees found with salary less than " +
	 * salary); } return EmployeeMapper.mapToEmployeeDtoList(employees); }
	 */

	/*
	 * public DepartmentDto getDepartmentByEmployeeId(Long employeeId) {
	 * Optional<Employee> employeeOpt = empRepository.findById(employeeId); if
	 * (employeeOpt.isPresent()) { Long departmentId =
	 * employeeOpt.get().getDepartmentId(); Optional<Department> departmentOpt =
	 * departmentRepository.findById(departmentId); if (departmentOpt.isPresent()) {
	 * return DepartmentMapper.mapToDepartmentDto(departmentOpt.get()); } else {
	 * throw new EmployeesNotFoundException("Department not found for employee ID "
	 * + employeeId); } } else { throw new
	 * EmployeesNotFoundException("Employee not found with ID " + employeeId); }
	 */
//	}

	@Override
	public List<EmployeeDto> getEmployeesBySalaryLessThan(double salary) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Department getDepartmentByEmployeeId(Long employeeId) {
		return empRepository.getDepartmentByEmployeeId(employeeId);
		// return DepartmentMapper.mapToDepartmentDto(department, new DepartmentDto());
	}

}
