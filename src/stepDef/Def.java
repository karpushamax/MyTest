package stepDef;

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

public class Def {
	
	WebDriver driver;
	PageModel pagemodel;
	WebDriverWait wait;
	
	@Given("^I navigate to ydl page$")
	public void i_start_Firefox() throws Throwable {
		String url;
		
		
		url = Helper.getPropValue("ydl", "navigation");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bsati\\Documents\\work\\chromedriver.exe");
		driver = new ChromeDriver();	
		pagemodel = new PageModel(driver);
		wait=new WebDriverWait(driver,45);			
		 driver.get(url);
		 driver.manage().window().maximize();
		
		 WebElement whatWe = wait.until(ExpectedConditions.elementToBeClickable(pagemodel.webHome));
		 Assert.assertTrue(whatWe!=null);
		 
	}
	
	@When("^I navigate to WhatWeDo section$")
	public void i_navigate_to_WhatWeDo_section() throws Throwable {

		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(pagemodel.whatWe));
		element.click();
	}

	
	@Then("^WhatWeDo section is visible$")
	public void whatwedo_section_is_visible() throws Throwable {

		wait.until(ExpectedConditions.visibilityOf(pagemodel.work_text));
		
	}

	@When("^I navigate to Customers section$")
	public void i_navigate_to_Customers_section() throws Throwable {
		
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(pagemodel.customers));
		element.click();

	}

	@Then("^Customer section is visible$")
	public void customer_section_is_visible() throws Throwable {
		
		// 
		wait.until(ExpectedConditions.visibilityOf(pagemodel.customers_text));

	}

	
	@Then("^we are on whatWeDo page$")
	public void we_are_on_whatWeDo_page() throws Throwable {
		
		wait.until(ExpectedConditions.visibilityOf(pagemodel.work_text));
		String curr = driver.getCurrentUrl();
		
		String exp = Helper.getPropValue("whatWe", "menu");
		
		Assert.assertTrue(exp.equals(curr));
		
		
	}
	
	@Then("^we are on customers page$")
	public void we_are_on_customers_page() throws Throwable {

		wait.until(ExpectedConditions.visibilityOf(pagemodel.customers_text));
		String curr = driver.getCurrentUrl();
		
		String exp = Helper.getPropValue("customers", "menu");
		
		Assert.assertTrue(exp.equals(curr));		
		
		
	}

	@When("^I navigate to Resources section$")
	public void i_navigate_to_Resources_section() throws Throwable {

		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(pagemodel.resources));
		element.click();
		
		
	}
	
	@Then("^we are on Resources page$")
	public void we_are_on_resources_page() throws Throwable {

		wait.until(ExpectedConditions.visibilityOf(pagemodel.resources_text));
		String curr = driver.getCurrentUrl();
		
		String exp = Helper.getPropValue("resources", "menu");
		
		Assert.assertTrue(exp.equals(curr));
		
		
	}
	
	@When("^I navigate to About section$")
	public void i_navigate_to_About_section() throws Throwable {

		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(pagemodel.about));
		element.click();
		
		
	}
	
	@Then("^we are on About page$")
	public void we_are_on_about_page() throws Throwable {

		wait.until(ExpectedConditions.visibilityOf(pagemodel.about_text));
		String curr = driver.getCurrentUrl();
		
		String exp = Helper.getPropValue("about", "menu");
		
		Assert.assertTrue(exp.equals(curr));
		
		
	}
	
	@When("^I navigate to Contact section$")
	public void i_navigate_to_Contact_section() throws Throwable {

		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(pagemodel.contact));
		element.click();
		
		
	}
	
	@Then("^we are on Contact page$")
	public void we_are_on_contact_page() throws Throwable {

		wait.until(ExpectedConditions.visibilityOf(pagemodel.contact_text));
		String curr = driver.getCurrentUrl();
		
		String exp = Helper.getPropValue("contact", "menu");
		
		Assert.assertTrue("wrong location!", exp.equals(curr));
		
		
	}
	
	
	@When("^I fill email$")
	public void i_fill_email() throws Throwable {
		
		String email = "papazaitsa@gmail.com"; // TODO: put this into properties
		WebElement element = wait.until(ExpectedConditions.visibilityOf(pagemodel.email));
		element.sendKeys(email);
		element.sendKeys(Keys.ENTER);

	}

	@Then("^I see text SubscriptionComplete$")
	public void i_see_text_SubscriptionComplete() throws Throwable {

		String text = "Thank you for subscribing to our mailing list.";
		Assert.assertTrue("subscription failed", driver.getPageSource().contains(text));
		
		
	}
	
	@After
	public void clean_up()
	{
		driver.close();
	}
	
	
}
