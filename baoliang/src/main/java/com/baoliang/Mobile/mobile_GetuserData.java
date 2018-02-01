package com.baoliang.Mobile;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.ServletActionContext;
import org.json.JSONException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.baoliang.Model.Application;
import com.baoliang.Model.ApplicationDaoImp;
import com.baoliang.Model.Drivers;
import com.baoliang.Model.DriversDaoImp;
import com.baoliang.Tools.jsontools;
import com.baoliang.Tools.netTools;
import com.opensymphony.xwork2.ActionSupport;

public class mobile_GetuserData extends ActionSupport{

	private String acnum;
	public String getAcnum() {
		return acnum;
	}
	public void setAcnum(String acnum) {
		this.acnum = acnum;
	}
	private String pass;
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	private String drivernums;
	public String getDrivernums() {
		return drivernums;
	}
	public void setDrivernums(String drivernums) {
		this.drivernums = drivernums;
	}
	//返回用户的信息
	public void getUserData() throws JSONException, IllegalArgumentException, IllegalAccessException
	{
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{ "applicationContext.xml"});
		DriversDaoImp dmp=(DriversDaoImp)context.getBean("DriversDaoImp");
		HttpServletResponse response = ServletActionContext.getResponse();
		String userdata=jsontools.tojsonForNoArray(dmp.findByphone(getDrivernums()), Drivers.class);
		netTools.json(response, userdata, "utf-8");
	}
	//返回的是用户正在完成的订单
	public void m_getUserDoing() throws JSONException, IllegalArgumentException, IllegalAccessException
	{
		System.out.println("正在查询"+getDrivernums());
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{ "applicationContext.xml"});
		ApplicationDaoImp ap=(ApplicationDaoImp)context.getBean("ApplicationDaoImp");
		HttpServletResponse response = ServletActionContext.getResponse();
		String userdata=jsontools.tojsonForNoArray(ap.Mobile_findUserDoing(getDrivernums()), Application.class);
		System.out.println("正在查询"+getDrivernums());
		netTools.json(response, userdata, "utf-8");
	}
	//设置订单完成
	public void m_setApplicationFinished()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{ "applicationContext.xml"});
		ApplicationDaoImp ap=(ApplicationDaoImp)context.getBean("ApplicationDaoImp");
		HttpServletResponse response = ServletActionContext.getResponse();
		boolean flag=ap.Mobile_setStatue(getAcnum());
		if(flag)
		netTools.json(response, "{\"statue\":\"ture\"}", "utf-8");
		else
		netTools.json(response, "{\"statue\":\"false\"}", "utf-8");
	}
	/**
	 * 设置手机端修改密码
	 * @return
	 */
	public void m_setUserPassword()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{ "applicationContext.xml"});
		DriversDaoImp dmp=(DriversDaoImp)context.getBean("DriversDaoImp");
		HttpServletResponse response = ServletActionContext.getResponse();
		
		if(dmp.setpass(getPass(), getDrivernums()))
		{
		netTools.json(response, "{\"statue\":\"true\"}", "utf-8");
		}else
		{
		netTools.json(response, "{\"statue\":\"false\"}", "utf-8");
		}
		
	}
	/**
	 * 获取自己已经完成的订单
	 * @throws IllegalAccessException 
	 * @throws IllegalArgumentException 
	 * @throws JSONException 
	 */
	public void getFinishedAp() throws JSONException, IllegalArgumentException, IllegalAccessException
	{
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{ "applicationContext.xml"});
		ApplicationDaoImp ap=(ApplicationDaoImp)context.getBean("ApplicationDaoImp");
		HttpServletResponse response = ServletActionContext.getResponse();
		String data=jsontools.tojsonForNoArray(ap.FindFinishedApBydrivernum(getDrivernums()),Application.class);
		netTools.json(response, data, "utf-8");
		
	}
}
