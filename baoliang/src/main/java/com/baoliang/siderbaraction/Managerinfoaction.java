/**
 *This is baoliang project
 *@author:baoliang
 **/
package com.baoliang.siderbaraction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.baoliang.Model.ManagerDaoImp;
import com.baoliang.Model.bossDaoImp;
import com.opensymphony.xwork2.ActionSupport;

public class Managerinfoaction extends ActionSupport{

	private String phone;
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String password;
	private String name;
	public String addManager()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{ "applicationContext.xml"});
		ManagerDaoImp mg= (ManagerDaoImp) context.getBean("ManagerDaoImp");
		mg.save(getPhone(), getPassword(), getName());
		return SUCCESS;
	}
}
