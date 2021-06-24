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

public class checkout_step_two_PF {
	
WebDriver driver;
	
	
	@FindBy(id= "finish")	
	WebElement btn_finish;
	

	
	
	public checkout_step_two_PF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void finishShopping() {
		System.out.println("Starting - Finish the shopping PF");	
		btn_finish.click();
	}

}
