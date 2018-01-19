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
import java.util.List;

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
		
		 WebElement land = wait.until(ExpectedConditions.elementToBeClickable(pagemodel.landing_anchor));
		 Assert.assertTrue(land!=null);
	   
	}

	@Then("^I see section Latest_News$")
	public void i_see_section_Latest_News() throws Throwable {
 
		Assert.assertTrue("section not available",pagemodel.landing_section_latestnews!=null);
		
	}
	
	@When("^I click on About link$")
	public void i_click_on_About_link() throws Throwable {
 
		WebElement wel = pagemodel.topmenu_about_link;
		wel.click();
	}

	@Then("^I can see page title is About$")
	public void i_can_see_page_title_is_About() throws Throwable {
 
		WebElement wel = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("H1")));
		String title = wel.getText();
		String expected = Helper.getPropValue("about", "menu");
		Assert.assertTrue("Page title is wrong: " + wel, title.equals(expected));
	}

	@When("^I click on Service link$")
	public void i_click_on_Service_link() throws Throwable {
 
		WebElement wel = pagemodel.topmenu_services_link;
		wel.click();
	}

	@Then("^I can see page title is Service$")
	public void i_can_see_page_title_is_Service() throws Throwable {
 
		WebElement wel = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("H1")));
		String title = wel.getText();
		String expected = Helper.getPropValue("service", "menu");
		Assert.assertTrue("Page title is wrong: " + wel, title.equals(expected));
	}	

	@When("^I click on Work link$")
	public void i_click_on_Work_link() throws Throwable {
 
		WebElement wel = pagemodel.topmenu_work_link;
		wel.click();
	}

	@Then("^I can see page title is Work$")
	public void i_can_see_page_title_is_Work() throws Throwable {
 
		WebElement wel = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("H1")));
		String title = wel.getText();
		String expected = Helper.getPropValue("work", "menu");
		Assert.assertTrue("Page title is wrong: " + wel, title.equals(expected));
	}	
	
	@When("^I click on Contact link$")
	public void i_click_on_Contact_link() throws Throwable {
 
		WebElement wel = pagemodel.topmenu_globe_link;
		wel.click();
	}
	
	@Then("^I can see offices$")
	public void i_can_see_offices() throws Throwable {

		List<WebElement> weles = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("a[href*='/about/contact-us/']")));
		
		System.out.println("number of offices on the page is: " + Integer.toString(weles.size()));
	}

	
	@After
	public void clean_up()
	{
		driver.close();
	}
	
	
}