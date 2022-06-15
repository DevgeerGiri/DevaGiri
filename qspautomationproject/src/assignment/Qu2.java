package assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qu2 {

	public static void main(String[] args) throws InterruptedException {
		// How to close all browser without quite mathod
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.linkText("Open a popup window")).click();
		Thread.sleep(4000);
		Set<String> allHandles=driver.getWindowHandles();
		for (String wh:allHandles)
		{
			driver.switchTo().window(wh).close();
		}

	}

}
