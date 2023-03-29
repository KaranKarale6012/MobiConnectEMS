package com.mobiconnect.entities;

import java.util.List;
import java.util.Set;

import jakarta.persistence.*;
import org.springframework.transaction.annotation.Transactional;

import lombok.Data;
import lombok.NoArgsConstructor;

//The primary motive or function of entity is to create a blueprint of object which we will be manipulating
@Entity //this will map class  to a database table.
@Table(name = "EmployeeTable") //This is name of table
public class EmployeeTable
{
    //Here the data members are created
    @Id //This will make id as a primary key
	@GeneratedValue(strategy=GenerationType.IDENTITY) //This will automatically increment id
	@Column(name = "Id") //This is column name
    private int id;
    private String name;
    private String email;
    private String contact;
    private String gender;
    private String dob;
    private String designation;
    private String address;
    private String work_location;
    private String date_of_joining;
    private String date_of_exit;
    private String manager;
    private String total_leaves;
    private String leave_balance;
    //default constructor
    public EmployeeTable ()
    {
        System.out.println("default Employee created");
    }
    //parameterize constructor
    public EmployeeTable(int id, String name, String email, String contact, String gender, String dob,
                         String designation, String address, String work_location, String date_of_joining, String date_of_exit,
                         String manager, String total_leaves, String leave_balance) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.contact = contact;
        this.gender = gender;
        this.dob = dob;
        this.designation = designation;
        this.address = address;
        this.work_location = work_location;
        this.date_of_joining = date_of_joining;
        this.date_of_exit = date_of_exit;
        this.manager = manager;
        this.total_leaves = total_leaves;
        this.leave_balance = leave_balance;
    }
    //getter and setter for data member
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getContact() {
        return contact;
    }
    public void setContact(String contact) {
        this.contact = contact;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getWork_location() {
        return work_location;
    }
    public void setWork_location(String work_location) {
        this.work_location = work_location;
    }
    public String getDate_of_joining() {
        return date_of_joining;
    }
    public void setDate_of_joining(String date_of_joining) {
        this.date_of_joining = date_of_joining;
    }
    public String getDate_of_exit() {
        return date_of_exit;
    }
    public void setDate_of_exit(String date_of_exit) {
        this.date_of_exit = date_of_exit;
    }
    public String getManager() {
        return manager;
    }
    public void setManager(String manager) {
        this.manager = manager;
    }
    public String getTotal_leaves() {
        return total_leaves;
    }
    public void setTotal_leaves(String total_leaves) {
        this.total_leaves = total_leaves;
    }
    public String getLeave_balance() {
        return leave_balance;
    }
    public void setLeave_balance(String leave_balance) {
        this.leave_balance = leave_balance;
    }



    @ManyToMany( cascade = CascadeType.ALL, mappedBy = "employeeTable")
 	private List<ProjectTable>projectTable;

    //for bidirectional table
//    @OneToMany
//    private List<Timesheeet_TBL>Timesheeet_TBL;

}
