package test;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.WordPressHomepage;
import page.WordPressLoginPage;
import util.BrowserFactory;

public class PostTest {

	@Test
	public void loginTest() throws IOException{
			
	WebDriver driver = BrowserFactory.startBrowser("chrome", "http://demosite.center/wordpress/wp-login.php?loggedout=true");
					
			
	WordPressLoginPage loginPage = PageFactory.initElements(driver, WordPressLoginPage.class);
			
				
	loginPage.login_demo();
	
	WordPressHomepage home = PageFactory.initElements(driver, WordPressHomepage.class);

	home.publish();
	
	home.validatehomepage();	
	
	
	driver.close();

	driver.quit();






	}

}
