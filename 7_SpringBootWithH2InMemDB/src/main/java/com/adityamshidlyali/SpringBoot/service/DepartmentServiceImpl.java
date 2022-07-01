package com.adityamshidlyali.SpringBoot.service;

import com.adityamshidlyali.SpringBoot.entity.Department;
import com.adityamshidlyali.SpringBoot.error.DepartmentNotFoundException;
import com.adityamshidlyali.SpringBoot.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository repository;

    @Override
    public Department saveDepartment(Department department) {
        return repository.save(department);
    }

    @Override
    public List<Department> fetchDepartmentList() {
        return repository.findAll();
    }

    @Override
    public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException {
        Optional<Department> departmentOptional = repository.findById(departmentId);
        if (!departmentOptional.isPresent()) {
            throw new DepartmentNotFoundException("Department with id " + departmentId + " not exists");
        }

        return departmentOptional.get();
    }

    @Override
    public void deleteDepartmentById(Long departmentId) {
        repository.deleteById(departmentId);
    }

    @Override
    public Department updateDepartmentById(Long departmentId, Department department) {
        Department alreadyExistingDepartment = repository.findById(departmentId).get();

        if (Objects.nonNull(department.getDepartmentName()) &&
                !"".equalsIgnoreCase(department.getDepartmentName())) {
            alreadyExistingDepartment.setDepartmentName(department.getDepartmentName());
        }

        if (Objects.nonNull(department.getDepartmentCode()) &&
                !"".equalsIgnoreCase(department.getDepartmentCode())) {
            alreadyExistingDepartment.setDepartmentCode(department.getDepartmentCode());
        }

        if (Objects.nonNull(department.getDepartmentAddress()) &&
                !"".equalsIgnoreCase(department.getDepartmentAddress())) {
            alreadyExistingDepartment.setDepartmentAddress(department.getDepartmentAddress());
        }

        return repository.save(alreadyExistingDepartment);
    }

    @Override
    public Department fetchDepartmentByName(String departmentName) {
        return repository.findByDepartmentNameIgnoreCase(departmentName);
    }
}
