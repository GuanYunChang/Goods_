package com.baoliang.FileAction;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
        for (int i = 0; i < upload.length; i++) {
        	
        	
        	
        	//
        	
        	
            FileInputStream fis = new FileInputStream(getUpload()[i]);
            
            String directory="/userpic";
            String target=ServletActionContext.getServletContext().getRealPath(directory);
            
            
            FileOutputStream fos = new FileOutputStream(target + "\\"
                    + this.getUploadFileName()[i]);
            int length = fis.read(buffer);
            while (length > 0) {
                fos.write(buffer, 0, length);
                length = fis.read(buffer);
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

      public String getSavePath() {
         return ServletActionContext.getServletContext().getRealPath(savePath);
       }

 
	
}
