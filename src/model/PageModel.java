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
	
	
	@FindBy(how=How.CSS, using = "#keywords")
	public WebElement land_search;
	
	
	
	public final void init(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}

}
