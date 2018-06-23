package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TechfiosBankCashPage {

	WebDriver driver;

public TechfiosBankCashPage(WebDriver ldriver) {
	this.driver=ldriver;
	}

@FindBy (how=How.XPATH,using="//span[text()='Bank & Cash']")
WebElement Bank_Cash;

@FindBy (how=How.XPATH,using="//a[text()='New Account']")
WebElement New_Account;


public void clickToCreateAcc() {
	
	Bank_Cash.click();
	New_Account.click();
}



}



