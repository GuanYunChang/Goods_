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

	public void save( String boss, String phone, String goods, String start, String destination) {
		
		this.getJdbcTemplate().update("insert into application application(acnum,boss,phone,goods,start,destination) values(?,?,?,?,?,?)",new Object[]{produceacnum.getacnum(),boss,phone,goods,start,destination});
		
	}

	//此方法取消更改订单只能通过取消后重新添加
	public void update(String acnum, String boss, String phone, String goods, String start, String destination) {
		
		
	}

	public void delete(String acnum) {
		this.getJdbcTemplate().update("delete from application where acnum =?",new Object[] {acnum});
		
	}

	public Application findByAcnum(String acnum) {
		
		return this.getJdbcTemplate().queryForObject("select * from application where acnum=?", new Object[] {acnum},Application.class);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<Application> findAll() {
		return this.getJdbcTemplate().query("select * from application", new BeanPropertyRowMapper(Application.class));
		
	}

}
