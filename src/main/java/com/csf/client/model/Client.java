package com.csf.client.model;

import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.Id;  
import javax.persistence.Table;  
//mark class as an Entity   
@Entity  
//defining class name as Table name  
@Table  
public class Client  
{  
	//Defining book id as primary key  
	@Id  
	@Column  
	private int id;  
	@Column  
	private String name;  
	@Column  
	private String Tel;  
	@Column  
	private String email;
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
	public String getTel() {
		return Tel;
	}
	public void setTel(String tel) {
		Tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Client [id=" + id + ", name=" + name + ", Tel=" + Tel + ", email=" + email + "]";
	}

}
