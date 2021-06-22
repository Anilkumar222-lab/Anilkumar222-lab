package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageFactory.HomePage_PF;
import PageFactory.LoginPage_PF;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;

public class Apploginsteps {
	public  WebDriver driver;
	LoginPage_PF login;
	HomePage_PF Home;
	@Given("User is on Google chrome page")
	public void user_is_on_google_chrome_page() {
		System.out.println("-----Login feature test using POM with PF-----------");
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Given("User enters the valid url")
	public void user_enters_the_valid_url() {
		
		driver.get("http://tutorialsninja.com/demo/index.php?route=common/home");


	}

	@When("user clicks login option in  the Website")
	public void user_clicks_login_option_in_the_website() throws InterruptedException {
		
		login=new LoginPage_PF(driver);
		login.selectloginoption();
		Thread.sleep(4);
		//driver.findElement(By.xpath("//*[@id='top-links']/ul/li[2]/a/span[1]")).click();
		//driver.findElement(By.xpath("//a[text()='Login']")).click();
		
	}

	@When("^user enters valid (.*) and (.*) in Login page$")
	public void user_enters_valid_username_and_password_in_login_page(String username,String password) throws InterruptedException {
	   
		login.enterusernameandpassword(username, password);
		//System.out.println("Inside step-user enters valid username and password in Login page");
		//driver.findElement(By.xpath("//input[@name='email']")).sendKeys(username);
		//driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	}

	@When("user clicks on Login button")
	public void user_clicks_on_login_button() {
		
		login.clickLogin();
		
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("User is navigated to the Home Page")
	public void user_is_navigated_to_the_Home_Page() throws InterruptedException {
		Thread.sleep(3000);
		Home=new HomePage_PF(driver);
		Home.CheckLogoutIsDisplayed();
		

	}
}
