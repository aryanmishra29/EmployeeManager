package com.aryancodes.employeeservice.repository;

import com.aryancodes.employeeservice.EmployeeServiceApplication;
import com.aryancodes.employeeservice.model.Employee;
import com.mongodb.lang.NonNull;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee,Long> {


    @NonNull
    public Optional<Employee> findById(@NonNull Long id);


    public List<Employee> findByDepartmentId(Long departmentId);
}
