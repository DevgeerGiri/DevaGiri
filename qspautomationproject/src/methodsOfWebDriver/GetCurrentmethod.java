package methodsOfWebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentmethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String currentUrl=driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		

	}

}
