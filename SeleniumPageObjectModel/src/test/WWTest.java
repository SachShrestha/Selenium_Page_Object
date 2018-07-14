package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import page.WWFindMeetingPage;
import page.WWHomepage;
import page.WWLocationResults;
import util.BrowserFactory;

public class WWTest {
	
	@Test
	public void loginTest() throws InterruptedException {
			
	WebDriver driver = BrowserFactory.startBrowser("chrome", "https://www.weightwatchers.com/us/");
	driver.manage().window().maximize();
	
	
	WWHomepage Homepage = PageFactory.initElements(driver, WWHomepage.class);
	
	String expectedTitle = "Weight Loss Program, Recipes & Help | Weight Watchers";
	Homepage.validateTitleMatch(expectedTitle);
	
	
	Homepage.clickonMeeting();			

	WWFindMeetingPage Meetingpage = PageFactory.initElements(driver, WWFindMeetingPage.class);
	String expectedTitle_FindMeeting = "Get Schedules & Times Near You";
	Meetingpage.validateTitleMatch(expectedTitle_FindMeeting);
				
	Meetingpage.searchBar();
	
	String firstResultTitle = Meetingpage.printFirstResultTitle();
	Meetingpage.printFirstResultDistance();
	
	Meetingpage.firstLocation();
	Meetingpage.verifyResultDetail(firstResultTitle);	
	
	WWLocationResults Locationpage = PageFactory.initElements(driver, WWLocationResults.class);
	Locationpage.verifyhours();
	
	
	
	
	
	driver.close();
	driver.quit();
	

	
	
}
	}
