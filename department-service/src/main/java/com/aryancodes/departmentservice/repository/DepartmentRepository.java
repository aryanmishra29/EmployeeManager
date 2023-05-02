package com.aryancodes.departmentservice.repository;

import com.aryancodes.departmentservice.model.Department;
import com.mongodb.lang.NonNull;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DepartmentRepository extends MongoRepository<Department, Long> {

    @NonNull
    public Optional<Department> findById(@NonNull Long id);


}
