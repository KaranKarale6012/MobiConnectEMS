package com.mobiconnect.services;


import com.mobiconnect.entities.Timesheet_TBL;
import com.mobiconnect.entities.Timesheet_day_TBL;
import com.mobiconnect.repositories.Timesheet_day_TBLRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Timesheet_day_TBLService {

    @Autowired
    private Timesheet_day_TBLRepository timesheet_day_TBLRepository;

    //Timesheet_day_TBL
    //Timesheet_day_TBLService
    //timesheet_day_TBLRepository
    public List<Timesheet_day_TBL> getAllTimesheet_day_TBL()
    {
        List<Timesheet_day_TBL>list=(List<Timesheet_day_TBL>)this.timesheet_day_TBLRepository.findAll();
        return list;
    }

    public Timesheet_day_TBL getTimesheet_day_TBLById(int id)
    {
        Timesheet_day_TBL timesheet_day_TBL=null;
        try{
            timesheet_day_TBL=this.timesheet_day_TBLRepository.findById(id);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return timesheet_day_TBL;
    }

    public Timesheet_day_TBL addTimesheet_day_TBL(Timesheet_day_TBL p)
    {
        Timesheet_day_TBL result=timesheet_day_TBLRepository.save(p);
        return result;
    }

    public void deleteTimesheet_day_TBL(int pid)
    {
        timesheet_day_TBLRepository.deleteById(pid);
    }

    public void updateTimesheet_day_TBL(Timesheet_day_TBL timesheet_day_TBL, int Id) {
        timesheet_day_TBL.setId(Id);
        timesheet_day_TBLRepository.save(timesheet_day_TBL);
    }


}
