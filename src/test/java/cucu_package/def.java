package cucu_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
/*
public class def {
	WebDriver driver = null;
	
	@Given("lauching the test me app")
	public void lauching_the_test_me_app() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6b.01.07\\Desktop\\Vindhya\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		
	}
	
	
	@Given("launching the app")
	public void launching_the_app() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("hello world");
	
	}

	@Then("click on login button to login")
	public void click_on_login_button_to_login() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@Then("user provides credentials for login")
	public void user_provides_credentials_for_login() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@Given("search items to be added to he cart")
	public void search_items_to_be_added_to_he_cart() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
	}

	@Then("click on search item")
	public void click_on_search_item() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
	}

	@Then("add the item to cart")
	public void add_the_item_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}
}
*/


public class def
{
	WebDriver driver;
	@Given("lauching the test me app")
	public void lauching_the_test_me_app() {
		
		System.out.println("A");
		
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("launching the app")
	public void launching_the_app() {
		
		
		
		driver = drivers.configureDriver("chrome");
		//driver.get(");
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6b.01.07\\Desktop\\Vindhya\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
		 //driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");
		
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	//	System.out.println("A");
	}

	@Then("click on login button to login")
	public void click_on_login_button_to_login() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//a[@href='login.htm']")).click();
		//<a href="login.htm"><i class="fa fa-lock"></i>
		//SignIn</a>
		
		System.out.println("A");
	}

	@Then("user provides credentials for login")
	public void user_provides_credentials_for_login() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
		System.out.println("A");
	}

	@Given("search items to be added to he cart")
	public void search_items_to_be_added_to_he_cart() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("A");
	}

	@Then("click on search item")
	public void click_on_search_item() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("A");
	}

	@Then("add the item to cart")
	public void add_the_item_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("A");
	}
}