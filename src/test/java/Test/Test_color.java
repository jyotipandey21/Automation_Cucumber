package Test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Page.ColorPage;
import Util.Browser;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Test_color {
	
	WebDriver driver;
	ColorPage color;
	
	@Before
	public void test_before() throws InterruptedException {
		driver=Browser.launch();
		color=PageFactory.initElements(driver,ColorPage.class);
		
	}
	
	@Given("^I see Set SkyBlue Background button exists$")
	public void i_see_Set_SkyBlue_Background_button_exists() throws Throwable {
		
	}

	@When("^I click on the button$")
	public void i_click_on_the_button() throws Throwable {
		color=PageFactory.initElements(driver,ColorPage.class);
		color.colorpage_varification();
		color.white_colorpage_varification();
	}
	
	

	@Then("^the background color will change to sky blue$")
	public void the_background_color_will_change_to_sky_blue() throws Throwable {
	   System.out.println("successful to test the color page");
	 

	}


}
