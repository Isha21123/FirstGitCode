package testcases1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Insta.LoginPage;

public class CreateNewButtonTC {
	
	public WebDriver driver;
	public LoginPage lp;
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","...");
		   
		WebDriver driver=new ChromeDriver();

		
	  driver.navigate().to("https://www.facebook.com/"); 
	    driver.manage().window().maximize(); 
	    lp=new LoginPage(driver);
		
	}
	
@Test


public void loginCheck() 
{
	lp.setUserName("user");
	lp.setPassword("Pass");
	lp.clicklogin();
	
	
	
	
	
}

@Test

public void forgotPasswordText()
{
	lp.textForgotPassword();
}


@Test

public void cresateNewButton() throws InterruptedException
{
lp.clickCreateNewAccount();
Thread.sleep(3000);
}


@AfterMethod

public void tearDown() 
{
	
driver.close();

}












}
