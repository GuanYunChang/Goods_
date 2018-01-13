/**
 *This is baoliang project
 *@author:baoliang
 **/
package baoliang;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONException;

import com.baoliang.Model.Application;

public class test {

	public static void main(String[] args) throws JSONException, IllegalArgumentException, IllegalAccessException {
//		user us1= new user();
//		us1.setUsername("zhubaoliang");
//		us1.setPass("123");
//		us1.setInfo("NO1");
//		user us2= new user();
//		us2.setUsername("zhubaoliang");
//		us2.setPass("123");
//		us2.setInfo("NO2");
//		ArrayList li= new ArrayList();
//		li.add(us2);
//		li.add(us1);
		//System.out.println(com.baoliang.Tools.jsontools.tojsonForNoArray(li, user.class));
		ArrayList li= new ArrayList();
		Application apl= new Application();
		apl.setAcnum("a1");
		apl.setBoss("12");
		apl.setDestination("usa");
		apl.setGoods("huanjin");
		apl.setPhone("phone");
		apl.setStart("china");
		li.add(apl);
		apl= new Application();
		apl.setAcnum("a12");
		apl.setBoss("12");
		apl.setDestination("usa");
		apl.setGoods("huanjin");
		apl.setPhone("phone");
		apl.setStart("china");
		li.add(apl);
		System.out.println(com.baoliang.Tools.jsontools.tojsonForNoArray(li, Application.class));
	
	}

}
