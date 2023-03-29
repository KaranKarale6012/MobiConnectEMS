package com.mobiconnect.controllers;


import com.mobiconnect.entities.Timesheet_TBL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.mobiconnect.entities.Timesheet_day_TBL;
import com.mobiconnect.services.Timesheet_day_TBLService;

import java.util.List;
import java.util.Optional;

@RestController
public class Timesheet_day_TBLController {

    @Autowired
    private Timesheet_day_TBLService timesheet_day_TBLService;


    @GetMapping("/Timesheet_day_TBLs")
    public ResponseEntity<List<Timesheet_day_TBL>> getAllTimesheet_day_TBL()
    {
        List<Timesheet_day_TBL>list=timesheet_day_TBLService.getAllTimesheet_day_TBL();
        if(list.size()<=0)
        {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(list));
    }

    @GetMapping("/Timesheet_day_TBL/{id}")
    public ResponseEntity<Timesheet_day_TBL> getTimesheet_day_TBLById(@PathVariable("id")int id)
    {
        Timesheet_day_TBL timesheet_day_TBL=timesheet_day_TBLService.getTimesheet_day_TBLById(id);
        if(timesheet_day_TBL==null)
        {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(timesheet_day_TBL));
    }

    @PutMapping("/Timesheet_day_TBL/{Id}")
    public ResponseEntity<Timesheet_day_TBL>updateTimesheet_day_TBL(@RequestBody Timesheet_day_TBL timesheet_day_TBL, @PathVariable("Id")int Id)
    {
        try{
            this.timesheet_day_TBLService.updateTimesheet_day_TBL(timesheet_day_TBL,Id);
            return ResponseEntity.ok().body(timesheet_day_TBL);
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @DeleteMapping("/Timesheet_day_TBL/{Id}")
    public ResponseEntity<Void> deleteTimesheet_day_TBL(@PathVariable("Id")int Id)
    {
        try{
            this.timesheet_day_TBLService.deleteTimesheet_day_TBL(Id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        catch(Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PostMapping("/Timesheet_day_TBL")
    public ResponseEntity<Optional<Timesheet_day_TBL>> addTimesheet_day_TBL(@RequestBody Timesheet_day_TBL timesheet_day_TBL)
    {
        Timesheet_day_TBL p=null;
        try{
            p=this.timesheet_day_TBLService.addTimesheet_day_TBL(timesheet_day_TBL);
            System.out.println(timesheet_day_TBL);
            return ResponseEntity.ok(Optional.of(p));
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }



}
