package com.swiggy.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class RestaurantList {
	WebDriverWait wait;

	
	@FindBy(xpath= "//div[contains(@class,'Iou1H')]")
	private WebElement searchlocn;
	
	@FindBy(xpath="//input[contains(@class,'_381fS')]")
	private WebElement searchArea;
	
	@FindBy(xpath = "//div[contains(@class,'Ku2oK')][text()='BTM Layout']")
	private WebElement btmLocation;
	
	public RestaurantList(WebDriver driver) {
	PageFactory.initElements(driver, this);
  	wait = new WebDriverWait(driver,Duration.ofSeconds(40));
	}
	
	    public void clickLocn() {
		searchlocn.click();
		}
		
		public void  searchLocation() {
			wait.until(ExpectedConditions.visibilityOf(searchArea));
			searchArea.click();
		}

		public void enterLocation(String BTM) {
			wait.until(ExpectedConditions.visibilityOf(searchArea));
			searchArea.sendKeys(BTM);
		}
		
		public void clickBTM() {
			wait.until(ExpectedConditions.visibilityOf(btmLocation));
			btmLocation.click();
		}
}
