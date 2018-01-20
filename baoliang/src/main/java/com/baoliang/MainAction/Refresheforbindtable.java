/**
 *This is baoliang project
 *@author:baoliang
 **/
package com.baoliang.MainAction;

import java.util.Calendar;
import java.util.List;

import org.json.JSONException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.baoliang.Model.Application;
import com.baoliang.Model.ApplicationDaoImp;
import com.baoliang.Tools.jsontools;
import com.opensymphony.xwork2.ActionSupport;

public class Refresheforbindtable  extends ActionSupport {

	private int pagesum;
	public int getPagesum() {
		return pagesum;
	}



	public void setPagesum(int pagesum) {
		this.pagesum = pagesum;
	}



	private int indexup;
	public int getIndexup() {
		return indexup;
	}



	public void setIndexup(int indexup) {
		this.indexup = indexup;
	}



	public int getIndexdown() {
		return indexdown;
	}



	public void setIndexdown(int indexdown) {
		this.indexdown = indexdown;
	}



	public String getDataup() {
		return dataup;
	}



	public void setDataup(String dataup) {
		this.dataup = dataup;
	}



	public String getDatadown() {
		return datadown;
	}



	public void setDatadown(String datadown) {
		this.datadown = datadown;
	}



	private int indexdown;
	private String dataup;
	private String datadown;
	public String getFlag() {
		return flag;
	}



	public void setFlag(String flag) {
		this.flag = flag;
	}



	private String flag="false";
	
	
	public String refreshtableup() throws JSONException, IllegalArgumentException, IllegalAccessException 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{ "applicationContext.xml"});
		ApplicationDaoImp apc= (ApplicationDaoImp) context.getBean("ApplicationDaoImp");
		List objlist=apc.findAll("1");
		Integer sum=objlist.size();
		Integer start=(getPagesum()-1)*getIndexup()+1;
		if(start<1)
			start=1;
		
		Integer end=start+getPagesum();
		if(end>sum)
		{
			end=sum;
			setFlag("true");
		}
		if(start>end-getPagesum())
			start=end-getPagesum();
			objlist=objlist.subList(start, end);
			System.out.println("start:"+start+",end:"+end);
		setDataup(jsontools.tojsonForNoArray(objlist,Application.class ));
		return SUCCESS;
		
		
	}
}
