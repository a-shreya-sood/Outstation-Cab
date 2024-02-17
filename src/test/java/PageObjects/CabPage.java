package PageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CabPage extends BasePage
{

	public CabPage(WebDriver driver)
	{
		super(driver);

	}

	//Finding xpath of cabs button
	@FindBy(xpath="//*[@class='chNavIcon appendBottom2 chSprite chCabs active']")
	WebElement carButton;
	
	
	//Finding xpath of from destination
	@FindBy(xpath="//*[@class='csw_inputBox searchCity increaseHeight']")
	WebElement departureCityButton;
	
    
	//Finding xpath of destinationcity
	@FindBy(xpath="//*[@class='react-autosuggest__suggestions-list']/li")
	List<WebElement>departureCities;
	
	//Finding xpath of tosearch input box
	@FindBy(xpath="//input[@placeholder='To']")
	WebElement toSearch;
	
	
	//finding xpath of arrival button
	@FindBy(xpath="//input[@id='toCity']")
	WebElement arrivalCityButton;
	
	
	//finding xpath of arrivalCities
	@FindAll(@FindBy(xpath="//ul[@class='react-autosuggest__suggestions-list']/li"))
	List<WebElement>arrivalCities;

	
	//Finding xpath of the calender
	@FindBy(xpath="//div[@class='csw_inputBox dates increaseHeight']")
	WebElement calenderButton;
	
	//Finding xpath of departure date
	@FindBy(xpath="(//*[@class=\"DayPicker-Day\"])[40]")
	WebElement date;
	
	
	//Finding xpath of the departureTime
	@FindBy(xpath="//div[@class='csw_inputBox timePicker increaseHeight']")
	WebElement time;
	
	
	//finding xpath of the hour
	@FindBy(xpath="//div[@class=\"makeFlex row\"]//li[7]")
	WebElement time1;
	
	//finding xpath of the minute
	@FindBy(xpath="//ul[@class=\"newTimeSlotMinUl\"]//li[7]")
	WebElement time2;
	
	
	//finding the xpath of the morning or evening
	@FindBy(xpath="//ul[@class='newTimeSlotMerUl']//li")
	WebElement time3;
	
	//Finding the xpath to click on apply
	@FindBy(xpath="//span[@class='applyBtnText']")
	WebElement applyButton;
	
	
	//Finding xpath of search button
	@FindBy(xpath="//*[text()='Search']")
	WebElement search;
	
	
	//action performed on cabs button
	public void click_cab()
	{
		carButton.click();
	}
	
	//action performed for clicking on departure
	public void departure()
	{
		departureCityButton.click();
		for(WebElement e:departureCities)	
		{
			String cityName=e.getText();
			System.out.println(cityName);
			if(cityName.equalsIgnoreCase("Delhi"))
			{
				e.click();
				break;
			}
		}
}
	
	
	
	//action perfomed to get all to cities from dropdown
		public void arrival() throws InterruptedException
		{
     	    //clicking on arrival button    
			arrivalCityButton.click();
 
			//sending value to To input box
     	     toSearch.sendKeys("Manali");
     	      //Thread.sleep(3000);
     	     for (int i = 0; i < departureCities.size(); i++) 
     	     {
     	        WebElement ele = departureCities.get(i);
     	        String a = ele.getText();
     	        System.out.println(a);
     	        if (a.equalsIgnoreCase("Manali, Himachal Pradesh, India"))
     	          {
     	            if (i == 0) {
     	                ele.click();
     	                break; 
     	          }
     	        }
     	    }
		}
	
	
	
	//action to click on calender block
     public void calButton() 
     {
    	 calenderButton.click();
    }
     
     //action to select the date
     public void date()
     {
    	 //System.out.println("The cureeent date:"+date);
    	 //date.click();
     }
     
     
     //action to select the hour
     public void time()
     {
    	 time1.click();
    	 time2.click();
    	 time3.click();
     }
     
     

     
     //action to select the apply button
     public void apply_button()
     {
    	 applyButton.click();
     }
     
     
     //action against search button
     public void search_button()
     {
    	 search.click();
     }
}