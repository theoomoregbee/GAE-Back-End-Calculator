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
	
	/**
	 * Add method to add value1 and value2 
	 * @param value1 method argument
	 * @param value2 method argument
	 * @return a bean object response to the requester
	 */
	//@ApiMethod(name = "add")
	public CalcBean add(@Named("value1") Integer value1, @Named("value2") Integer value2){
		CalcBean response = new CalcBean();
		response.setResult(String.valueOf((value1+value2)));
		return response;
	}
	
	/**
	 * 
	 * Subtract method to subtract value2 from value 1
	 * @param value1 The value property 
	 * @param value2 The value2 property
	 * @return
	 */
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
