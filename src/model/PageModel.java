package model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageModel {
	
	public PageModel(WebDriver d)
	{
		init(d);
	}
	
	
	@FindBy(how=How.CSS, using = "body > div > div > header > div.header-bar > div > nav > a.mdl-navigation__link.selected")
	public WebElement webHome;
	
	@FindBy(how=How.CSS, using = "body > div > div > header > div.header-bar > div > nav > a:nth-child(2)")
	public WebElement whatWe;
	
	@FindBy(how=How.CSS, using = "body > div > div > header > div.header-bar > div > nav > a:nth-child(3)")
	public WebElement customers;	
	
	@FindBy(how=How.CSS, using = "body > div > div > header > div.header-bar > div > nav > a:nth-child(4)")
	public WebElement resources;
	

	@FindBy(how=How.CSS, using = "body > div > div > header > div.header-bar > div > nav > a:nth-child(5)")
	public WebElement about;

	@FindBy(how=How.CSS, using = "body > div > div > header > div.header-bar > div > nav > a:nth-child(6)")
	public WebElement newsroom;
	
	@FindBy(how=How.CSS, using = "body > div > div > header > div.header-bar > div > nav > a:nth-child(7)")
	public WebElement contact;
	
	@FindBy(how=How.CSS, using = "body > div > div > main > div > section.hide-links.head.yld-section.yld-section-features.mdl-color-text--white > div.yld-section-header > div")
	public WebElement home_text;	
	
	
	@FindBy(how=How.CSS, using = "body > div > div > main > div > section.yld-section.yld-section-wwd-features.mdl-color-text--white > div.yld-section-header > div")
	public WebElement work_text;	
	
	@FindBy(how=How.CSS, using = "body > div > div > main > div > section.yld-section.yld-section-wwd-features.mdl-color-text--white > div > div:nth-child(2) > div.yld-section-header > div")
	public WebElement customers_text;
	
	@FindBy(how=How.CSS, using = "body > div > div > header > div.hero_left > h1")
	public WebElement resources_text;
	
	@FindBy(how=How.CSS, using = "body > div > div > main > div > section.mdl-color-text--white.yld-section.yld-section-meet-the-team.yld-section-blue > div.yld-section-header > div")
	public WebElement about_text;
	
	@FindBy(how=How.CSS, using = "body > div > div > main > div > section.yld-section.yld-section-find-us.mdl-color-text--white > div.yld-section-header > div")
	public WebElement contact_text;
	
//body > div > div > header > div.header-bar > div > nav > a:nth-child(8)
	@FindBy(how=How.CSS, using = "#email-e990f703-beee-40e8-972d-cd2671628f1d")
	public WebElement email;
	
	public final void init(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}

}
