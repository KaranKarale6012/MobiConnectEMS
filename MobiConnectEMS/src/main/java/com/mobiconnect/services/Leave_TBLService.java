package com.mobiconnect.services;






import com.mobiconnect.repositories.Leave_TBLRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.mobiconnect.entities.Leave_TBL;

import java.util.List;

@Component
public class Leave_TBLService {

    @Autowired
    private Leave_TBLRepository leave_TBLRepository;


    public List<Leave_TBL> getAllLeave_TBL()
    {
        List<Leave_TBL>list=(List<Leave_TBL>)this.leave_TBLRepository.findAll();
        return list;
    }


    public Leave_TBL getLeave_TBLById(int id)
    {
        Leave_TBL leave_TBL=null;
        try{
            leave_TBL=this.leave_TBLRepository.findById(id);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return leave_TBL;
    }

    //Leave_TBL
    //leave_TBLRepository
    public Leave_TBL addLeave_TBL(Leave_TBL p)
    {
        Leave_TBL result=leave_TBLRepository.save(p);
        return result;
    }

    public void deleteLeave_TBL(int pid)
    {
        leave_TBLRepository.deleteById(pid);
    }

    public void updateLeave_TBL(Leave_TBL leave_TBL, int Id) {
        leave_TBL.setId(Id);
        leave_TBLRepository.save(leave_TBL);
    }



}
