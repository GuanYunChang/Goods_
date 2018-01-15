/**
 *This is baoliang project
 *@author:baoliang
 **/
package com.baoliang.Login;

import com.opensymphony.xwork2.ActionSupport;

public class Logforward extends ActionSupport {

	private String username;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
