package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class idlocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/QSpiders/Selenium/HTML%20files/textbox.html");
		Thread.sleep(4000);
		driver.findElement(By.id("i1")).sendKeys("Admin");
		driver.findElement(By.id("i2")).sendKeys("admin123");

	}

}
