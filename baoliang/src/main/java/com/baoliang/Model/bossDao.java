/**
 *This is baoliang project
 *@author:baoliang
 **/
package com.baoliang.Model;

import java.util.List;

public interface bossDao {

	public void save(String phone,String pass,String name);
	public void update(String passold ,String phone,String pass,String name);
	public void delete(String phone);
	boss findByphoneandpass(String phone);
	List<boss> findAll();
	boolean confirm(String phone,String pass);
}
