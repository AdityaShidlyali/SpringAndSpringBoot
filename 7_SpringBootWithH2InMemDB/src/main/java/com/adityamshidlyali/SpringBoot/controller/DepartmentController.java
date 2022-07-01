package com.adityamshidlyali.SpringBoot.controller;

import com.adityamshidlyali.SpringBoot.entity.Department;
import com.adityamshidlyali.SpringBoot.error.DepartmentNotFoundException;
import com.adityamshidlyali.SpringBoot.service.DepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class DepartmentController {

    private final Logger LOGGER
            = LoggerFactory.getLogger(DepartmentController.class);

    private final String TAG = getClass().getSimpleName();

    @Autowired
    private DepartmentService service;

    @PostMapping("/department")
    public Department saveDepartment(@Valid @RequestBody Department department) {
        LOGGER.info(TAG + "saveDepartment() was called");
        return service.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> fetchDepartmentList() {
        LOGGER.info(TAG + "fetchDepartmentList() was called");
        return service.fetchDepartmentList();
    }

    @GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId) throws DepartmentNotFoundException {
        return service.fetchDepartmentById(departmentId);
    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId) {
        service.deleteDepartmentById(departmentId);
        return "Department deleted successfully";
    }

    @PutMapping("/departments/{id}")
    public Department updateDepartmentById(
            @PathVariable("id") Long departmentId,
            @RequestBody Department department
    ) {
        return service.updateDepartmentById(departmentId, department);
    }

    @GetMapping("/departments/name/{name}")
    public Department fetchDepartmentByName(@PathVariable("name") String departmentName) {
        return service.fetchDepartmentByName(departmentName);
    }
}


