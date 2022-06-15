package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitlemethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://omaya.blogspot.com/");
		String titleOfLoginPage=driver.getTitle();
		System.out.println(titleOfLoginPage);
		Thread.sleep(10000);
		driver.close();
		

	}

}
