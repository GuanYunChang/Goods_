/**
 *This is baoliang project
 *@author:baoliang
 **/
package com.baoliang.Model;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class ManagerDaoImp extends JdbcDaoSupport implements ManagerDao{

	 

	public void save(String phone,String pass,String name) {
		
		this.getJdbcTemplate().update("insert into Manager(phone,pass,name) values(?,?,?);", new Object[] {phone,pass,name});
		
	}

	public void update(String passold ,String phone,String pass,String name) {
		this.getJdbcTemplate().update("update Manager set pass= ? where phone = ? and pass= ?",new Object[] {pass,phone,passold});
		
	}

	public void delete(String phone) {
		
		this.getJdbcTemplate().update("delete from Manager where phone =?",new Object[] {phone});
		
	}

	public Manager findByphone(String phone) {
		
		return this.getJdbcTemplate().queryForObject("select * from Manager where phone= ?",new Object[] {phone}, Manager.class);
	}

	public List<Manager> findAll() {
		
		return this.getJdbcTemplate().queryForList("select * from Manager",Manager.class);
	}
@SuppressWarnings(value = { "unchecked" })
	public boolean confirm(String phone, String pass) {
		
		boolean flag=true;

		flag=this.getJdbcTemplate().query("select name from Manager where phone=? and pass = ?  ", new Object[] {phone,pass},new ResultSetExtractor() {

			public Object extractData(ResultSet rs) throws SQLException, DataAccessException {
				
				try {
					
					rs.last();
					int count=rs.getRow();
					if(count==0)
					{
						
						return false;
					}
					return true;
				}catch(NullPointerException e) {
					
					return false;
					
				}
			}
		
		
		});
		return flag;
	}
	  
	  
}
