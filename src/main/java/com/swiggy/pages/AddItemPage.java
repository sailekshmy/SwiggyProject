package com.swiggy.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddItemPage {
	
	WebDriverWait wait;

	
	@FindBy(xpath = "(//div[contains(@class,'styles_itemAddButton')]/div/div[contains(text(),'ADD')])[1]")
	private WebElement addItem;
	
	@FindBy(xpath ="(//div/button[(text()='Checkout')])")
	private WebElement checkoutBtn;
	
	public AddItemPage(WebDriver driver) {	
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		}
	
	public void addToCart() {
		wait.until(ExpectedConditions.visibilityOf(addItem));
		addItem.click();
	}
	
	public void clkCheckout() {
		wait.until(ExpectedConditions.visibilityOf(checkoutBtn));
		checkoutBtn.click();
	}
}
