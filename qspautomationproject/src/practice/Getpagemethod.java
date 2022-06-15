package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getpagemethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/QSpiders/Selenium/HTML%20files/radioButton.html");
		String sourceCodeOfTheWebPage=driver.getPageSource();
		System.out.println(sourceCodeOfTheWebPage);
	
		

	}

}
