package TestCases;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import PageObjects.HotelPage;
import TestBase.BaseClass;

public class Tc_003_Hotelpage extends BaseClass
{
	@Test(priority=1)
	    public void verify_hotel_button()
	    {
	        HotelPage hp = new HotelPage(driver);
	        hp.click_hotel_icon();
	    }
	
	@Test(priority=2)
	public void verify_adult_button() throws InterruptedException
	{
		 HotelPage hp = new HotelPage(driver);
		 Thread.sleep(2000);
		 hp.click_guest_icon();
		 hp.click_adult_button();
	}
	
	@Test(priority=3)
	public void verify_adult_number()
	{
		 HotelPage hp = new HotelPage(driver);
		hp.number_adult();
		
	}
}
