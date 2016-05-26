package com.calculator.calcBackend;


import javax.inject.Named;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;


/**
  * Add your first API methods in this class, or you may create another class. In that case, please
  * update your web.xml accordingly.
 **/
@Api(name = "calculator",
version = "v1",
scopes = {Constants.EMAIL_SCOPE},
clientIds = {Constants.WEB_CLIENT_ID, Constants.ANDROID_CLIENT_ID, Constants.IOS_CLIENT_ID},
audiences = {Constants.ANDROID_AUDIENCE}
)

public class CalcAPI {
	
	@ApiMethod(name = "add")
	public CalcBean add(@Named("value1") Integer value1, @Named("value2") Integer value2){
		CalcBean response = new CalcBean();
		response.setResult(String.valueOf((value1+value2)));
		return response;
	}
	
	//Subtract value2 from value1
	public CalcBean subtract(@Named("value1") Integer value1, @Named("value2") Integer value2){
		CalcBean response = new CalcBean();
		response.setResult(String.valueOf((value1-value2)));
		return response;
	}
	
	//multiplication  
	public CalcBean multiplication(@Named("value1") Integer value1, @Named("value2") Integer value2){
		CalcBean response = new CalcBean();
		response.setResult(String.valueOf((value1*value2)));
		return response;
	}
	
	//division  dividing value1 by value2
		public CalcBean division(@Named("value1") Integer value1, @Named("value2") Integer value2){
			CalcBean response = new CalcBean();
			response.setResult(String.valueOf((value1/value2)));
			return response;
		}
	
	
	
}
