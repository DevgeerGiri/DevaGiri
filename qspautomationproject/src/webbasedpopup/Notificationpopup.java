package webbasedpopup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notificationpopup {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--disable-notifications");//disable the notification popup
	co.addArguments("-start-maximized");//maximize the browser
	ChromeDriver driver = new ChromeDriver(co);
	driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	driver.get("https://optinmonster.com/what-is-a-popup-notification/");
	
		
	}

}
