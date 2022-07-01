package com.adityamshidlyali.SpringBoot.repository;

import com.adityamshidlyali.SpringBoot.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    // naming convention should be followed findBy"FieldNameOfEntity" or deleteBy"FieldNameOfEntity"
    Department findByDepartmentName(String departmentName);

    // naming conventions are provided in the documentation of the Spring Data JPA
    Department findByDepartmentNameIgnoreCase(String departmentName);
}
