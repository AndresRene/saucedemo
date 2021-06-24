/**
 * Clase Encargada de encapsular el comportamiento de las paginas para la prueba del caso https://www.saucedemo.com/
 * Autor: Andres Rene Hurtado R - andresrene.hurtado@gmail.com
 * 
*/
package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import pagefactory.Cart_PF;
import pagefactory.Inventory_PF;
import pagefactory.LoginPage_PF;
import pagefactory.checkout_complete_PF;
import pagefactory.checkout_step_one_PF;
import pagefactory.checkout_step_two_PF;



public class sauceLogin_PF {

	WebDriver driver= null;
	LoginPage_PF login;
	Inventory_PF inventory;
	Cart_PF cart;
	checkout_step_one_PF checkout_step_one;
	checkout_step_two_PF checkout_step_two;
	checkout_complete_PF checkout_complete;
	
	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("Starting - browser is open");

		// Se definen las objetos para abrir el browser	
		String projectPath = System.getProperty("user.dir");
		System.out.println("SProject Path is: " + projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();		
	
		System.out.println("Ending - browser is open");
		
	}
	@And("user goes to the webpage")
	public void user_goes_to_the_webpage() {
		System.out.println("Starting - navigating to the website");
		driver.navigate().to("https://www.saucedemo.com/");
		System.out.println("Ending - site is loaded");
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) {
		login= new LoginPage_PF(driver);
		login.enterUsername(username);
		login.enterPassword(password);
	}

	
	@And("clicks on login button")
	public void clicks_on_login_button() {
		login.clickOnLogin();
		//Se añade tiempo para poder evidenciar la prueba
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Then("user is navigated to the shop page")
	public void user_is_navigated_to_the_shop_page() {
		inventory = new Inventory_PF(driver);
		inventory.checkLogoutIsDisplayed();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		driver.quit();
	}

	@Then("user is not able to enter to the shop page")
	public void user_is_not_able_to_enter_to_the_shop_page() {
		
			login.invalidUser();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.close();
			driver.quit();
			System.out.println("Ending test step");

		
	}
	
	@Then("user select the max and min price item")
	public void user_select_the_max_and_min_price_item() {
		inventory = new Inventory_PF(driver);
		inventory.purchaseMaxItem();
		inventory.purchaseMinItem();
	}

	@And("clicks on the shopping cart")
	public void clicks_on_the_shopping_cart() {
	    inventory.shopingCart();
	}


	@Then("click on checkout")
	public void click_on_checkout() {
		cart = new Cart_PF(driver);
		cart.checkout();
	
	}

	@Then("^enters (.*) (.*) (.*)$")
	public void enters_pepe_perez(String firstName, String lastName, String postalCode) {
		checkout_step_one = new  checkout_step_one_PF(driver);
		checkout_step_one.enterFirstName(firstName);
		checkout_step_one.enterLastName(lastName);
		checkout_step_one.enterPostalCode(postalCode);
	}

	@Then("click on continue")
	public void click_on_continue() {
		checkout_step_one.clickOnContinue();

	}

	@Then("See the summary")
	public void see_the_summary() {
		checkout_step_two = new checkout_step_two_PF(driver);
	  
	}
	
	@Then("See the summary and click on finish")
	public void see_the_summary_and_click_on_finish() {
		checkout_step_two = new checkout_step_two_PF(driver);
		checkout_step_two.finishShopping();

	}

	@Then("the order is complete")
	public void the_order_is_complete() {
		checkout_complete = new checkout_complete_PF(driver);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		driver.quit();
	}
	
}

 