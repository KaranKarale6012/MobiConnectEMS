package com.mobiconnect.repositories;

import org.springframework.data.repository.CrudRepository;

import com.mobiconnect.entities.ProjectTable;

public interface ProjectTableRepository extends CrudRepository<ProjectTable,Integer>{
    public ProjectTable findById(int id);
    public void save(int projectId);

}
