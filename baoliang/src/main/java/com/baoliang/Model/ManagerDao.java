/**
 *This is baoliang project
 *@author:baoliang
 **/
package com.baoliang.Model;

import java.util.List;

public interface ManagerDao {
	
	public void save(Manager mg);
	public void update(Manager mg);
	public void delete(Manager mg);
	Manager findByphone(String phone);
	List<Manager>findAll();
	boolean confirm(String phone,String pass);

}
