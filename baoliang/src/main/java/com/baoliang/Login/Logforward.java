/**
 *This is baoliang project
 *@author:baoliang
 **/
package com.baoliang.Login;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.baoliang.Model.bossDaoImp;
import com.opensymphony.xwork2.ActionSupport;

public class Logforward extends ActionSupport {

	private String username;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String execute() throws Exception {
		if(!Sessionverify.verify())
		{
			return ERROR;
		}
		System.out.println("execute()");
		return SUCCESS;
	}
	
	public String forward1()
	{
		
		
		if(!Sessionverify.verify())
		{
			return ERROR;
		}
		
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{ "applicationContext.xml"});
		bossDaoImp bo= (bossDaoImp) context.getBean("bossDaoImp");
		setName(bo.slectname(getUsername()));
		System.out.println("forward1()");
		return SUCCESS;
	}
	
	public String rootlogin()
	{
		

		if(!Sessionverify.verify())
		{
			return ERROR;
		}
		System.out.println("rootlogin");
		return SUCCESS;
	}
}
