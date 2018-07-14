package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WWLocationResults {


	WebDriver driver;

	public WWLocationResults(WebDriver ldriver) {
		
		this.driver=ldriver;
}		
	
	@FindBy(how=How.CLASS_NAME, using="hours-list--currentday")
	WebElement HoursOperation;
	


public void verifyhours() {
	
	if (HoursOperation.isDisplayed())
	{
		System.out.println(HoursOperation.getText());
	}

}}  