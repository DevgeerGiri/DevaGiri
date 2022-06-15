package testAnnotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class DataProviderCode {
	WebDriver driver;

  @BeforeMethod
  public void setup() 
  {
	  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	  driver.get("http://deva/login.do");
		
 }
  @DataProvider(name="testActiTimeData")
  public Object[][] dataprovider() 
  
  {
	  Object[][] data = new Object[5][2];
	  data[0][0]="admin1";
		data[0][1]="manager123";
		
		data[1][0]="ad min";
		data[1][1]="manager 123";
		
		data[2][0]="xyz123";
		data[2][1]="$#4123";
		
		data[3][0]="123";
		data[3][1]="admin";
		
		data[4][0]="123";
		data[4][1]="admin";
		
		
		
		return data;
	  
  }

  @Test(dataProvider = "testActiTimeData")
  public void loginActiTime(String username, String password) throws InterruptedException 
  {

		Thread.sleep(1000);
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
	  
  }
  @AfterMethod
  public void tearDown() 
  {
	  driver.quit();
  }

}
