package PageFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {
	WebDriver driver;
	
	public LoginPage_PF(WebDriver driver)
	{
	  this.driver=driver;
	  PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//div[@id='top-links']//a[@title='My Account']")
	WebElement opt_Myaccount;
	
	@FindBy(xpath="//a[text()='Login']")
	WebElement opt_Login;
	
	@FindBy(xpath="//input[@name='email']")
	WebElement txt_username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement txt_password;
	
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement btn_login;

	
	public void selectloginoption()
	{
		try{
			opt_Myaccount.click();
			opt_Login.click();
		}
		catch(Exception e)
		{
			System.out.println("exception occurred");
		}
				
		
	}

	public void enterusernameandpassword(String username,String password){
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		txt_username.sendKeys(username);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		txt_password.sendKeys(password);
		
	}
	 public void clickLogin(){
		 btn_login.click();
	 }
}
