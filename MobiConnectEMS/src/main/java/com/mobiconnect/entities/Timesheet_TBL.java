package com.mobiconnect.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "Timesheet_TBL")
public class Timesheet_TBL {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;
    private String start_date;
    private String end_date;
    private int total_hours;
    private int leave_hours;
    private int holiday_hours;
    private String approver;
    private String status;


    @ManyToOne
    private EmployeeTable employeeTable;

    public Timesheet_TBL() {
    }

    public Timesheet_TBL(int id, String start_date, String end_date, int total_hours, int leave_hours, int holiday_hours, String approver, String status, EmployeeTable employeeTable) {
        this.id = id;
        this.start_date = start_date;
        this.end_date = end_date;
        this.total_hours = total_hours;
        this.leave_hours = leave_hours;
        this.holiday_hours = holiday_hours;
        this.approver = approver;
        this.status = status;
        this.employeeTable = employeeTable;
    }

    public EmployeeTable getEmployeeTable() {
        return employeeTable;
    }

    public void setEmployeeTable(EmployeeTable employeeTable) {
        this.employeeTable = employeeTable;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public int getTotal_hours() {
        return total_hours;
    }

    public void setTotal_hours(int total_hours) {
        this.total_hours = total_hours;
    }

    public int getLeave_hours() {
        return leave_hours;
    }

    public void setLeave_hours(int leave_hours) {
        this.leave_hours = leave_hours;
    }

    public int getHoliday_hours() {
        return holiday_hours;
    }

    public void setHoliday_hours(int holiday_hours) {
        this.holiday_hours = holiday_hours;
    }

    public String getApprover() {
        return approver;
    }

    public void setApprover(String approver) {
        this.approver = approver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}
