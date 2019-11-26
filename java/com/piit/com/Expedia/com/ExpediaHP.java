package com.piit.com.Expedia.com;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class ExpediaHP {
WebDriver driver;
	@FindBy(xpath="//button[@id='tab-flight-tab-hp']//span[@class='uitk-icon uitk-icon-flights']")
WebElement Flights;
	@FindBy(id="flight-type-roundtrip-label-hp-flight")
WebElement roundtripbutton;
	@FindBy(id="flight-origin-hp-flight")
	WebElement flyout;
	@FindBy(id="flight-destination-hp-flight")		
WebElement destination;
	@FindBy(xpath="//input[@id='flight-departing-hp-flight']")
WebElement Departdate;
	@FindBy (xpath="//button[@class='datepicker-close-btn close btn-text']")
	WebElement calanderclose;

	@FindBy(xpath="//input[@id='flight-returning-hp-flight']")
WebElement returndate;
	@FindBy(xpath="//form[@id='gcw-flights-form-hp-flight']//button[@class='btn-primary btn-action gcw-submit']")
WebElement searchbutton;
    public ExpediaHP(WebDriver driver) {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
}
 public void flightsbutton() {
	 Flights.click();
 }
 public void flighttype() {
	 roundtripbutton.click();
 }
 public void flyfrom() {
	 flyout.sendKeys("IAD");
 }
 public void arriveto() {
	 destination.sendKeys("CAI");
 }
 
 public void returnhome() {
		
	 returndate.sendKeys("12/29/2019");
 }
 
	 public void departure() {
		 Departdate.sendKeys("12/01/2019");
 }
 public void findflights() {
	 searchbutton.click();
	 
 }
public void clear() {
	// TODO Auto-generated method stub
	
}
public void closecalander() {
	calanderclose.click();
}

}