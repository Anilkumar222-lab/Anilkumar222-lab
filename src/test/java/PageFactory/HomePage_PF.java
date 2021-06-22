package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_PF {
	
	@FindBy(xpath="//aside[@id='column-right']//a[13]")
	WebElement opt_logout;
	WebDriver driver;
	public HomePage_PF(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void CheckLogoutIsDisplayed()
	{
		boolean ispresent=opt_logout.isDisplayed();
		System.out.println(ispresent);
		if(ispresent)
		{
			System.out.println("logout option is present");
		}
		else
		{
			System.out.println("logout option is not present");
		}
		opt_logout.click();
	}

}
