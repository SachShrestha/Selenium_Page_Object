package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WWHomepage {

	WebDriver driver;

	public WWHomepage(WebDriver ldriver) {
		this.driver = ldriver;
	}

	@FindBy(how = How.ID, using = "ela-menu-visitor-desktop-supplementa_find-a-meeting")
	public WebElement FindMeeting;

	public void validateTitleMatch(String expectedTitle) {
		
		if (driver.getTitle().equals(expectedTitle)) {
			System.out.println("Title matches with the verification text");
		}
		else
		{
			System.out.println("Title doesn't match with the verification text");
		}
		
	}

	public void clickonMeeting() {
		FindMeeting.click();
	}

}
