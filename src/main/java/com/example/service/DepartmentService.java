package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entity.Department;
import com.example.exception.ResourceNotFoundException;
import com.example.repository.DepartmentRepository;

@Service
public class DepartmentService {

    private final DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    // Create Department
    public Department createDepartment(Department department) {
        department.setId(null);
        return departmentRepository.save(department);
    }


    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    public Department getDepartmentById(Long id) {
        return departmentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(
                        "Department not found with ID: " + id));
    }

    public Department updateDepartment(Long id, Department updatedDepartment) {
        Department existingDepartment = getDepartmentById(id);

        existingDepartment.setName(updatedDepartment.getName());
        existingDepartment.setLocation(updatedDepartment.getLocation());

        return departmentRepository.save(existingDepartment);
    }


    public void deleteDepartment(Long id) {
        Department department = getDepartmentById(id);
        departmentRepository.delete(department);
    }
}	