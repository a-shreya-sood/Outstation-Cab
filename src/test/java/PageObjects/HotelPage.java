package PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;	
import TestBase.BaseClass;

public class HotelPage extends BasePage
{
	public HotelPage(WebDriver driver)
	{
		super(driver);

	}

	//xpath of hotel button
	@FindBy(xpath="//li[@class='menu_Hotels']")
	WebElement hotelButton;
	
	//xpath of rooms & guest
	@FindBy(xpath="//div[@class='hsw_inputBox roomGuests']")
	WebElement room_guest_button;


	//xpath to click on adult menu
	@FindBy(xpath = "(//*[@class=\"gstSlctCont\"])[2]")
	WebElement adultButton;

	
	//xath of number of adults
	@FindBy(xpath="//div[@class=\"gstSlctCont\"]/ul/li")
	List<WebElement>adultNum;
	
	
	//actions corresponding to each xpath
	public void click_hotel_icon()
	{
		hotelButton.click();	
	}
	
	//action for room&guest
	public void click_guest_icon()
	{
		room_guest_button.click();
    }
	
	//action foradult menu
	public void click_adult_button()
	{
		adultButton.click();	
	}
	
	//action for getting number of adult
	public void number_adult() 
	{
		for(WebElement e:adultNum)
		{
			String k=e.getText();
			System.out.println(k);
			driver.navigate().back();
		}
	}
	
}
