package com.mobiconnect.repositories;



import com.mobiconnect.entities.Timesheet_TBL;
import org.springframework.data.repository.CrudRepository;

public interface Timesheet_TBLRepository extends CrudRepository<Timesheet_TBL,Integer> {

    public Timesheet_TBL findById(int id);

    public void save(int tmId);
}
