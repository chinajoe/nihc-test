package com.soft.entity;

import java.sql.Date;

/**
 * user µÃÂ
 * 
 * @author JOE
 *
 */
public class UserInfo {

	private long id;
	
	private String name;
	
	private Date createdDate;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void kk(){
		System.out.println("ni qu");
	}
	
	public void add(){
		System.out.println("wo qu");
	}
	
	public void ca(){
		System.out.println("go on");
	}
	
	public void jj(){
		System.out.println("go on 2");
	}
}
