/**
 *This is baoliang project
 *@author:baoliang
 **/
package com.baoliang.Login;

import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.AlibabaAliqinFcSmsNumSendRequest;
import com.taobao.api.response.AlibabaAliqinFcSmsNumSendResponse;

public class SendMessage {

	public static void SetTaoBao(String num,String code)
	{
		TaobaoClient client = new DefaultTaobaoClient("http://gw.api.taobao.com/router/rest", "24760497","5e060781d063bc78a7d0744b741d058d");
		AlibabaAliqinFcSmsNumSendRequest req = new AlibabaAliqinFcSmsNumSendRequest();
		req.setSmsType("normal");
		req.setSmsFreeSignName("物流配送系统");
		req.setRecNum(num);
		req.setSmsTemplateCode("SMS_121030008");
		String str="{\"code\":\""+code+"\","+"\"name\":\""+num+"\"}";
		req.setSmsParamString(str);
		AlibabaAliqinFcSmsNumSendResponse rsp=null;
		System.out.println(str);
			 try {
				rsp = client.execute(req);
				System.out.println("发送成功");
			} catch (ApiException e) {
				// TODO Auto-generated catch block
				System.out.println("短信发送失败===================================");
				e.printStackTrace();
			}
		
		System.out.println(rsp.getBody());
		
}
}
