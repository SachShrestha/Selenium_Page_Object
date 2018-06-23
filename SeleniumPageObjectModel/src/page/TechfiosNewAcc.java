package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TechfiosNewAcc {
	
	WebDriver driver;

	public TechfiosNewAcc(WebDriver ldriver) throws InterruptedException {
		this.driver=ldriver;
		Thread.sleep(3000);
	}
	
	
	@FindBy (how=How.ID,using="//span[text()='Bank & Cash']")
	WebElement Bank_Cash;

	@FindBy (how=How.XPATH,using="//a[text()='New Account']")
	WebElement New_Account;
	
	@FindBy (how=How.XPATH,using="//input[@type='text'][@name='account']")
	WebElement AccountTitle;

	@FindBy (how=How.XPATH,using="//input[@type='text'][@name='description']")
	WebElement Description;

	@FindBy (how=How.XPATH,using="//input[@type='text'][@name='balance']")
	WebElement InitialBalance;

	@FindBy (how=How.XPATH,using="//text()[contains(.,'Submit')]/ancestor::button[1]")
	WebElement SubmitButton;
	
	public void typeNewAccInfo(){
		
		AccountTitle.sendKeys("James");
		Description.sendKeys("Savings");
		InitialBalance.sendKeys("200,000");
		SubmitButton.click();
}
	}



