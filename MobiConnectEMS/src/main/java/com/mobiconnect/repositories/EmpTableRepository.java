package com.mobiconnect.repositories;

import org.springframework.data.repository.CrudRepository;

import com.mobiconnect.entities.EmployeeTable;

public interface EmpTableRepository extends CrudRepository<EmployeeTable,Integer>{
    public EmployeeTable findById(int id);

    public void save(int empId);

    
}
