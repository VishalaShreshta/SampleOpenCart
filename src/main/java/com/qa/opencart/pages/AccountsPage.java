package com.qa.opencart.pages;

import org.openqa.selenium.WebDriver;

import com.qa.opencart.utils.ElementUtil;

public class AccountsPage {	
	
	private WebDriver driver;
	private ElementUtil elementUtil;
	
	public AccountsPage(WebDriver driver2) {
		this.driver = driver;
		System.out.println("I am at Accounts Page");
	}

}
