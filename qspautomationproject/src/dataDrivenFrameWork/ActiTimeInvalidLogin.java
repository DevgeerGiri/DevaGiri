package dataDrivenFrameWork;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeInvalidLogin {
     public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
    	 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
    	 ChromeDriver driver = new ChromeDriver();
    	 driver.manage().window().maximize();
    	 driver.get("http://deva/login.do");
    	
    	
    	 driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
    	 
    	 Flib flib=new Flib();
    	 int rc = flib.getrowCount("./data/ActiTimetestData.xlsx","invalidcreds");
    	 
    	 
    	 for(int i=1;i<=rc;i++)
 		{
 			String username = flib.readData("./data/ActiTimetestData.xlsx","invalidcreds", i, 0);
 			String password = flib.readData("./data/ActiTimetestData.xlsx","invalidcreds", i, 1);

 			driver.findElement(By.name("username")).sendKeys(username);
 			System.out.println(username);
 			driver.findElement(By.name("pwd")).sendKeys(password);
 			System.out.println(password);
 			Thread.sleep(2000);

 			driver.findElement(By.id("loginButton")).click();
 			Thread.sleep(2000);
 			driver.findElement(By.name("username")).clear();
 	 
 		}
		
	}


}
