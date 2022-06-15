package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	
	//declaration
	@FindBy(xpath="//a[text()='Logout']" ) private WebElement logoutLink;
	@FindBy(xpath="//a[.='Create new tasks']") private WebElement createNewtasks;
	@FindBy(linkText="Settings") private WebElement settings;
	
	
	
	//initialization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	
	public WebElement getLogoutLink() {
		return logoutLink;
	}
	
	
	public WebElement getCreateNewtasks() {
		return createNewtasks;
	}
	public WebElement getSettings() {
		return settings;
	}
	
	// operational method
	
	public void clickLogout()
	{
		logoutLink.click();
	}
	

}
