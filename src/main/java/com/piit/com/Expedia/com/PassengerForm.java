package com.piit.com.Expedia.com;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class PassengerForm {
	WebDriver driver;
@FindBy (id="firstname[0]")
WebElement Fnamefield;
@FindBy (id="lastname[0]")
WebElement lnamefield;
@FindBy(id="phone-number[0]")
WebElement phonefield;
@FindBy(id="gender_male[0]")
WebElement selectgender;
@FindBy(id="date_of_birth_month[0]")
WebElement birthmonth;
@FindBy(id="date_of_birth_day[0]")
WebElement birthday;
@FindBy(id="date_of_birth_year[0]")
WebElement birthyear;
public PassengerForm(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void firstname() {Fnamefield.sendKeys("Martin");}

public void lastname() { lnamefield.sendKeys("cooper");}

public void phonenumber() {phonefield.sendKeys("7034278854");}

public void gender() {selectgender.click();}

public void birthdateM() {birthmonth.sendKeys("09");}

public void birthdateD(){birthday.sendKeys("15");}

public void birthdateY() {birthyear.sendKeys("1995");}
}
