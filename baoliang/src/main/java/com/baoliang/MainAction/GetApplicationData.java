/**
 *This is baoliang project
 *@author:baoliang
 **/
package com.baoliang.MainAction;

import java.util.List;

import com.baoliang.Model.Application;
import com.baoliang.Model.ApplicationDaoImp;
import com.opensymphony.xwork2.ActionSupport;

public class GetApplicationData extends ActionSupport {

	private ApplicationDaoImp apdao=new ApplicationDaoImp();
	
	public ApplicationDaoImp getApdao() {
		return apdao;
	}

	public void setApdao(ApplicationDaoImp apdao) {
		this.apdao = apdao;
	}

	public List<Application> getAllData()
	{
		return apdao.findAll();
	}
	
	public Application getApplicationByacm(String acmcode)
	{
		return apdao.findByacm(acmcode);
		
	}
	
	public void saveApplication(Application ap) {
		
		apdao.save(ap);
	}
	
	public void updateApplication(Application ap)
	{
		apdao.update(ap);
		
	}
	
	public void deletedApplication(Application ap)
	{
		apdao.delete(ap);
	}
	
	
	
}
