package com.baoliang.FileAction;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class uploadcard extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//判断用户的请求内容是不是multipart/form-data
		request.setCharacterEncoding("UTF-8");
        boolean isMultipart=ServletFileUpload.isMultipartContent(request);
        if(!isMultipart){
            System.out.println("上传文件类型不是mutipart类型,程序终止");
        	return;
        }
        
        
        
        //创建磁盘文件工厂
        DiskFileItemFactory fileItemFactory =  new DiskFileItemFactory();
      //创建磁盘文件项
        ServletFileUpload fileUpload = new ServletFileUpload(fileItemFactory);
      fileUpload.setHeaderEncoding("UTF-8");// 解决中文文件名上传乱码.
      
      try {
      List<FileItem> list = fileUpload.parseRequest(request);
      Map<String,String> map = new HashMap<String,String>();
      String fileName = null;
      for (FileItem fileItem : list) {
          if(fileItem.isFormField()){
              //如果是表单项
              String name = fileItem.getFieldName();
              String string = fileItem.getString("utf-8");
              //表单项的集合
              map.put(name, string);
          }else{
              //上传项
              fileName = fileItem.getName();
              InputStream is = fileItem.getInputStream();
              // 获得文件要上传的路径（后面的路径可以自定义）:
              String path = this.getServletContext().getRealPath("/back/imgs");
              OutputStream os = new FileOutputStream(path+"/"+fileName);//cs.jpg
              byte[] byts = new byte[1024];
              int len = 0;
              while ( (len = is.read(byts)) != -1 ) {
                  os.write(byts, 0, len);
                  os.flush();
              }
//            IOUtils.copy(is, os);
              is.close();
              os.close();
          }
      
      }
      
//    BeanUtils.populate();   //将实体对应的属性赋给实体（收集数据）
      if (!fileName.equals(null)&&!fileName.equals("")) {
          //将图片路径赋给实体的某个属性                    
      }
  //将实体的数据写入到数据库
      }catch(Exception e)
      {
    	  
    	  System.out.println("上传文件失败");
      }
}
/**
* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
*/
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
		{
		doGet(request, response);
		}

	
}
