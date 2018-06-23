package test;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.TechfiosBankCashPage;
import page.TechfiosNewAcc;
import page.Techfiosloginpage;
import util.BrowserFactory;

public class TechfiosNewAccTest_BC {

	@Test
	public void NewAccTest() throws IOException {
		
		WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=admin/");
		
		Techfiosloginpage loginpage = PageFactory.initElements(driver, Techfiosloginpage.class);
		loginpage.login_Techfios();
		
		TechfiosBankCashPage TFBCPage = PageFactory.initElements(driver, TechfiosBankCashPage.class);	
		TFBCPage.clickToCreateAcc();
		
		TechfiosNewAcc Accpage = PageFactory.initElements(driver, TechfiosNewAcc.class);
		Accpage.typeNewAccInfo();
		
		driver.close();
		driver.quit();
	
	}}

