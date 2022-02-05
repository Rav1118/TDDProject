package newpackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Baseclass;
public class PomLogin extends Baseclass{
	@FindBy(id="signin2") WebElement Signup;
	@FindBy(id="sign-username") WebElement Username;
	@FindBy(id="sign-password") WebElement Password;
	@FindBy(xpath="/html/body/div[2]/div/div/div[3]/button[2]") WebElement signupbutton; 
	@FindBy(id="login2") WebElement presslogin;
	@FindBy(id="loginusername") WebElement username;
	@FindBy(id="loginpassword") WebElement password;
	@FindBy(xpath ="//button[contains(text(),'Log in')]") WebElement Loginbutton;
	@FindBy(xpath="//a[contains(text(),'Laptops')]") WebElement laptop;
	@FindBy(className ="hrefch") WebElement vaio;
	@FindBy(css ="a.btn") WebElement addcart;
	@FindBy(id="cartur") WebElement cart;
	@FindBy(xpath="//td[contains(text(),'790')]") WebElement verify; 
	
	
	public PomLogin() {
	PageFactory.initElements(driver, this);  } 
	
	public void signup () {
		Signup.click();
	}
	public void typeusername(String username) {
		Username.sendKeys(username);
	}
	public void typepassword (String password) {
		Password.sendKeys(password);
	}
	public void clicksignin() {
		signupbutton.click();
	}
	public void clickL () {
		presslogin.click();
	}
	public void typeuser(String Username) {
		username.sendKeys(Username);
	}
	public void typePassword(String Password) {
		password.sendKeys(Password);
	}
	public void clickLogin() {
		Loginbutton.click();
	}
	public void clicklaptop() {
		laptop.click();
	}
	public void clickcomputer() {
		vaio.click();
	}
	public void clickcart () {
		addcart.click();
	}
	public void shoppingcart () {
		cart.click();
	}
	public void order() {
		verify.click();
	}
	public boolean verifycart() {
		return verify.isDisplayed();
	}
	public String verify() {
		return driver.getTitle();
	}
	public static void endSession() {
		driver.close();
		driver.quit();
	}}
	

