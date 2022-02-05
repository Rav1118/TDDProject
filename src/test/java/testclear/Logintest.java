package testclear;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Baseclass;
import newpackage.PomLogin;

public class Logintest extends Baseclass {
	PomLogin Log;
	public Logintest() {
		super();
	}
	@BeforeMethod
	public void initsetup() throws IOException {
		initiation();
		screenshots("Login");
		Log= new PomLogin();
		
	}
@Test (priority=1)
public void  Title() {
	String actual=Log.verify();
	System.out.println(actual);
	Assert.assertEquals(actual, "STORE");
}
@Test(priority=2)
public void signup() throws InterruptedException {
	Log.signup();
	Log.typeusername(prop.getProperty("username"));
	Log.typepassword(prop.getProperty("password"));
	Log.clicksignin();
	Thread.sleep(3000);
	Alert alert= driver.switchTo().alert();
			alert.accept(); }

@AfterMethod
public void close () {
	driver.close();
}
	
@Test(priority=3)
public void Login() throws InterruptedException {
    Log.clickL();
    Thread.sleep(3000);
    Log.typeuser(prop.getProperty("username"));
    Log.typePassword(prop.getProperty("password"));
    Thread.sleep(3000);
    Log.clickLogin();
    Thread.sleep(2000);
    Log.clicklaptop();
    Thread.sleep(2000); 
    Log.clicklaptop();
   Thread.sleep(2000);
   Log.clickcomputer();
   Thread.sleep(2000);
   Log.clickcart();
   Thread.sleep(2000);
   Alert alert1= driver.switchTo().alert();
   alert1.accept();
   Log.shoppingcart();
   Thread.sleep(2000);
   Assert.assertEquals(Log.verifycart(), true);



	
	
	
	
	
	
	


}}
