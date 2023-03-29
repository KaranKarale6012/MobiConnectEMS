package com.mobiconnect.repositories;


import com.mobiconnect.entities.Timesheet_day_TBL;
import org.springframework.data.repository.CrudRepository;

public interface Timesheet_day_TBLRepository extends CrudRepository<Timesheet_day_TBL,Integer> {

    public Timesheet_day_TBL findById(int id);

    public void save(int tmdId);



}
