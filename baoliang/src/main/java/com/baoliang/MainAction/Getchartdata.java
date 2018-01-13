/**
 *This is baoliang project
 *@author:baoliang
 **/
package com.baoliang.MainAction;

import org.json.JSONException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.baoliang.Model.Application;
import com.baoliang.Model.ApplicationDaoImp;
import com.baoliang.Tools.jsontools;
import com.opensymphony.xwork2.ActionSupport;

public class Getchartdata extends ActionSupport{

	private String jsonString;
	private String index;
	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getJsonString() {
		return jsonString;
	}

	public void setJsonString(String jsonString) {
		this.jsonString = jsonString;
	}

	public String getApasData()
	{
		
		
		return SUCCESS;
	}
	
	public String getApplicationData() throws JSONException, IllegalArgumentException, IllegalAccessException
	{
		switch(Integer.parseInt(getIndex()))
		{case 1:
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{ "applicationContext.xml"});
		ApplicationDaoImp apc= (ApplicationDaoImp) context.getBean("ApplicationDaoImp");
		jsonString=jsontools.tojsonForNoArray(apc.findAll(), Application.class);
		System.out.println(jsonString);
		break;
		}
		return SUCCESS;
	}
}
