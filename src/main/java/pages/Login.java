package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;


public class Login {
	
	public WebDriver driver;
	WebDriverWait Wait;
	
	
	public Login(WebDriver driver) {
		this.driver = driver;
	}

	By usernamefield = By.xpath("//input[@placeholder='Username']");
	By passwordfield = By.name("password");
	By loginbutton = By.xpath("//button[@type='submit']");
   @Parameters("username")
	public void enterusername(String username) {
	 Wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.findElement(usernamefield).sendKeys(username);
		}
	@Parameters("password")
	public void enterpassword(String password) {
		driver.findElement(passwordfield).sendKeys(password);
	}
	public void clicklogin() {
		driver.findElement(loginbutton).click();
	}
}
