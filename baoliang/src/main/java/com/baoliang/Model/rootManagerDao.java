/**
 *This is baoliang project
 *@author:baoliang
 **/
package com.baoliang.Model;

public interface rootManagerDao {

		public void save(String name,String pass);
		public void update(String name,String pass);
		public void delete(String name,String pass);
		public rootManager query(String name,String pass);
}
