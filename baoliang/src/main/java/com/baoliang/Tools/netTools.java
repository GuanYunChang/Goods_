package com.baoliang.Tools;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

public class netTools {

	
	public static void json(HttpServletResponse response, String data, String encoding){
		//设置编码格式
		response.setContentType("text/plain;charset=" + encoding);
		response.setCharacterEncoding(encoding);
		
		PrintWriter out = null;
		try{
			out = response.getWriter();
			out.print(data);
			out.flush();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
