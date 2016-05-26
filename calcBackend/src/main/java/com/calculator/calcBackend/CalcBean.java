package com.calculator.calcBackend;

public class CalcBean {
	private String result;
	/*the variables you add here sum up the json format view
	, which is coool. add repective set and get
	*/
	public CalcBean() { 
	}
	
	public CalcBean(String result){
		this.result=result;
	}
	
	public String getResult() {
		return result;
	}
	
	public void setResult(String result) {
		this.result = result;
	}
	
	 
	 
}
