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
	public CalcBean add(@Named("a") Integer a, @Named("b") Integer b){
		CalcBean response = new CalcBean();
		response.setResult(String.valueOf((a+b)));
		return response;
	}
	
	
}
