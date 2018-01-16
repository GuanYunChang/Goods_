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
import com.baoliang.Model.Drivers;
import com.baoliang.Model.DriversDaoImp;
import com.baoliang.Tools.jsontools;
import com.opensymphony.xwork2.ActionSupport;

public class Getchartdata extends ActionSupport{

	private String jsonString;
	private String index;
	private Integer taketable1;
	private Integer taketable2;
	private Integer taketable3;
	public String getIndex() {
		return index;
	}

	public Integer getTaketable1() {
		return taketable1;
	}

	public void setTaketable1(Integer taketable1) {
		this.taketable1 = taketable1;
	}

	public Integer getTaketable2() {
		return taketable2;
	}

	public void setTaketable2(Integer taketable2) {
		this.taketable2 = taketable2;
	}

	public Integer getTaketable3() {
		return taketable3;
	}

	public void setTaketable3(Integer taketable3) {
		this.taketable3 = taketable3;
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

	public String getcountofmaintable()
	{
		
		try {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{ "applicationContext.xml"});
		ApplicationDaoImp apc= (ApplicationDaoImp) context.getBean("ApplicationDaoImp");
		Integer[] data=apc.getcountofmaintable();
		setTaketable1(data[0]);
		setTaketable2(data[1]);
		setTaketable3(data[2]);
		}catch(Exception e)
		{
			
			return ERROR;
		}
		return SUCCESS;
	}
	
	public String getApplicationData() throws JSONException, IllegalArgumentException, IllegalAccessException
	{
		try {
		switch(Integer.parseInt(getIndex()))
		{case 1:
			ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{ "applicationContext.xml"});
			ApplicationDaoImp apc= (ApplicationDaoImp) context.getBean("ApplicationDaoImp");
			jsonString=jsontools.tojsonForNoArray(apc.findAll(getIndex()), Application.class);
			System.out.println(jsonString);
			
			break;
		case 2:
			ApplicationContext context2 = new ClassPathXmlApplicationContext(new String[]{ "applicationContext.xml"});
			DriversDaoImp drv= (DriversDaoImp) context2.getBean("DriversDaoImp");
			jsonString=jsontools.tojsonForNoArray(drv.findAll(getIndex()), Drivers.class);
			System.out.println(jsonString);
			break;
		case 3:
			ApplicationContext context3 = new ClassPathXmlApplicationContext(new String[]{ "applicationContext.xml"});
			ApplicationDaoImp apc3= (ApplicationDaoImp) context3.getBean("ApplicationDaoImp");
			jsonString=jsontools.tojsonForNoArray(apc3.findAll(getIndex()), Application.class);
			System.out.println(jsonString);
			break;
		case 4:
			ApplicationContext context4 = new ClassPathXmlApplicationContext(new String[]{ "applicationContext.xml"});
			ApplicationDaoImp apc4= (ApplicationDaoImp) context4.getBean("ApplicationDaoImp");
			jsonString=jsontools.tojsonForNoArray(apc4.findAll("2"), Application.class);
			System.out.println(jsonString);
			break;
		}
		}catch(Exception e)
		{
			return ERROR;
		}
		return SUCCESS;
	}
}
