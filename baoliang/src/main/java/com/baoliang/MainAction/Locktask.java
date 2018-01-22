/**
 *This is baoliang project
 *@author:baoliang
 **/
package com.baoliang.MainAction;

import java.util.Timer;
import java.util.TimerTask;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.baoliang.Model.ApplicationDaoImp;

public class Locktask extends TimerTask {

	
	
	
	
	private Timer tasktimer;
	public Timer getTasktimer() {
		return tasktimer;
	}
	public void setTasktimer(Timer tasktimer) {
		this.tasktimer = tasktimer;
	}
	private String acnum;
	public String getAcnum() {
		return acnum;
	}
	public void setAcnum(String acnum) {
		this.acnum = acnum;
	}
	@Override
	public void run() {
	
		getTasktimer().cancel();
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{ "applicationContext.xml"});
		ApplicationDaoImp apc= (ApplicationDaoImp) context.getBean("ApplicationDaoImp");
		apc.unlockapplication(acnum);
		System.out.println("解锁");
		}

	}


