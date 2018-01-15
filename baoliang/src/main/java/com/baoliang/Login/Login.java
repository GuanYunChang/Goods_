/**
 *This is baoliang project
 *@author:baoliang
 **/
package com.baoliang.Login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.baoliang.Model.Manager;
import com.baoliang.Model.ManagerDaoImp;
import com.baoliang.Model.bossDaoImp;
import com.baoliang.Model.rootManagerDaoImp;
import com.opensymphony.xwork2.ActionSupport;

public class Login extends ActionSupport {

		private String name;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		private String password;
		private String character;
		public String getCharacter() {
			return character;
		}
		public void setCharacter(String character) {
			this.character = character;
		}
		int flag=0;
		public int getFlag() {
			return flag;
		}
		public void setFlag(int flag) {
			this.flag = flag;
		}
		private String vcode;
		public String getVcode() {
			return vcode;
		}
		public void setVcode(String vcode) {
			this.vcode = vcode;
		}
		private String phone;
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		@Override
		  public String execute() throws Exception{
			HttpServletRequest request = ServletActionContext.getRequest(); 
			HttpSession session = request.getSession(); 
			ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{ "applicationContext.xml"});
			System.out.println(getCharacter());
			switch(Integer.parseInt(getCharacter()))
			{
			case 1: 
				ManagerDaoImp mg= (ManagerDaoImp) context.getBean("ManagerDaoImp");
				
				if(mg.confirm(getName(), getPassword())==false)
				{
					
					flag=0;
					System.out.println("登录失败========"+getName()+"========="+getPassword());
					return ERROR;
				}
				
				break;
			case 2:
				bossDaoImp bo= (bossDaoImp) context.getBean("bossDaoImp");
				
				if(bo.confirm(getName(), getPassword())==false)
				{
					
					flag=0;
					System.out.println("登录失败========"+getName()+"========="+getPassword());
					return ERROR;
				}
				
			case 3:
				rootManagerDaoImp rm= (rootManagerDaoImp) context.getBean("rootManagerDaoImp");
				if(rm.confirm(getName(), getPassword())==false)
				{
					
					flag=0;
					System.out.println("root用户登录失败");
					return ERROR;
				}
			
			}
			
			System.out.println("登录成功"+getName()+","+getPassword()+","+getCharacter());
			flag=1;
			session.setAttribute("username", getName());
			session.setAttribute("character", getCharacter());
			return SUCCESS;
			
			
		}
		
	
		
	public String sendmessage()
	{
		System.out.println(getPhone()+","+getVcode());
		//SendMessage.SetTaoBao(getPhone(),getVcode());
		return SUCCESS;
	}
	
	/**
	 * 退出登录
	 * @return
	 */
	public String Logout()
	{
		HttpServletRequest request = ServletActionContext.getRequest(); 
		HttpSession session = request.getSession();
		try {
			
			session.removeAttribute("username");
			session.removeAttribute("character");
			System.out.println("退出成功");
			
		}catch(Exception e) {
			
			System.out.println("退出失败");
			return ERROR;
		}
		return SUCCESS;
	}
		
}
