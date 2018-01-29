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
	public void lockapplication(String acnum)
	{
		this.getJdbcTemplate().update("update application set lockversion=2 where acnum=?",new String[] {acnum});
		
	}
	public void setdriverforapplication(String carnum,String drivernum,String acnum)
	{
		
		System.out.println("绑定"+carnum+","+drivernum+","+acnum);
		this.getJdbcTemplate().update("update application set statue=?,car=?,drivernum=? where acnum=?",new Object[] {"3",carnum,drivernum,acnum});
		
	}
	public void unlockapplication(String acnum) {
		
		this.getJdbcTemplate().update("update application set lockversion=1 where acnum=?",new String[] {acnum});
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
		System.out.println(car);
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
	/**
	 * 手机端获取司机正在做的任务
	 * @param drivernum
	 * @return
	 */
	public List<Application> Mobile_findUserDoing(String drivernum)
	{
		return this.getJdbcTemplate().query("select * from application where statue='3' and drivernum=?", new Object[]{drivernum},new BeanPropertyRowMapper(Application.class));
	}
	/**
	 * 设置用户正在完成的状态
	 * @param acnum
	 * @return
	 */
	public boolean Mobile_setStatue(String acnum)
	{
		try {
			this.getJdbcTemplate().update("update application set statue =? where acnum=?",new String[] {"2",acnum});
		}catch(Exception e)
		{
			return false;
		}
		return true;
	}
	/**
	 * 手机端用户获取自己的已经完成订单
	 * @return
	 */
	public List<Application> FindFinishedApBydrivernum(String drivernum)
	{
		return this.getJdbcTemplate().query("select * from application where statue=? and drivernum=?", new Object[]{"2",drivernum},new BeanPropertyRowMapper(Application.class));
		
	}
public List<Application> findAllunlock(String statue) {
		
		return this.getJdbcTemplate().query("select * from application where statue=? and lockversion=1", new Object[]{statue},new BeanPropertyRowMapper(Application.class));
		
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
	
	
	//以下用于用户获取数据信息
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<Application> FindApplicationByUserPhoneForFinishedApplication(String phone) {
		
		String str= "select * from application where statue='2' and phone='"+phone+"'";
		System.out.println(str);
		return this.getJdbcTemplate().query(str,new BeanPropertyRowMapper(Application.class));
		
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<Application> FindApplicationByUserPhoneForNotFinishedApplication(String phone) {
		String str= "select * from application where statue='1' and phone='"+phone+"'";
		System.out.println(str);
		return this.getJdbcTemplate().query(str,new BeanPropertyRowMapper(Application.class));
		
		
		
		
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<Application> FindApplicationByUserPhoneForFinishedDistributionApplication(String phone) {
		
		String str= "select * from application where statue='3' and phone='"+phone+"'";
		System.out.println(str);
		return this.getJdbcTemplate().query(str,new BeanPropertyRowMapper(Application.class));
		
	}

}
