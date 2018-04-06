package com.baoliang.FileAction;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.baoliang.Model.ManagerDaoImp;
import com.baoliang.Model.bossDaoImp;
import com.opensymphony.xwork2.ActionSupport;

public class uploadinfo extends ActionSupport {

	 public File[] getUpload() {
		return upload;
	}

	public void setUpload(File[] upload) {
		this.upload = upload;
	}

	public String[] getUploadContentType() {
		return uploadContentType;
	}

	public void setUploadContentType(String[] uploadContentType) {
		this.uploadContentType = uploadContentType;
	}

	public String[] getUploadFileName() {
		return uploadFileName;
	}

	public void setUploadFileName(String[] uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	public void setSavePath(String savePath) {
		this.savePath = savePath;
	}

	// 封装上传文件属性
    private File[] upload;

    // 封装上传文件的类型
    private String[] uploadContentType;

    // 封装上传文件名称
    private String[] uploadFileName;

    // 封装文件上传的路径
    private String savePath;

    private int flag=1;
    public String execute() throws Exception {
    	try {
        byte[] buffer = new byte[1024];
        System.out.println(upload);
        
        
        HttpServletRequest request = ServletActionContext.getRequest(); 
		HttpSession session = request.getSession(); 
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{ "applicationContext.xml"});
		bossDaoImp bo= (bossDaoImp) context.getBean("bossDaoImp");
        for (int i = 0; i < upload.length; i++) {
        	
        	
        	
        	//
        	
			
            FileInputStream fis = new FileInputStream(getUpload()[i]);
            
            String directory="/userpic";
            String target=ServletActionContext.getServletContext().getRealPath(directory);
            String xiangdui="userpic\\"+picname( this.getUploadFileName()[i]);
            String finalpath=target + "\\"+picname( this.getUploadFileName()[i]);
            FileOutputStream fos = new FileOutputStream(finalpath);
            int length = fis.read(buffer);
            
           
            while (length > 0) {
            	
                fos.write(buffer, 0, length);
                length = fis.read(buffer);
            }
            if(i==0)
        	{
        		bo.updateUserPic(xiangdui, 0, session.getAttribute("username").toString());
        		
        	}else
        	{
        		
        		bo.updateUserPic(xiangdui, 1, session.getAttribute("username").toString());
        	}
            fos.flush();
            fos.close();
            fis.close();
        }
    	}catch(Exception e)
    	{
    		System.out.println("上传文件失败++++++++++++++");
    		System.out.println(e);
    		e.printStackTrace();
    		System.out.println("++++++++++++++++++++++++");
    		flag=0;
    		return ERROR;
    		
    	}
    	ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{ "applicationContext.xml"});
    	bossDaoImp user=(bossDaoImp) context.getBean("bossDaoImp");
    	HttpServletRequest request = ServletActionContext.getRequest(); 
		HttpSession session = request.getSession();
    	user.updateUserStatue("3",session.getAttribute("username").toString());
        return SUCCESS;
    }

    public String picname(String picn)
    {
    	String[] temp=picn.split("\\.");
    	String str="";
		Calendar now = Calendar.getInstance(); 
		str+=now.get(Calendar.YEAR);
		str+=now.get(Calendar.MONTH);
		str+=now.get(Calendar.DAY_OF_MONTH);
		str+=now.get(Calendar.HOUR_OF_DAY);
		str+=now.get(Calendar.MINUTE);
		str+=now.getTimeInMillis();
		str+=".";
		str+=temp[1];
		return str;
    	
    }
      public String getSavePath() {
         return ServletActionContext.getServletContext().getRealPath(savePath);
       }

 
	
}
