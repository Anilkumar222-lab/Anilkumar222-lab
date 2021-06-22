package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	WebDriver driver;
	By opt_Myaccount=By.xpath("//div[@id='top-links']//a[@title='My Account']");
	By opt_login=By.xpath("//a[text()='Login']");
	By txt_username=By.xpath("//input[@name='email']");
	By txt_password=By.xpath("//input[@name='password']");
	By btn_login=By.xpath("//input[@value='Login']");
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void selectloginoption() throws InterruptedException
	{
		//Thread.sleep(3);
		driver.findElement(opt_Myaccount).click();
		driver.findElement( opt_login).click();
		
	}
	
	public void enterusernameandpassword(String username,String password) throws InterruptedException
	{
		/*try
		{
		WebDriverWait wait=new WebDriverWait(driver,20);
		   WebElement ele=wait.until(ExpectedConditions.visibilityOfElementLocated(txt_username));
		}
		catch(Exception e){
			System.out.println("wait exception");
		}*/
		//Thread.sleep(4);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		try{
		driver.findElement(txt_username).sendKeys(username);
		}
		catch(Exception e1){
			System.out.println("element is not there");
		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(txt_password).sendKeys(password);
		
	}
   public void clickLogin()
   {
	   driver.findElement(btn_login).click();
   }
}
