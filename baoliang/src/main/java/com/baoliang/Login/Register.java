/**
 *This is baoliang project
 *@author:baoliang
 **/
package com.baoliang.Login;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.baoliang.Model.bossDaoImp;
import com.opensymphony.xwork2.ActionSupport;

public class Register extends ActionSupport {

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
	private String statue;
	public String getStatue() {
		return statue;
	}
	public void setStatue(String statue) {
		this.statue = statue;
	}
	
	public String Login() {
		
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{ "applicationContext.xml"});
		bossDaoImp bo=(bossDaoImp)context.getBean("bossDaoImp");
		if(bo.confirm(getPhone(),getPassword() )==false)
		{
			this.statue="false";
			System.out.println("======"+getPhone()+"====="+getPassword());
			return ERROR;
		}
		return SUCCESS;
	}
	
	public String Register()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{ "applicationContext.xml"});
		bossDaoImp bo=(bossDaoImp)context.getBean("bossDaoImp");
		bo.save(getPhone(), getPassword(), getName());
		return SUCCESS;
	}
}
