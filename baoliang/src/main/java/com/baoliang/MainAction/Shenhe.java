package com.baoliang.MainAction;

import java.util.List;

import org.json.JSONException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.baoliang.Model.ApplicationDaoImp;
import com.baoliang.Model.boss;
import com.baoliang.Model.bossDaoImp;
import com.baoliang.Tools.jsontools;
import com.opensymphony.xwork2.ActionSupport;

public class Shenhe extends ActionSupport {

	int flag;
	private String description;
	private String phone;
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
	public boss getBossdata() {
		return bossdata;
	}
	public void setBossdata(boss bossdata) {
		this.bossdata = bossdata;
	}
	String shenhe;
	public String getShenhe() {
		return shenhe;
	}
	public void setShenhe(String shenhe) {
		this.shenhe = shenhe;
	}
	boss bossdata;
	public String getinfo()
	{
		try {
			ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{ "applicationContext.xml"});
			bossDaoImp bo= (bossDaoImp) context.getBean("bossDaoImp");
			List<boss> objlist=bo.findalluser(3);
			bossdata=objlist.get(flag);
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
			return ERROR;
		} 
		return SUCCESS;
	}
	public String getshenheall() throws JSONException, IllegalArgumentException, IllegalAccessException
	{
		
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{ "applicationContext.xml"});
		bossDaoImp bo= (bossDaoImp) context.getBean("bossDaoImp");
		List<boss> objlist=bo.findalluser(3);
		setShenhe(jsontools.tojsonForNoArray(objlist,boss.class));
		return SUCCESS;
	}
	/**
	 * 提交申请结果
	 * @return
	 */
	public String commitshenheres()
	{
		
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{ "applicationContext.xml"});
		bossDaoImp bo= (bossDaoImp) context.getBean("bossDaoImp");
		bo.updateShenheRes(getPhone(), getDescription(),flag);
		
		return SUCCESS;
	}
	
	
	
	public String getuserstatue()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{ "applicationContext.xml"});
		bossDaoImp bo= (bossDaoImp) context.getBean("bossDaoImp");
		boss bosmodel;
		if(bo.finduserbyphone(phone).size()!=0)
			{bosmodel=bo.finduserbyphone(phone).get(0);
		setDescription(bosmodel.getDescription());
		setFlag(bosmodel.getVerify());}
		return SUCCESS;
	}
}
