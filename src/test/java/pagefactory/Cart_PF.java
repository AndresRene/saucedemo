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

public class Cart_PF {

WebDriver driver;
	
	
	@FindBy(id= "checkout")	
	WebElement btn_checkout;
	

	
	
	public Cart_PF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void checkout() {
		System.out.println("Starting - checkout process PF");	
		btn_checkout.click();
	}
	
	
}
