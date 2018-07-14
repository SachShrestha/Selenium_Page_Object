package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.TechfiosHomePage;
import page.Techfiosloginpage;
import util.BrowserFactory;

public class TFGraphTest {

	
	@Test
	public void GraphTest() {
			
	WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=admin/");
					
			
	Techfiosloginpage loginPage = PageFactory.initElements(driver, Techfiosloginpage.class);			
	
	loginPage.login_Techfios();
	
	TechfiosHomePage DashboardPage = PageFactory.initElements(driver, TechfiosHomePage.class);
	
	DashboardPage.ValidateUser();
	
	
	
	
	
	
	
	
	
	
	
	
}}
