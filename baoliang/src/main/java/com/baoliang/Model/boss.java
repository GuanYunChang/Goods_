/**
 *This is baoliang project
 *@author:baoliang
 **/
package com.baoliang.Model;

public class boss implements java.io.Serializable{

	private String bossphone;
	public String getBossphone() {
		return bossphone;
	}
	public void setBossphone(String bossphone) {
		this.bossphone = bossphone;
	}
	public String getBosspass() {
		return bosspass;
	}
	public void setBosspass(String bosspass) {
		this.bosspass = bosspass;
	}
	public String getBossname() {
		return bossname;
	}
	public void setBossname(String bossname) {
		this.bossname = bossname;
	}
	private String bosspass;
	private String bossname;
	
}
