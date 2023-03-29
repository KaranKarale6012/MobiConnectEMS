package com.mobiconnect.services;



import com.mobiconnect.entities.ProjectTable;
import com.mobiconnect.entities.Timesheet_TBL;
import com.mobiconnect.repositories.Timesheet_TBLRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Timesheet_TBLService {

    @Autowired
    private Timesheet_TBLRepository timesheet_TBLRepository;

    public List<Timesheet_TBL> getAllTimesheet_TBL()
    {
        List<Timesheet_TBL>list=(List<Timesheet_TBL>)this.timesheet_TBLRepository.findAll();
        return list;
    }

    public Timesheet_TBL getTimesheet_TBLById(int id)
    {
        Timesheet_TBL timesheet_TBL=null;
        try{
            timesheet_TBL=this.timesheet_TBLRepository.findById(id);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return timesheet_TBL;
    }

    public Timesheet_TBL addTimesheet_TBL(Timesheet_TBL p)
    {
        Timesheet_TBL result=timesheet_TBLRepository.save(p);
        return result;
    }

    public void deleteTimesheet_TBL(int pid)
    {
        timesheet_TBLRepository.deleteById(pid);
    }

    public void updateTimesheet_TBL(Timesheet_TBL timesheet_TBL, int Id) {
        timesheet_TBL.setId(Id);
        timesheet_TBLRepository.save(timesheet_TBL);
    }


}
