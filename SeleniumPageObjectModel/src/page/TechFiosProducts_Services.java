package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TechFiosProducts_Services {

	WebDriver driver;

	public TechFiosProducts_Services(WebDriver ldriver) {
		this.driver=ldriver;
		}
	
	@FindBy (how=How.XPATH,using="//span[text()='Products & Services']")
	WebElement ProductsPage;
	
	@FindBy (how=How.XPATH,using="//*[@id=\"side-menu\"]/li[6]/ul/li[2]/a")
	WebElement NewProduct;
	
	
	


public void clickForNewProd() {
	
	ProductsPage.click();
	NewProduct.click();

}

}