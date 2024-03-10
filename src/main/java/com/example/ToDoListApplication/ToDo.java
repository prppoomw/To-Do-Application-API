package com.example.ToDoListApplication;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "todo")
public class ToDo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String task;
	private Date date;
	private boolean isdone;
	
	public ToDo() {
		super();
	}
	
	public ToDo(Integer id, String username, String task, Date date, boolean isdone) {
		super();
		this.id = id;
		this.task = task;
		this.date = date;
		this.isdone = isdone;
	}
	
	public Integer getId() {
		return this.id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getTask() {
		return this.task;
	}
	
	public void setTask(String task) {
		this.task = task;
	}
	
	public Date getDate() {
		return this.date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public boolean getIsdone() {
		return this.isdone;
	}
	
	public void setIsdone(boolean isdone) {
		this.isdone = isdone;
	}
	
}
