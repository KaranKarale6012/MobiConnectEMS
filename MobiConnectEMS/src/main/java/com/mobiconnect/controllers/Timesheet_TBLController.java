package com.mobiconnect.controllers;


import com.mobiconnect.entities.ProjectTable;
import com.mobiconnect.entities.Timesheet_TBL;
import com.mobiconnect.services.Timesheet_TBLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class Timesheet_TBLController {

    @Autowired
    private Timesheet_TBLService timesheet_TBLService;

    @GetMapping("/Timesheet_TBLs")
    public ResponseEntity<List<Timesheet_TBL>> getAllTimesheet_TBL()
    {
        List<Timesheet_TBL>list=timesheet_TBLService.getAllTimesheet_TBL();
        if(list.size()<=0)
        {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(list));
    }

    @GetMapping("/Timesheet_TBL/{id}")
    public ResponseEntity<Timesheet_TBL> getTimesheet_TBLById(@PathVariable("id")int id)
    {
        Timesheet_TBL timesheet_TBL=timesheet_TBLService.getTimesheet_TBLById(id);
        if(timesheet_TBL==null)
        {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(timesheet_TBL));
    }

    @PutMapping("/Timesheet_TBL/{Id}")
    public ResponseEntity<Timesheet_TBL>updateTimesheet_TBL(@RequestBody Timesheet_TBL timesheet_TBL, @PathVariable("Id")int Id)
    {
        try{
            this.timesheet_TBLService.updateTimesheet_TBL(timesheet_TBL,Id);
            return ResponseEntity.ok().body(timesheet_TBL);
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @DeleteMapping("/Timesheet_TBL/{Id}")
    public ResponseEntity<Void> deleteTimesheet_TBL(@PathVariable("Id")int Id)
    {
        try{
            this.timesheet_TBLService.deleteTimesheet_TBL(Id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        catch(Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    //Timesheet_TBL
    //Timesheet_TBLRepository
    //timesheet_TBLService
    @PostMapping("/Timesheet_TBL")
    public ResponseEntity<Optional<Timesheet_TBL>> addTimesheet_TBL(@RequestBody Timesheet_TBL timesheet_TBL)
    {
        Timesheet_TBL p=null;
        try{
            p=this.timesheet_TBLService.addTimesheet_TBL(timesheet_TBL);
            System.out.println(timesheet_TBL);
            return ResponseEntity.ok(Optional.of(p));
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }





}
