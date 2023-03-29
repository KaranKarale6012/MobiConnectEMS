package com.mobiconnect.entities;


import jakarta.persistence.*;

@Entity
@Table(name ="Leave_TBL")
public class Leave_TBL {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "Id")
    private  int id;

    private String start_date;
    private String end_date;
    private String day;
    private String approver;
    private String status;

    @ManyToOne
    private EmployeeTable employeeTable;

    public Leave_TBL() {
    }

    public Leave_TBL(int id, String start_date, String end_date, String day, String approver, String status, EmployeeTable employeeTable) {
        this.id = id;
        this.start_date = start_date;
        this.end_date = end_date;
        this.day = day;
        this.approver = approver;
        this.status = status;
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

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
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

    public EmployeeTable getEmployeeTable() {
        return employeeTable;
    }

    public void setEmployeeTable(EmployeeTable employeeTable) {
        this.employeeTable = employeeTable;
    }
}
