package com.swiggy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LandingPage {

	WebDriver driver;
	
	@FindBy(id = "location")
	private WebElement deliverylocation;
	
	
	//selecting bangalore  from the link displayed
	@FindBy(xpath = "(//a[contains(@class,'3zoZ8')])[2]")
	private WebElement bangalorelocn;
	
	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		
	
	public void searchBangalorelocn() {
        bangalorelocn.click();
	}
}
