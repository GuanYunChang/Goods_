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
	 * 编辑订单申请
	 * @return
	 */
	public String editforapplication1()
	{
		System.out.println("编辑订单for tableno");
		return SUCCESS;
	}
	public String editforapplication2()
	{
		
		System.out.println("编辑订单for tableyes");
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
		ap.update(getAcnum(), getBoss(), getPhone(), getGoods(), getStart(), getDestination(), getWeight());
		return SUCCESS;
	}
	
	
	public String commitapplication()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{ "applicationContext.xml"});
		ApplicationDaoImp ap= (ApplicationDaoImp) context.getBean("ApplicationDaoImp");
		ap.save(boss, phone, goods, start, destination, "1", weight);
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
		ap.updatetableyes(acnum, boss, phone, goods, start, destination, weight, car, drivernum);
		
		return SUCCESS;
	}
	
	
}
