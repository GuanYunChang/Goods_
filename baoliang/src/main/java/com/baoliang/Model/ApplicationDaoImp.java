/**
 *This is baoliang project
 *@author:baoliang
 **/
package com.baoliang.Model;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class ApplicationDaoImp implements ApplicationDao{

	private SessionFactory sessionFactory=GetSessionFactory.sessionFactory;
	
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	 public Session getCurrentSession(){
	        return this.sessionFactory.getCurrentSession();
	    }
	public void save(Application application) {
		Transaction tx=this.getCurrentSession().beginTransaction();
        try{
            this.getCurrentSession().save(application);
            tx.commit();
        }catch(Exception e){
            if(null!=tx){tx.rollback();}
            e.printStackTrace();
        }  
		
	}
	public void update(Application application) {
		 Transaction tx=this.getCurrentSession().beginTransaction();
         try{
             this.getCurrentSession().update(application);
             tx.commit();
         }catch(Exception e){
             if(null!=tx){tx.rollback();}
             e.printStackTrace();
         }  
		
	}
	public void delete(Application application) {
		 Transaction tx=this.getCurrentSession().beginTransaction();
         try{
             this.getCurrentSession().delete(application);
             tx.commit();
         }catch(Exception e){
             if(null!=tx){tx.rollback();}
             e.printStackTrace();
         }  
		
	}
	public Application findByacm(String acmcode) {
		 Transaction tx=this.getCurrentSession().beginTransaction();
		 Application ap=(Application)this.getCurrentSession().createQuery("from Manager a where a.acnum='"+acmcode+"'").uniqueResult();
         return ap;
	}
	public List<Application> findAll() {
		 Transaction tx=this.getCurrentSession().beginTransaction();
		 Query query= this.getCurrentSession().createQuery("from application");
         return query.list();
	}
	
	

}
