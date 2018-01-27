package com.baoliang.Mobile;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;
import org.apache.struts2.ServletActionContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.baoliang.Model.DriversDaoImp;
import com.baoliang.Tools.netTools;
import com.opensymphony.xwork2.ActionSupport;

public class mobil_Login extends ActionSupport{

	private String drivernums;
	public String getDrivernums() {
		return drivernums;
	}


	public void setDrivernums(String drivernums) {
		this.drivernums = drivernums;
	}


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}


	private String pass;
	public void Login()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{ "applicationContext.xml"});
		DriversDaoImp dmp=(DriversDaoImp)context.getBean("DriversDaoImp");
		HttpServletResponse response = ServletActionContext.getResponse();
		if(dmp.confirm(drivernums, pass))
		{
			netTools.json(response, "{\"statue\":\"true\"}", "utf-8");
			System.out.println("移动用户登录成功");
		}else
		{
			netTools.json(response, "{\"statue\":\"false\"}", "utf-8");
			System.out.println(getDrivernums()+":"+getPass()+"移动用户登录失败");
		}
		System.out.println(getDrivernums()+":"+getPass());
		
	}
	
	
	
	
}
