package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class White_colorPage {
//2==Scenario 2: White Background Change; Given: "Set SkyWhite Background" button exists; When: I click on the button; Then: the background color will change to white

WebDriver driver;
	
	public White_colorPage(WebDriver driver) {
		this.driver=driver;
	}

	
	@FindBy(how = How.CSS,using="button[onclick='myFunctionWhite()']")
	WebElement Set_White_Background_Locator;
	
	
	public void white_colorpage_varification() throws InterruptedException {
	Set_White_Background_Locator.click();
	}
}

