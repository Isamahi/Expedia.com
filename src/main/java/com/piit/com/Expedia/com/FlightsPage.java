package com.piit.com.Expedia.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightsPage {
	WebDriver driver;
@FindBy (xpath="//li[@id='flight-module-2019-12-01t17:55:00-05:00-coach-iad-zrh-ua-52-coach-zrh-cai-lx-238_2019-12-29t10:00:00+02:00-coach-cai-ams-ms-757-coach-ams-iad-ua-947_']//button[@class='btn-secondary btn-action t-select-btn']")
WebElement selectflights;
@FindBy (xpath="//li[@id='flight-module-2019-12-01t17:55:00-05:00-coach-iad-zrh-ua-52-coach-zrh-cai-lx-238_2019-12-29t10:00:00+02:00-coach-cai-ams-ms-757-coach-ams-iad-ua-947_']//button[@class='btn-secondary btn-action t-select-btn']")
WebElement confirmflight;
@FindBy (id="bookButton")
WebElement continuebooking;

public FlightsPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void flights() {
	selectflights.click();
}
public void flightconfirmation() {
	confirmflight.click();
}
public void booking1() {
	continuebooking.click();
}

}
