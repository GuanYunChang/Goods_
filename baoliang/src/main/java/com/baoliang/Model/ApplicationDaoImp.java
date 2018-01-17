/**
 *This is baoliang project
 *@author:baoliang
 **/
package com.baoliang.Model;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.baoliang.Tools.produceacnum;

public class ApplicationDaoImp extends JdbcDaoSupport implements ApplicationDao {

	public void save( String boss, String phone, String goods, String start, String destination,String statue,String weight) {
		
		this.getJdbcTemplate().update("insert into  application(acnum,boss,phone,goods,start,destination,statue,weight,car,drivernum) values(?,?,?,?,?,?,?,?,' ',' ')",new Object[]{produceacnum.getacnum(),boss,phone,goods,start,destination,statue,Double.parseDouble(weight)});
		
	}
	public void modifyfortrans(String drivernum,String car,double weight,String statue,String acnum)
	{
		
		this.getJdbcTemplate().update("update application set drivernum= ?,car=?,weight=?,statue=? where acnum=?",new Object[]{drivernum,car,weight,statue,acnum});
	}
	//此方法取消更改订单只能通过取消后重新添加
	public void update(String acnum, String boss, String phone, String goods, String start, String destination,String weight) {
		
		this.getJdbcTemplate().update("update application set boss=?,phone=?,goods=?,start=?,destination=?,weight=? where acnum=?",new Object[]{boss,phone,goods,start,destination,weight,acnum});
	}

	public void updatetableyes(String acnum, String boss, String phone, String goods, String start, String destination,String weight,String car,String drivernum) {
		this.getJdbcTemplate().update("update application set boss=?,phone=?,goods=?,start=?,destination=?,weight=?,car=?,drivernum=? where acnum=?",new Object[]{boss,phone,goods,start,destination,weight,car,drivernum,acnum});
	}
	public void delete(String acnum) {
		this.getJdbcTemplate().update("delete from application where acnum =?",new Object[] {acnum});
		
	}

	public Application findByAcnum(String acnum) {
		
		return this.getJdbcTemplate().queryForObject("select * from application where acnum=?", new Object[] {acnum},Application.class);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<Application> findAll(String statue) {
		
		return this.getJdbcTemplate().query("select * from application where statue=?", new Object[]{statue},new BeanPropertyRowMapper(Application.class));
		
	}
	
	public Integer[] getcountofmaintable()
	{
		Integer[] counts = {this.getJdbcTemplate().queryForObject("select count(*) from application where statue='1'", Integer.class),this.getJdbcTemplate().queryForObject("select count(*) from drivers where statue='2'",Integer.class), this.getJdbcTemplate().queryForObject("select count(*) from application where statue='3'", Integer.class)};
		
		return counts;
	}
	
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<Application> findAllbyacmnum(String acnum) {
		
		String str= "select * from application where acnum like'%"+acnum+"%'";
		return this.getJdbcTemplate().query(str,new BeanPropertyRowMapper(Application.class));
		
	}
	

}
