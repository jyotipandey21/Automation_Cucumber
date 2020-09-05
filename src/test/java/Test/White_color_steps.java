package Test;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Page.White_colorPage;
import Util.Browser;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class White_color_steps {
	
	WebDriver driver;
	Browser browser;
	
	White_colorPage color_page;
	@Before
	public void run() throws Exception {
		driver=Browser.launch();
		color_page=PageFactory.initElements(driver, White_colorPage.class);
	}
	
	@Given("^I see Set White Background button exists$")
	public void i_see_Set_White_Background_button_exists() throws Throwable {
		
	    System.out.println("I see the page");
	}

	@When("^I click on the exist button$")
	public void i_click_on_the_exist_button() throws Throwable {
		driver=Browser.launch();
		color_page=PageFactory.initElements(driver, White_colorPage.class);
		color_page.white_colorpage_varification();
	}

	@Then("^the background color will change to white$")
	public void the_background_color_will_change_to_white() throws Throwable {
	   System.out.println("done");
	}


}
