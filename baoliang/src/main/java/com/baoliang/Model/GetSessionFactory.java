/**
 *This is baoliang project
 *@author:baoliang
 **/
package com.baoliang.Model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.opensymphony.xwork2.ActionSupport;

public class GetSessionFactory extends ActionSupport{

	
	public static SessionFactory sessionFactory; 
	public static void getSessionFactory()
	{
		
		Configuration configuration = new Configuration();// 默认使用src文件夹下的hibernate.cfg.xml进行配置，若更改了路径，要附加上包路径如："/com/example/hibernate.cfg.xml" 
		sessionFactory = configuration.configure().buildSessionFactory();
        //Session session = sessionFactory.openSession();
	   System.out.println("=============================success");
	   System.out.println(GetSessionFactory.sessionFactory);
	    
	}
	
	@Override
	public String execute() throws Exception {
		GetSessionFactory.getSessionFactory();
        return SUCCESS;
    }
	
}
