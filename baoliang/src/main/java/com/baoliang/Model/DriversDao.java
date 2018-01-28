/**
 *This is baoliang project
 *@author:baoliang
 **/
package com.baoliang.Model;

import java.util.List;

public interface DriversDao {

	public void save(String drivernums,String name,String phone,String pass,String carnum,double cargo,String statue, String sumlength);
	public void update(String drivernums,String name,String phone,String pass,String carnum,double cargo,String statue, String sumlength);
	public void delete(String drivernums);
	List<Drivers> findByphone(String drivernums);
	List<Drivers>findAll(String statue);
	boolean confirm(String drivernums,String pass);
}
