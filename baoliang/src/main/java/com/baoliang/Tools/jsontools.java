/**
 *This is baoliang project
 *@author:baoliang
 **/
package com.baoliang.Tools;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class jsontools {

	/**
	 * 用于不是json数组的转化，如果遇到对象可以跳过不用管
	 * @param <T>
	 * @return
	 * @throws IllegalAccessException 
	 * @throws IllegalArgumentException 
	 * @throws JSONException 
	 */
	public static <T> String tojsonForNoArray(Object idata,java.lang.Class<T> type) throws JSONException, IllegalArgumentException, IllegalAccessException
	{
		List data= (List) idata;
		JSONArray json= new JSONArray();
		T trueobj;
		Field[] field= type.getDeclaredFields();
		int i;
		for (Object obj : data) {
			trueobj= (T) obj;
			JSONObject jsonobj= new JSONObject();
			for(i=0;i<field.length;i++)
			{
				field[i].setAccessible(true);
				
				jsonobj.put(field[i].getName().toString(), field[i].get(trueobj).toString());
			}
			json.put(jsonobj);
		}
		//String jsonString = json.toString().substring(1,json.toString().length()-1);
		//return jsonString;
		System.out.println(json.toString());
		return json.toString();
	}
}
