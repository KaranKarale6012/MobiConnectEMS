package com.mobiconnect.repositories;

import org.springframework.data.repository.CrudRepository;

import com.mobiconnect.entities.ClientTable;

public interface ClientTableRepository extends CrudRepository<ClientTable,Integer>{
    public ClientTable findById(int id);

    public void save(int clientId);

}

    