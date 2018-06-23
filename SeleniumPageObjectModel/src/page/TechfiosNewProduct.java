package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TechfiosNewProduct {

	
	WebDriver driver;

	public TechfiosNewProduct(WebDriver ldriver) {
		this.driver=ldriver;
		}
	
	@FindBy (how=How.ID,using="name")
	WebElement Name;
	
	@FindBy (how=How.ID,using="sales_price")
	WebElement ProductPrice;
	
	@FindBy (how=How.ID,using="item_number")
	WebElement ItemNumber;
	
	@FindBy (how=How.ID,using="description")
	WebElement Description;
	
	@FindBy (how=How.ID,using="submit")
	WebElement Submitbutton;
	
	public void typeNewProductinfo()
	{
		Name.sendKeys("William");
		ProductPrice.sendKeys("80,000");
		ItemNumber.sendKeys("123");
		Description.sendKeys("Car");
		Submitbutton.click();
	}
	
	
}
