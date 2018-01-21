/**
 *This is baoliang project
 *@author:baoliang
 **/
package baoliang;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import org.json.JSONException;

import com.baoliang.Model.Application;

public class test {

	public static void main(String[] args)  {
		
		test.test1();
	}
	
	 public static void test1() {  
	        new Timer().schedule(new TimerTask() {  
	            @Override  
	            public void run() {  
	                // TODO Auto-generated method stub  
	                System.out.println("bombing!");  
	            }  
	        }, 500000000);  
	    }  

}
