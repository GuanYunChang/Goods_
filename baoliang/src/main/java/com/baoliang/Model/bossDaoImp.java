/**
 *This is baoliang project
 *@author:baoliang
 **/
package com.baoliang.Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class bossDaoImp extends JdbcDaoSupport implements bossDao{

	public void save(String phone, String pass, String name) {
		this.getJdbcTemplate().update("insert into boss(bossphone,bosspass,bossname) values(?,?,?);", new Object[] {phone,pass,name});
		
	}

	public void update(String passold, String phone, String pass, String name) {
		this.getJdbcTemplate().update("update boss set bosspass= ? where bossphone = ? and bossname= ?",new Object[] {pass,phone,passold});
		
	}

	public void delete(String phone) {
		this.getJdbcTemplate().update("delete from boss where bossphone =?",new Object[] {phone});
		
	}

	public boss findByphoneandpass(String phone) {
		return this.getJdbcTemplate().queryForObject("select * from boss where bossphone= ?",new Object[] {phone}, boss.class);
		
	}

	public List<boss> findAll() {
		return this.getJdbcTemplate().queryForList("select * from boss",boss.class);
	}
	@SuppressWarnings(value = { "unchecked" })
	public boolean confirm(String phone, String pass) {
		boolean flag=true;

		flag=this.getJdbcTemplate().query("select bossname from boss where bossphone=? and bosspass = ?  ", new Object[] {phone,pass},new ResultSetExtractor() {

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
