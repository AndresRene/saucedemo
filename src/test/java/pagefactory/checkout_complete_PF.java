/**
 * Clase Encargada de encapsular el comportamiento de la paginas para la prueba del caso https://www.saucedemo.com/
 * Autor: Andres Rene Hurtado R - andresrene.hurtado@gmail.com
 * 
*/
package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkout_complete_PF {
	
WebDriver driver;
	
	
	
	public checkout_complete_PF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void successValidation() {
		System.out.println("Starting - Searching for  THANK YOU FOR YOUR ORDER");	
		driver.getPageSource().contains("HANK YOU FOR YOUR ORDER");
	}

}
