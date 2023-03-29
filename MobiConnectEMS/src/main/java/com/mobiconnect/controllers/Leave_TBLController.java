package com.mobiconnect.controllers;


import com.mobiconnect.entities.Leave_TBL;
import com.mobiconnect.entities.Timesheet_TBL;
import com.mobiconnect.services.Leave_TBLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class Leave_TBLController {

    @Autowired
    private Leave_TBLService leave_TBLService;



    @GetMapping("/Leave_TBL")
    public ResponseEntity<List<Leave_TBL>> getAllLeave_TBL()
    {
        List<Leave_TBL>list=leave_TBLService.getAllLeave_TBL();
        if(list.size()<=0)
        {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(list));
    }

    @GetMapping("/Leave_TBL/{id}")
    public ResponseEntity<Leave_TBL> getLeave_TBLById(@PathVariable("id")int id)
    {
        Leave_TBL leave_TBL=leave_TBLService.getLeave_TBLById(id);
        if(leave_TBL==null)
        {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(leave_TBL));
    }

    @PutMapping("/Leave_TBL/{Id}")
    public ResponseEntity<Leave_TBL>updateLeave_TBL(@RequestBody Leave_TBL leave_TBL, @PathVariable("Id")int Id)
    {
        try{
            this.leave_TBLService.updateLeave_TBL(leave_TBL,Id);
            return ResponseEntity.ok().body(leave_TBL);
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    //Leave_TBL
    //Leave_TBLService
    @DeleteMapping("/Leave_TBL/{Id}")
    public ResponseEntity<Void> deleteLeave_TBL(@PathVariable("Id")int Id)
    {
        try{
            this.leave_TBLService.deleteLeave_TBL(Id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        catch(Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PostMapping("/Leave_TBL")
    public ResponseEntity<Optional<Leave_TBL>> addLeave_TBL(@RequestBody Leave_TBL leave_TBL)
    {
        Leave_TBL p=null;
        try{
            p=this.leave_TBLService.addLeave_TBL(leave_TBL);
            System.out.println(leave_TBL);
            return ResponseEntity.ok(Optional.of(p));
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }


}
