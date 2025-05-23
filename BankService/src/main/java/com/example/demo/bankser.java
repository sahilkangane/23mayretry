package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class bankser {	
	@PostMapping("bank/openaccount")
	String openaccount(@RequestBody Customer c) {
		
		
		//logic
		return "Account is opened for customer " + c.getName() + "/n"+  c.getAdhar()  ;
		
		
	}
	
	
}
class Customer{
	private String name;
	private String add;
	private String adhar;
	private String pan;
	private String sign;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public String getAdhar() {
		return adhar;
	}
	public void setAdhar(String adhar) {
		this.adhar = adhar;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}
	
	
}


