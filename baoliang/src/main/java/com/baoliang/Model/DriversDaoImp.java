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

	public boolean setpass(String pass,String drivernums)
	{
		try {
		this.getJdbcTemplate().update("update drivers set pass=? where drivernums=?",new String[] {pass,drivernums});
		}catch(Exception e) {
			return false;
			
		}
		return true;
	}
	
	
	public void save(String drivernums, String name, String phone, String pass, String carnum, double cargo,
			String statue, String sumlength) {
		this.getJdbcTemplate().update("insert into drivers(drivernums,name,phone,pass,carnum,cargo,statue,sumlength) values(?,?,?,?,?,?,?,?)",new Object[]{drivernums,name,phone,pass,carnum,cargo,statue,sumlength});
		
		
	}

	public void setStatue(String driversnums)
	{
		this.getJdbcTemplate().update("update drivers set statue='3' where drivernums='"+driversnums+"'");
		
	}
	public void update(String drivernums, String name, String phone, String pass, String carnum, double cargo,
			String statue, String sumlength) {
		this.getJdbcTemplate().update("update drivers set pass=? where drivernums=?",new Object[] {pass,drivernums});
		
	}
	
	public void updateuserinfoForManager(String drivernums, String name, String phone,  String carnum, double cargo)
	{
		this.getJdbcTemplate().update("update drivers set name=?,phone=?,carnum=?,cargo=? where drivernums=?",new Object[] {name,phone,carnum,cargo,drivernums});
		
	}

	public void delete(String drivernums) {
		this.getJdbcTemplate().update("delete from drivers where drivernums =?",new Object[] {drivernums});
		
	}

	public List<Drivers> findByphone(String drivernums) {
		// TODO Auto-generated method stub
		//String sql = "select * from drivers where drivernums='"+drivernums+"'";
		
		return this.getJdbcTemplate().query("select * from drivers where drivernums=?",new Object[] {drivernums},new BeanPropertyRowMapper(Drivers.class));
	}
/**
 * 查询所有的司机
 * @return
 */
	public List<Drivers>finallDriver(){
		
		return this.getJdbcTemplate().query("select * from drivers",new BeanPropertyRowMapper(Drivers.class));
	}
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<Drivers> findAll(String statue) {
		
		return this.getJdbcTemplate().query("select * from drivers where statue=?", new Object[]{statue},new BeanPropertyRowMapper(Drivers.class));
	}
	
	
	

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public boolean confirm(String drivernums, String pass) {
		return this.getJdbcTemplate().query("select name from drivers where drivernums=? and pass = ?  ", new Object[] {drivernums,pass},new ResultSetExtractor() {

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
