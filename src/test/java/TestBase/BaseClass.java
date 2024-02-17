package TestBase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

public class BaseClass 
{
	public WebDriver driver; 
	public Logger logger; 
	public Properties p;

	@BeforeClass
	@Parameters({"browser"})
	public void setUp(String br) throws IOException
	{
		//setting the config properties file
		FileReader file=new FileReader(".//src/test//resources//config.properties");
		p=new Properties();
		p.load(file);
		
		//loading logger file
		logger=LogManager.getLogger(this.getClass());
		if(br.equalsIgnoreCase("Chrome"))
		{
		  driver=new ChromeDriver();	
		}
		else if(br.equalsIgnoreCase("Edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			System.out.println("No browser found");
		}
		driver.get(p.getProperty("appURL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	
	@AfterClass
	public void tearDown()
	{
		//driver.quit();
	}
	
	public void captureScreen(String Name) throws IOException
	{
		TakesScreenshot sc=(TakesScreenshot)driver;
		File sourceFile = sc.getScreenshotAs(OutputType.FILE);
 		
 		String targetFilePath=System.getProperty("user.dir")+"\\Screenshots\\" + Name + ".png";                          
 		File targetFile=new File(targetFilePath);
 		FileUtils.copyFile(sourceFile, targetFile);
 		 
		
	}
}
