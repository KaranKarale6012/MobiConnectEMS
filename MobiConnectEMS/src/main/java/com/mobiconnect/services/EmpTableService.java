package com.mobiconnect.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mobiconnect.entities.EmployeeTable;
import com.mobiconnect.repositories.EmpTableRepository;

@Component
public class EmpTableService {
    @Autowired
    private EmpTableRepository empTableRepository;
     //get all books
     public List<EmployeeTable> getAllEmp()
     {
         List<EmployeeTable>list=(List<EmployeeTable>)this.empTableRepository.findAll();
         return list;
     }
      //get single emp by id
    public EmployeeTable getEmpById(int id)
    {
        EmployeeTable employeeTable=null;
        try{
        employeeTable=this.empTableRepository.findById(id);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return employeeTable;
    }
     //adding the emp
     public EmployeeTable addEmp(EmployeeTable e1)
     {
         EmployeeTable result=empTableRepository.save(e1);
         return result;
     }
      //delete the emp
    public void deleteEmp(int eid)
    {
    
        empTableRepository.deleteById(eid);
    }
    //update the emp
    public void updateEmp(EmployeeTable employeeTable,int empId)
    {
        employeeTable.setId(empId);
        empTableRepository.save(employeeTable);
    }
}
