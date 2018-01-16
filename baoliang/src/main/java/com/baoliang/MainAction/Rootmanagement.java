/**
 *This is baoliang project
 *@author:baoliang
 **/
package com.baoliang.MainAction;

import org.json.JSONException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.baoliang.Model.Manager;
import com.baoliang.Model.ManagerDaoImp;
import com.baoliang.Tools.jsontools;
import com.opensymphony.xwork2.ActionSupport;

public class Rootmanagement extends ActionSupport {

	private String managers;
	private String phone;
	private String name;
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getManagers() {
		return managers;
	}


	public void setManagers(String managers) {
		this.managers = managers;
	}


	/**
	 * 获取管理员列表
	 * @return
	 * @throws IllegalAccessException 
	 * @throws IllegalArgumentException 
	 * @throws JSONException 
	 */
	public String getmanagerlist() throws JSONException, IllegalArgumentException, IllegalAccessException
	{
		ApplicationContext context= new ClassPathXmlApplicationContext(new String[]{ "applicationContext.xml"});
		ManagerDaoImp mg= (ManagerDaoImp) context.getBean("ManagerDaoImp");
		setManagers(jsontools.tojsonForNoArray(mg.findAll(), Manager.class));
		
		return SUCCESS;
	}
	public String deletemanager()
	{
		ApplicationContext context= new ClassPathXmlApplicationContext(new String[]{ "applicationContext.xml"});
		ManagerDaoImp mg= (ManagerDaoImp) context.getBean("ManagerDaoImp");
		mg.delete(phone);
		return SUCCESS;
	}
	
	public String editemanager()
	{
		ApplicationContext context= new ClassPathXmlApplicationContext(new String[]{ "applicationContext.xml"});
		ManagerDaoImp mg= (ManagerDaoImp) context.getBean("ManagerDaoImp");
		mg.updateinfo(getPhone(), getName());
		return SUCCESS;
	}
	
	public String editemanagerforward()
	{
		System.out.println("过渡"+getPhone()+","+getName());
		
		return SUCCESS;
	}
	/**
	 * 修改管理员信息
	 * @return
	 */
	public String editinfo()
	{
		
		ApplicationContext context= new ClassPathXmlApplicationContext(new String[]{ "applicationContext.xml"});
		ManagerDaoImp mg= (ManagerDaoImp) context.getBean("ManagerDaoImp");
		mg.updateinfo(getPhone(), getName());
		return SUCCESS;
	}
}
