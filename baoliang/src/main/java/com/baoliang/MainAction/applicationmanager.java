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

public class applicationmanager extends ActionSupport {
	private String longitudestart;
	private String latitudestart ;
	private String longitudedestination;
	private String latitudedestination;
	private String receiver;
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public String getLatitudedestination() {
		return latitudedestination;
	}
	public void setLatitudedestination(String latitudedestination) {
		this.latitudedestination = latitudedestination;
	}
	public String getLongitudestart() {
		return longitudestart;
	}
	public void setLongitudestart(String longitudestart) {
		this.longitudestart = longitudestart;
	}
	public String getLatitudestart() {
		return latitudestart;
	}
	public void setLatitudestart(String latitudestart) {
		this.latitudestart = latitudestart;
	}
	public String getLongitudedestination() {
		return longitudedestination;
	}
	public void setLongitudedestination(String longitudedestination) {
		this.longitudedestination = longitudedestination;
	}
	

	private String acnum;
	private String boss;
	private String phone;
	private String goods;
	private String start;
	private String destination;
	private String drivernum;
	private String statue;
	private String car;
	private String weight;
	private String jsonString;
	public String getJsonString() {
		return jsonString;
	}
	public void setJsonString(String jsonString) {
		this.jsonString = jsonString;
	}
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
	
	/**
	 * ±‡º≠∂©µ•
	 * @return
	 */
	public String editforapplication1()
	{
		System.out.println(getLongitudedestination()+"ÁºñËæëËÆ¢Âçïfor tableno "+getLatitudedestination());
		return SUCCESS;
	}
	public String editforapplication2()
	{
		
		System.out.println("ÁºñËæëËÆ¢Âçïfor tableyes"+getLatitudedestination());
		return SUCCESS;
	}
	
	public String deletedforpalication()
	{
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{ "applicationContext.xml"});
		ApplicationDaoImp ap= (ApplicationDaoImp) context.getBean("ApplicationDaoImp");
		ap.delete(getAcnum());
		return SUCCESS;
		
	}
	
	public String saveappliaction()
	{
		
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{ "applicationContext.xml"});
		ApplicationDaoImp ap= (ApplicationDaoImp) context.getBean("ApplicationDaoImp");
		ap.update(getAcnum(), getBoss(), getPhone(), getGoods(), getStart(), getDestination(), getWeight(),getLongitudestart(),getLatitudestart(),getLongitudedestination(),getLatitudedestination());
		return SUCCESS;
	}
	
	
	public String commitapplication()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{ "applicationContext.xml"});
		ApplicationDaoImp ap= (ApplicationDaoImp) context.getBean("ApplicationDaoImp");
		ap.save(boss, phone, goods, start, destination, "1", weight,getLongitudestart(),getLatitudestart(),getLongitudedestination(),getLatitudedestination(),getReceiver());
		return SUCCESS;
	}
	
	public  String searchbyacnum() throws JSONException, IllegalArgumentException, IllegalAccessException
	{
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{ "applicationContext.xml"});
		ApplicationDaoImp ap= (ApplicationDaoImp) context.getBean("ApplicationDaoImp");
		setJsonString(jsontools.tojsonForNoArray(ap.findAllbyacmnum(acnum), Application.class));
		return SUCCESS;
	}
	
	public String saveappliactionyes()
	{
		
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{ "applicationContext.xml"});
		ApplicationDaoImp ap= (ApplicationDaoImp) context.getBean("ApplicationDaoImp");
		ap.updatetableyes(acnum, boss, phone, goods, start, destination, weight, car, drivernum,getLongitudestart(),getLatitudestart(),getLongitudedestination(),getLatitudedestination());
		
		return SUCCESS;
	}
	
	
}
