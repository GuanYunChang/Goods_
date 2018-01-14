/**
 *This is baoliang project
 *@author:baoliang
 **/
package com.baoliang.Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class DriversDaoImp extends JdbcDaoSupport implements DriversDao{

	public void save(String drivernums, String name, String phone, String pass, String carnum, double cargo,
			String statue, String sumlength) {
		this.getJdbcTemplate().update("insert into drivers(drivernums,name,phone,pass,carnum,cargo,statue,sumlength) values(?,?,?,?,?,?,?,?)",new Object[]{drivernums,name,phone,pass,carnum,cargo,statue,sumlength});
		
		
	}

	public void update(String drivernums, String name, String phone, String pass, String carnum, double cargo,
			String statue, String sumlength) {
		this.getJdbcTemplate().update("update drivers set pass=? where drivernums=?",new Object[] {pass,drivernums});
		
	}

	public void delete(String drivernums) {
		this.getJdbcTemplate().update("delete from dirvers where drivernums =?",new Object[] {drivernums});
		
	}

	public Drivers findByphone(String drivernums) {
		// TODO Auto-generated method stub
		return this.getJdbcTemplate().queryForObject("select * from drivers where drivernums=?",new Object[] {drivernums}, Drivers.class);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<Drivers> findAll(String statue) {
		
		return this.getJdbcTemplate().query("select * from drivers where statue=?", new Object[]{statue},new BeanPropertyRowMapper(Drivers.class));
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public boolean confirm(String drivernums, String pass) {
		return this.getJdbcTemplate().query("select name from Manager where drivernums=? and pass = ?  ", new Object[] {drivernums,pass},new ResultSetExtractor() {

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
		
	}

	
}
