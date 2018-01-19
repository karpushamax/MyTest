package runner;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.nio.file.*;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.PageModel;
import runner.Helper;

public class Definition {
	
	WebDriver driver;
	PageModel pagemodel;
	WebDriverWait wait;
	
	@Given("^I navigate to webpage$")
	public void i_navigate_to_webpage() throws Throwable {
	 
		String url;
		
		
		url = Helper.getPropValue("landing", "navigation");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bsati\\Documents\\work\\chromedriver.exe");
		driver = new ChromeDriver();	
		pagemodel = new PageModel(driver);
		wait=new WebDriverWait(driver,45);			
		 driver.get(url);
		 driver.manage().window().maximize();
		
		 WebElement land = wait.until(ExpectedConditions.elementToBeClickable(pagemodel.land_search));
		 Assert.assertTrue(land!=null);
	   
	}


}