/**
 * Clase Encargada de encapsular el comportamiento de las paginas para la prueba del caso https://www.saucedemo.com/
 * Autor: Andres Rene Hurtado R - andresrene.hurtado@gmail.com
 * 
*/
package pagefactory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {

	WebDriver driver;
	
	
	@FindBy(id= "user-name")
	WebElement txt_username;
	
	@FindBy(id= "password")	
	WebElement txt_password;
	
	@FindBy(id= "login-button")	
	WebElement btn_login;
	
	
	public LoginPage_PF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterUsername(String username) {
		System.out.println("Starting - Sending the user name PF");
		txt_username.sendKeys(username);
		System.out.println("Ending - Sending the user name");
	}

	public void enterPassword(String password) {
		System.out.println("Starting - Sending the password PF");
		txt_password.sendKeys(password);
		System.out.println("Ending - Sending the password");
	}
	
	public void clickOnLogin() {
		System.out.println("Starting - click on login PF");
		btn_login.click();
		System.out.println("Endind");
	}
	
	public void invalidUser() {
		System.out.println("Starting - validating error message PF");
		driver.getPageSource().contains("Sorry, this user has been locked out");
		System.out.println("Ending test step");
	}
	

}
