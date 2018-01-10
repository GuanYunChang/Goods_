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
		return SUCCESS;
	}
}
