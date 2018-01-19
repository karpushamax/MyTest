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

	@FindBy(how=How.CSS, using = "#navigationMenuWrapper > div > ul > li:nth-child(1) > a > span")
	public WebElement topmenu_about_link;
	// 
	@FindBy(how=How.CSS, using = "#navigationMenuWrapper > div > ul > li:nth-child(2) > a > span")
	public WebElement topmenu_work_link;
	
	@FindBy(how=How.CSS, using = "#navigationMenuWrapper > div > ul > li:nth-child(3) > a > span")
	public WebElement topmenu_services_link;
	
	@FindBy(how=How.CSS, using = "#navigationMenuWrapper > div > ul > li:nth-child(4) > a > span")
	public WebElement topmenu_partners_link;
	
	@FindBy(how=How.CSS, using = "#navigationMenuWrapper > div > ul > li:nth-child(5) > a > span")
	public WebElement topmenu_industries_link;
	
	@FindBy(how=How.CSS, using = "#navigationMenuWrapper > div > ul > li:nth-child(6) > a > span")
	public WebElement topmenu_insights_link;	
	
	@FindBy(how=How.CSS, using = "#navigationMenuWrapper > div > ul > li:nth-child(7) > a > span")
	public WebElement topmenu_careeers_link;
	
	@FindBy(how=How.CSS, using = "#contacticon > div > div > div.hamburger__front_lang > i")
	public WebElement topmenu_globe_link;
	
	@FindBy(how=How.CSS, using = "#wrapper > header > div > a > i")
	public WebElement topmenu_home_link;
	
	@FindBy(how=How.CSS, using = "#container > div:nth-child(1) > div:nth-child(2) > p.startpage__highlighted-text > span")
	public WebElement landing_anchor;
	
	@FindBy(how=How.CSS, using = "#container > div:nth-child(2) > div:nth-child(3)")
	public WebElement landing_section_latestnews;
	
	public final void init(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}

}
