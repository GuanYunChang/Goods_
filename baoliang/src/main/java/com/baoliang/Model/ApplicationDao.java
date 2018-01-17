/**
 *This is baoliang project
 *@author:baoliang
 **/
package com.baoliang.Model;

import java.util.List;

public interface ApplicationDao {

	public void save( String boss, String phone, String goods, String start, String destination,String statue,String weight);
	public void update(String acnum,String boss,String phone,String goods,String start,String destination,String weight);
	public void delete(String acnum);
	public void modifyfortrans(String drivernum,String car,double weight,String statue,String acnum);
	Application findByAcnum(String acnum);
	List<Application> findAll(String statue);
	
}
