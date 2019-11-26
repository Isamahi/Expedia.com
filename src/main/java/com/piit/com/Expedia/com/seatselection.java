package com.piit.com.Expedia.com;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class seatselection {
	WebDriver driver;
	@FindBy(id="seat-map-button")
	WebElement seatbutton;
	@FindBy(id="seat-info-menu-31E")
	WebElement selectseat;
	@FindBy(id="select-seat-31E")
	WebElement confirmseat;
	@FindBy(className="btn-secondary next-flight btn-action")
	WebElement nextflight;
	@FindBy(id="seat-info-menu-30C")
	WebElement returnseat;
	@FindBy(id="select-seat-30C")
	WebElement confirmreturnseat;
	@FindBy(xpath="//button[@class='btn-secondary next-flight btn-action']")
	WebElement nextflight2;
		@FindBy(id="seat-info-menu-30G")
	WebElement amsseat;
	@FindBy(id="select-seat-30G")
	WebElement amsseatclick;
	@FindBy(xpath="//button[@class='btn-secondary next-flight btn-action']")
	WebElement flight3;
	@FindBy(xpath="//button[@class='btn-secondary next-flight btn-action']")
	WebElement flight3button;
	@FindBy(id="seat-info-menu-41F")
	WebElement iadseat;
	@FindBy(id="select-seat-41F")
	WebElement iadselect;
	@FindBy(xpath="//button[@class='btn-secondary continue-booking btn-action']")
	WebElement continuebooking;
	public seatselection(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);}
public void seatmap() {seatbutton.click();}
public void selectseat1() {selectseat.click();}
public void selectseat2() { confirmseat.click();}
public void nextflight1() {nextflight.click();}
public void nextflight2() {returnseat.click();}
public void seatconfirmation1() {confirmreturnseat.click();}
public void nextflight3() {nextflight2.click();}
public void amsflight() {amsseat.click();}
public void amsseatselect() {amsseatclick.click();}
public void flight4() {flight3.click();}
public void flight4btn() {flight3button.click();}
public void returnf() {iadseat.click();}
public void returnselect() {iadselect.click();}
public void bookingcontinued() {continuebooking.click();}

}

