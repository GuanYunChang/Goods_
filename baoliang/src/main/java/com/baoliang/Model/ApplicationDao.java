/**
 *This is baoliang project
 *@author:baoliang
 **/
package com.baoliang.Model;

import java.util.List;

public interface ApplicationDao {

	public void save(String boss,String phone,String goods,String start,String destination);
	public void update(String acnum,String boss,String phone,String goods,String start,String destination);
	public void delete(String acnum);
	Application findByAcnum(String acnum);
	List<Application> findAll();
	
}
