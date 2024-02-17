package TestCases;
//import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import PageObjects.CabPage;
import TestBase.BaseClass;

public class Tc_001_CabPageTest extends BaseClass {
	CabPage hp;
   @Test(priority=1)
	public void verify_cab_click() 
	{
		hp=new CabPage(driver);
		hp.click_cab();
	}
   
   @Test(priority=2)
   public void verify_departure()
   {
	   hp=new CabPage(driver);
	   hp.departure();
	   
	  
   }
 
   @Test(priority=3)
   public void verify_arrival() throws InterruptedException
   {
	   hp=new CabPage(driver);
	   hp.arrival();

   }
   
   @Test(priority=4)
   public void verify_date()
   {
     hp.date();
     hp.time();
   }
   
   @Test(priority=5)
   public void verfiy_button()
   {
	  hp.apply_button();
	  hp.search_button();
	  driver.navigate().back();
   }
   
   
}
