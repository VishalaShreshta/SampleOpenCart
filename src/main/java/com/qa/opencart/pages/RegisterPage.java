package com.qa.opencart.pages;

import org.openqa.selenium.WebDriver;

public class RegisterPage {
	
	private WebDriver driver;
	
	public RegisterPage(WebDriver driver) {
		
		this.driver = driver;
		System.out.println("I am at Register Page");
	}

}
