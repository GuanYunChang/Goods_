/**
 *This is baoliang project
 *@author:baoliang
 **/
package com.baoliang.Model;

import java.util.List;

public interface ApplicationDao {

	public void save(Application application);
	public void update(Application application);
	public void delete(Application application);
	public Application findByacm(String acmcode);
	public List<Application> findAll();
	
}
