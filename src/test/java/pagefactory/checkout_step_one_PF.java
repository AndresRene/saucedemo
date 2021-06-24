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

public class checkout_step_one_PF {
	
WebDriver driver;
	
	
	@FindBy(id= "first-name")	
	WebElement txt_first_name;
	
	@FindBy(id= "last-name")	
	WebElement txt_last_name;
	
	@FindBy(id= "postal-code")	
	WebElement txt_postal_code;
	
	@FindBy(id= "continue")	
	WebElement btn_continue;

		
	public checkout_step_one_PF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void enterFirstName(String first_name) {
		System.out.println("Starting - Enter First Name");		
		txt_first_name.sendKeys(first_name);
	}
	
	public void enterLastName(String last_name) {
		System.out.println("Starting - Enter Last Name");		
		txt_last_name.sendKeys(last_name);
	}
	
	public void enterPostalCode(String postalCode) {
		System.out.println("Starting - Enter Postal Code");		
		txt_postal_code.sendKeys(postalCode);
	}
	
	public void clickOnContinue() {
		System.out.println("Starting - Click on Continue");		
		btn_continue.click();
	}
	

}
