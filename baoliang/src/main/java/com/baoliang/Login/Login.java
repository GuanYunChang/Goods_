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
			System.out.println("将要登录的角色为"+getCharacter());
			switch(Integer.parseInt(getCharacter()))
			{
			case 1: 
				ManagerDaoImp mg= (ManagerDaoImp) context.getBean("ManagerDaoImp");
				
				if(mg.confirm(getName(), getPassword())==false)
				{
					
					flag=0;
					System.out.println("登录========"+getName()+"========="+getPassword());
					return ERROR;
				}
				flag=1;
				break;
			case 2:
				bossDaoImp bo= (bossDaoImp) context.getBean("bossDaoImp");
				
				
				if(bo.confirm(getName(), getPassword())==false)
				{
					
					flag=0;
					System.out.println("鐧诲綍澶辫触========"+getName()+"========="+getPassword());
					return ERROR;
				} else
				{
					flag=bo.getVerifyOrNO(getName());//flag=2：用户仅注册并没有提交申请验证，
					
					//flag=3:用户提交了申请验证正在等待申请结果，flag=1:表示已经是通过验证的合法用户
					System.out.println("当前用户的状态为"+flag);
				}
				break;
			case 3:
				rootManagerDaoImp rm= (rootManagerDaoImp) context.getBean("rootManagerDaoImp");
				if(rm.confirm(getName(), getPassword())==false)
				{
					
					flag=0;
					System.out.println("root鐢ㄦ埛鐧诲綍澶辫触");
					return ERROR;
				}
				flag=1;
			
			}
			
			System.out.println("用户名字"+getName()+","+getPassword()+","+getCharacter());
			
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
	 * 閫�鍑虹櫥褰�
	 * @return
	 */
	public String Logout()
	{
		HttpServletRequest request = ServletActionContext.getRequest(); 
		HttpSession session = request.getSession();
		try {
			
			session.removeAttribute("username");
			session.removeAttribute("character");
			System.out.println("閫�鍑烘垚鍔�");
			
		}catch(Exception e) {
			
			System.out.println("閫�鍑哄け璐�");
			return ERROR;
		}
		return SUCCESS;
	}
		
}
