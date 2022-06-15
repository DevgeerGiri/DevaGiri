package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launchchrome2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		// to avoid to illegal exception		
		ChromeDriver driver=new ChromeDriver();
		// to open the browser
		driver.manage().window().maximize();
		//maximize the browser
		driver.get("https://sharechat.com");
		//Launch the web application
		Thread.sleep(10000);
		//provide delay after 10 sec
		driver.close();
		//to close the browser
		
		

	}








}


