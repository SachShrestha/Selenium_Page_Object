package test;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.TechFiosProducts_Services;
import page.TechfiosNewProduct;
import page.Techfiosloginpage;
import util.BrowserFactory;

public class TechfiosNewProductTest {

	
	
	
	@Test
	public void NewProductTest() throws IOException {
		
		WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=admin/");
		
		Techfiosloginpage loginpage = PageFactory.initElements(driver, Techfiosloginpage.class);
		loginpage.login_Techfios();
		
		TechFiosProducts_Services Prod_ServPage = PageFactory.initElements(driver, TechFiosProducts_Services.class);	
		Prod_ServPage.clickForNewProd();
		
		TechfiosNewProduct NewProdpage = PageFactory.initElements(driver, TechfiosNewProduct.class);
		NewProdpage.typeNewProductinfo();
		
		driver.close();
		driver.quit();
	
}
	
}
