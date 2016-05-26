package com.calculator.calcBackend;

public class CalcBean {
	private String result;
	
	
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
