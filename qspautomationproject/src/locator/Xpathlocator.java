package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathlocator {
	public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://opensource-demo.orangehrmlive.com/");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	 Thread.sleep(2000);
	 driver.close();
	}
	

}
