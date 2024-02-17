package PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class GiftCardPage extends BasePage 
{
	JavascriptExecutor js=(JavascriptExecutor)driver;

	public GiftCardPage(WebDriver driver) 
	{
		super(driver);
		
	}
	
	//xpath of giftButton
	@FindBy(xpath="//ul[@class=\"choosFrom__list\"]/li[5]")
	WebElement gift_card_button;
	
	
	//xpath of giftbox 
	@FindBy(xpath="//img[@src='https://promos.makemytrip.com/appfest/2x/banner_corporate_gc.png']")
	WebElement gift_box;
	
	//xpath of interested button
	@FindBy(xpath="//*[text()='I’m Interested']")
	WebElement interested_button;
	
	//xpath of username
	@FindBy(xpath="//input[@id='name']")
	WebElement user_name;
	
	//xpath of phonenumber
	@FindBy(xpath="//input[@id='phone_number']")
	WebElement phone_number;
	
	//xpath of email
	@FindBy(xpath="//input[@id='email']")
	WebElement email;
	
	//xpath of location
	@FindBy(xpath="//input[@id='location']")
	WebElement location;
	
	//xpath of submitbutton
	@FindBy(xpath="//input[@id='submitButton']")
	WebElement submit;
	
	
	//action against gift card button
	
	public void gift_button()
	{
		gift_card_button.click();
	}
	
	//action of giftBox
	public void giftBox()
	{
		try
		{
			
		js.executeScript("arguments[0].scrollIntoView();",gift_box);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//action for interested button
	public void interestedButton()
	{
		try
		{
			interested_button.click();		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
      
	}
	
	//action to send username
	public void userName()
	{
		try
		{
		user_name.sendKeys("Abhishek");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//action to send phoneNumber
	public void phoneNumber()
	{
		try
		{
		phone_number.sendKeys("7834925473");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//action to send mail
	public void mail()
	{
		try
		{
		email.sendKeys("123@.com");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//action for location
	public void location()
	{
		try
		{
		location.sendKeys("Shimla");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//action 
	public void submitButton()
	{
		try
		{
		submit.click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
