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

public class Inventory_PF {
	

	WebDriver driver;
	
	
	@FindBy(id= "add-to-cart-sauce-labs-fleece-jacket")	
	WebElement btn_max_item;
	
	@FindBy(id= "add-to-cart-sauce-labs-onesie")	
	WebElement btn_min_item;
	
	@FindBy(id= "shopping_cart_container")	
	WebElement btn_shopping_cart;
	
	
	@FindBy(id= "logout_sidebar_link")	
	WebElement btn_logout;
	
	
	public Inventory_PF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void checkLogoutIsDisplayed() {
		System.out.println("Starting - validating landing page PF");	
		btn_logout.isDisplayed();
	}
	
	
	public void purchaseMaxItem() {
		System.out.println("Starting - Buying the Max Item");	
		btn_max_item.click();
		System.out.println("Ending - Buying the Max Item");
		
	}
	
	public void purchaseMinItem() {
		System.out.println("Starting - Buying the Min Item");	
		btn_min_item.click();
		System.out.println("Ending - Buying the Min Item");
		
	}
	
	public void shopingCart() {
		System.out.println("Starting - go to shopping cart");
		btn_shopping_cart.click();
		System.out.println("Endind - go to shopping cart");
	}
	
	
	
}
