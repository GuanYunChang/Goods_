/**
 *This is baoliang project
 *@author:baoliang
 **/
package com.baoliang.Model;

public class Manager implements java.io.Serializable{

	private String phone;
	private String pass;
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
