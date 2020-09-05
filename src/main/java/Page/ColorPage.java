package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ColorPage {
	//Scenario 1: Sky Blue Background; Given: "Set SkyBlue Background" button exists; When: I click on the button; Then: the background color will change to sky blue

	WebDriver driver;
	
	public ColorPage(WebDriver driver) {
		this.driver=driver;
	}
	@FindBy(how =How.CSS,using="button[onclick='myFunctionSky()']")
	WebElement SKY_BLUE_BACKGROUND_LOCATOR;
	
	@FindBy(how = How.CSS,using="button[onclick='myFunctionWhite()']")
	WebElement Set_White_Background_Locator;
	
	public void colorpage_varification() {
		SKY_BLUE_BACKGROUND_LOCATOR.click();
	}
	public void white_colorpage_varification() throws InterruptedException {
		Thread.sleep(2000);
		Set_White_Background_Locator.click();
	}
}
	
	

