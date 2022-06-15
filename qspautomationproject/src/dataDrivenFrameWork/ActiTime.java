package dataDrivenFrameWork;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://deva/login.do");
	driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	//generic reusable method
             Flib flib = new Flib();
	
             String username = flib.readData("./data/ActitimetestData.xlsx/","validcreads" , 1,1);
             String password = flib.readData("./data/ActitimetestData/","validcreads" , 1,1);
       
             
             
             
             
         	//login operation
     		driver.findElement(By.name("username")).sendKeys(username);
     		System.out.println(username);
     		driver.findElement(By.name("pwd")).sendKeys(password);
     		System.out.println(password);
     		driver.findElement(By.id("loginButton")).click();

     	
	}

}
