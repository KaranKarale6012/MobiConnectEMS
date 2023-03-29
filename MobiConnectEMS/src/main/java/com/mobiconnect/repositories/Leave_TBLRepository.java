package com.mobiconnect.repositories;

import com.mobiconnect.entities.Leave_TBL;

import org.springframework.data.repository.CrudRepository;

public interface Leave_TBLRepository extends CrudRepository<Leave_TBL,Integer> {

    public Leave_TBL findById(int id);
    public void save(int lvId);
}
