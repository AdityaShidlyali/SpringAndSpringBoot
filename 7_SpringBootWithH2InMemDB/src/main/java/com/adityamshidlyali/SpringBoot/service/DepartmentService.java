package com.adityamshidlyali.SpringBoot.service;

import com.adityamshidlyali.SpringBoot.entity.Department;
import com.adityamshidlyali.SpringBoot.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {

    Department saveDepartment(Department department);

    List<Department> fetchDepartmentList();

    Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

    void deleteDepartmentById(Long departmentId);

    Department updateDepartmentById(Long departmentId, Department department);

    Department fetchDepartmentByName(String departmentName);
}
