package com.mobiconnect.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

//The primary motive or function of entity is to create a blueprint of object which we will be manipulating
@Entity //this will map class  to a database table.
@Table(name = "ProjectTable") //This is name of table
public class ProjectTable
{
	//Here the data members are created
	@Id //This will make id as a primary key
	@GeneratedValue(strategy=GenerationType.IDENTITY) //This will automatically increment id
	@Column(name = "Id") //This is column name
	private int id;
	private String name;
	private String owner_client;
	private String owner_consultant;
	private String start_date;
	private String end_date;
	private String status;
	//parameterize constructor
	public ProjectTable(int id, String name, String owner_client, String owner_consultant, String start_date,
						String end_date, String status, List<EmployeeTable> employeeTable) {
		this.id = id;
		this.name = name;
		this.owner_client = owner_client;
		this.owner_consultant = owner_consultant;
		this.start_date = start_date;
		this.end_date = end_date;
		this.status = status;
		this.employeeTable = employeeTable;
	}
	//default constructor
	public ProjectTable()
	{
		System.out.println("default Project created");
	}
	@ManyToOne
    @JoinColumn(name = "ClientIDFK")
	private ClientTable clientTable;

	@ManyToMany(cascade = CascadeType.ALL)
	//@ManyToMany(mappedBy = "projectTable",fetch = FetchType.LAZY)
	private List<EmployeeTable>employeeTable;
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

	public String getOwner_client() {
		return owner_client;
	}

	public void setOwner_client(String owner_client) {
		this.owner_client = owner_client;
	}

	public String getOwner_consultant() {
		return owner_consultant;
	}

	public void setOwner_consultant(String owner_consultant) {
		this.owner_consultant = owner_consultant;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<EmployeeTable> getEmployeeTable() {
		return employeeTable;
	}

	public void setEmployeeTable(List<EmployeeTable> employeeTable) {
		this.employeeTable = employeeTable;
	}

	public ClientTable getClientTable() {
		return clientTable;
	}

	public void setClientTable(ClientTable clientTable) {
		this.clientTable = clientTable;
	}

}