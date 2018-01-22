/**
 *This is baoliang project
 *@author:baoliang
 **/
package com.baoliang.Useraction;

import org.json.JSONException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.baoliang.Model.Application;
import com.baoliang.Model.ApplicationDaoImp;
import com.baoliang.Tools.jsontools;
import com.opensymphony.xwork2.ActionSupport;

public class Getdata extends ActionSupport{

	private String acnum;
	public String getAcnum() {
		return acnum;
	}
	public void setAcnum(String acnum) {
		this.acnum = acnum;
	}
	public String getBoss() {
		return boss;
	}
	public void setBoss(String boss) {
		this.boss = boss;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getGoods() {
		return goods;
	}
	public void setGoods(String goods) {
		this.goods = goods;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDrivernum() {
		return drivernum;
	}
	public void setDrivernum(String drivernum) {
		this.drivernum = drivernum;
	}
	public String getStatue() {
		return statue;
	}
	public void setStatue(String statue) {
		this.statue = statue;
	}
	public String getCar() {
		return car;
	}
	public void setCar(String car) {
		this.car = car;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getLockversion() {
		return lockversion;
	}
	public void setLockversion(String lockversion) {
		this.lockversion = lockversion;
	}
	private String boss;
	private String phone;
	private String goods;
	private String start;
	private String destination;
	private String drivernum;
	private String statue;
	private String car;
	private String weight;
	private String lockversion;
	private String index;
	private String jsonString;
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
	public String getdata() throws JSONException, IllegalArgumentException, IllegalAccessException
	{
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{ "applicationContext.xml"});
		ApplicationDaoImp ap= (ApplicationDaoImp) context.getBean("ApplicationDaoImp");
		System.out.println("=================="+getIndex());
		switch(Integer.parseInt(getIndex()))
		{
		
		case 3:
			setJsonString(jsontools.tojsonForNoArray(ap.FindApplicationByUserPhoneForFinishedApplication(getPhone()), Application.class));
			break;
		case 2:
			setJsonString(jsontools.tojsonForNoArray(ap.FindApplicationByUserPhoneForNotFinishedApplication(getPhone()), Application.class));
			break;
		case 4:
			setJsonString(jsontools.tojsonForNoArray(ap.FindApplicationByUserPhoneForFinishedDistributionApplication(getPhone()),  Application.class));
			break;
		}
		return SUCCESS;
	}
	
	public String deleteforuser()
	{
		
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{ "applicationContext.xml"});
		ApplicationDaoImp ap= (ApplicationDaoImp) context.getBean("ApplicationDaoImp");
		ap.delete(getAcnum());
		return SUCCESS;
	}
	
	
}
