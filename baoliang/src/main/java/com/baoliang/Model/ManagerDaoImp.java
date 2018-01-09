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

	 

	public void save(Manager mg) {
		
		
	}

	public void update(Manager mg) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Manager mg) {
		// TODO Auto-generated method stub
		
	}

	public Manager findByphone(String phone) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Manager> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean confirm(String phone, String pass) {
		
		boolean flag=true;
		System.out.println("++++++++++++++++++++++++++++"+getJdbcTemplate());
		flag=this.getJdbcTemplate().query("select name from Manager where phone=? and pass = ?", new Object[] {phone,pass},new ResultSetExtractor() {

			public Object extractData(ResultSet rs) throws SQLException, DataAccessException {
				System.out.println("++++++++++++++++++++=======================");
				try {
					
					rs.last();
					int count=rs.getRow();
					if(count==0)
					{
						System.out.println("个数为+++++++++++++）+）+）+++"+count);
						return false;
					}
					return true;
				}catch(NullPointerException e) {
					System.out.println("这是空的=======================");
					return false;
					
				}
			}
		
		
		});
		return flag;
	}
	  
	  
}
