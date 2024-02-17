package TestCases;

import org.testng.annotations.*;
import PageObjects.GiftCardPage;
import TestBase.BaseClass;

public class Tc_002_GiftCardPage extends BaseClass 
{
	
	@Test(priority=1)
	public void verify_gift_button()
	{
		GiftCardPage gf=new GiftCardPage(driver);
		gf.gift_button();
	}
	
	@Test(priority=2)
	public void verify_gift_box()
	{
		GiftCardPage gf=new GiftCardPage(driver);
		gf.giftBox();
	}
	
	@Test(priority=3)
	public void verify_interested_button() throws InterruptedException
	{
		GiftCardPage gf=new GiftCardPage(driver);
		Thread.sleep(3000);
		gf.interestedButton();
	}
	

	@Test(priority=4)
	public void verify_user_name()
	{
		GiftCardPage gf=new GiftCardPage(driver);
		gf.userName();
	}
	
	@Test(priority=5)
	public void verify_phone_number()
	{
		GiftCardPage gf=new GiftCardPage(driver);
		gf.phoneNumber();
	}
	
	
	@Test(priority=6)
	public void verify_mail()
	{
		GiftCardPage gf=new GiftCardPage(driver);
		gf.mail();
	}
	

	@Test(priority=7)
	public void verify_location()
	{
		GiftCardPage gf=new GiftCardPage(driver);
		gf.location();
	}
	
	
	@Test(priority=8)
	public void verify_submit_button()
	{
		GiftCardPage gf=new GiftCardPage(driver);
		gf.submitButton();
	}
	
	
	
}
