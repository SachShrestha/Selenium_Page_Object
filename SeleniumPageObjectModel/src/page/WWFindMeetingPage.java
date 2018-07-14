package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WWFindMeetingPage {

	WebDriver driver;

	public WWFindMeetingPage(WebDriver ldriver) {

		this.driver = ldriver;
	}

	@FindBy(how = How.TAG_NAME, using = "title")
	WebElement findMeeting2;

	@FindBy(how = How.ID, using = "meetingSearch")
	WebElement meetingSearch;

	@FindBy(how = How.CLASS_NAME, using = "input-group-btn")
	WebElement searchButton;

	@FindBy(how = How.CLASS_NAME, using = "location__distance")
	WebElement locationDistance;

	@FindBy(how=How.CLASS_NAME, using="location__name")
	WebElement firstResultTitle;

	@FindBy(how = How.ID, using = "ml-1180510")
	WebElement firstLocation;

	public void validateTitleMatch(String expectedTitle) {

		if (driver.getTitle().contains(expectedTitle)) {
			System.out.println("Title matches with the verification text");
		}
		else
		{
			System.out.println("Title doesn't match with the verification text");
		}
	}
	
	public void searchBar() {

		meetingSearch.sendKeys("10011");
		searchButton.click();
}

	public void firstLocation() {

		firstLocation.click();
	}
	
	public String printFirstResultTitle() {
		String title = firstResultTitle.getText();
		System.out.println(title);
		
		return title;
	}
	public void printFirstResultDistance() {
		System.out.println(locationDistance.getText());
	}
	
	public void verifyResultDetail(String firstResultTitle) {
		if (this.firstResultTitle.getText().equals(firstResultTitle)) {
			System.out.println("First result title matches on the search result and detail popup screen.");
		}
	}

}
