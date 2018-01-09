/**
 *This is baoliang project
 *@author:baoliang
 **/
package com.baoliang.Login;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.baoliang.Model.Manager;
import com.baoliang.Model.ManagerDaoImp;
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
		
		@Override
		  public String execute() throws Exception{
			
			ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{ "applicationContext.xml"});
			System.out.println(getCharacter());
			switch(Integer.parseInt(getCharacter()))
			{
			case 1: 
				ManagerDaoImp mg= (ManagerDaoImp) context.getBean("ManagerDaoImp");
				System.out.println("========"+getName()+"========="+getPassword());
				if(mg.confirm(getName(), getPassword())==false)
				{
					System.out.println("======================bad");
					return ERROR;
				}
				break;
			case 2: break;
			case 3: break;
			
			}
			System.out.println("============================成功");
			return SUCCESS;
			
			
		}
		
		
		
}
