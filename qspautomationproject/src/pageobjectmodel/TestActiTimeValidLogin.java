package pageobjectmodel;

import java.io.IOException;

public class TestActiTimeValidLogin extends BaseTest {
	public static void main(String[] args) throws IOException, InterruptedException {
		//1
		BaseTest bt =new BaseTest();
		bt.setUp();
		Flib flib = new Flib();
		//read the data from excel file by using generic reusable methods
				String validUsername = flib.readPropertyFile(PROP_PATH, "username");
				String validPassword = flib.readPropertyFile(PROP_PATH, "password");
		
		LoginPage lp = new LoginPage(driver);
		lp.ActiTimeValidTest(validUsername, validPassword);
		Thread.sleep(2000);
		bt.tearDown();
	}

}
