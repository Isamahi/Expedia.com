package com.piit.com.Expedia.com;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Pause;
import org.testng.annotations.AfterClass;

public class ExpediaExecution {
	 WebDriver driver;
	@Test
   public void f() throws InterruptedException {
  ExpediaHP home=new ExpediaHP(driver);
  FlightsPage fly=new FlightsPage(driver);
  PassengerForm info=new PassengerForm(driver);
  seatselection seat=new   seatselection(driver);
 
  home.flightsbutton();
  home.flighttype();
  
Thread.sleep(6000);  
  home.flyfrom();
  home.arriveto();
  
Thread.sleep(6000);
  home.returnhome();
  home.departure();
  home.closecalander();
  
Thread.sleep(6000); 
  home.findflights();
  fly.flights();
  fly.flightconfirmation();
  
Thread.sleep(6000);
  fly.booking1();
  info.firstname();
  info.lastname();
  info.phonenumber();
  info.birthdateM();
  info.birthdateD();
  info.birthdateY();
Thread.sleep(6000);
  seat.seatmap();
  seat.selectseat1();
  
Thread.sleep(6000);
  seat.selectseat2();
  seat.nextflight1();
Thread.sleep(6000);
  seat.nextflight2();
  seat.seatconfirmation1();
Thread.sleep(6000);
  seat.nextflight3();
  seat.amsflight();
  seat.amsseatselect();
  
Thread.sleep(6000);
  seat.flight4();
  seat.flight4btn();
  
Thread.sleep(6000);
  seat.returnf();
  seat.returnselect();
  
  Thread.sleep(10000);
  seat.bookingcontinued();
	
	}
 
	
	
	
	private void clear() {
		// TODO Auto-generated method stub
		
	}




	@BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\elsat\\eclipse-workspace\\homedepot\\Drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(6, TimeUnit.MILLISECONDS);
	  
	  driver.navigate().to("https://www.expedia.com/");
  }

  @AfterClass
  public void afterClass() {
  }

}
