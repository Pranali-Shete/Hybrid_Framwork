package StepDefination;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	public static WebDriver driver;

	
	@Given("user is on login page")
	public void user_is_on_login_page() {	
      WebDriverManager.chromedriver().setup();
       driver=new ChromeDriver();
       driver.get("https://www.facebook.com/");
      
	   
	}

	@When("user enter valid username and valid password")
	public void user_enter_valid_username_and_valid_password() {
		driver.findElement(By.id("email")).sendKeys("Admin");
		
	}

	@Then("user will be home page")
	public void user_will_be_home_page() {
	System.out.println(driver.getTitle());
	}
}


