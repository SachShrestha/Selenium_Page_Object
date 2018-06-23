package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TechfiosHomePage {
WebDriver driver;

	public TechfiosHomePage(WebDriver ldriver) {
		
		this.driver=ldriver;
		}
	
	@FindBy(how=How.XPATH, using="//text()[contains(.,'CRM')]/ancestor::a[1]")
	WebElement CRM;
	
	@FindBy(how=How.XPATH, using="//text()='Add Contact']")
	WebElement AddContact;
	
	@FindBy(how=How.XPATH, using="//span[text()='Welcome TechFios Tester']")
	WebElement Greetings;
    
	@FindBy(how=How.XPATH, using="//*[@id=\"sort_3\"]/div/div/div[2]")
	WebElement IncomeGraph;
	
	@FindBy(how=How.ID, using="dchart")
	WebElement IncomeChart;
	
	@FindBy(how=How.XPATH, using="//span[contains(text(),'Income Today')]")
	WebElement IncomeToday;
	
	@FindBy(how=How.XPATH, using="//span[contains(text(),'Expense Today')]")
	WebElement ExpenseToday;
	
	@FindBy(how=How.XPATH, using="//span[contains(text(),'Income This Month')]")
	WebElement IncomeThisMonth;
	
	@FindBy(how=How.XPATH, using="//span[contains(text(),'Expense This Month')]")
	WebElement ExpenseThisMonth;

	@FindBy(how=How.XPATH, using="//input[@type='text'][@placeholder='Search Customers...']")
	WebElement SearchBox;
	
	@FindBy(how=How.XPATH, using="//text()[contains(.,'Welcome TechFios Tester')]/ancestor::a[1]")
	WebElement ProfileName;

	@FindBy(how=How.XPATH, using="//h5[text()='Net Worth & Account Balances']")
	WebElement NetWorth;
	
	@FindBy(how=How.XPATH, using="//h5[text()='Latest Income']")
	WebElement LatestIncome;
	
	@FindBy(how=How.XPATH, using="//h5[text()='Latest Expense']")
	WebElement LatestExpense;
	
	
	

	
public void clicktoProceed() {
		
		CRM.click();
		AddContact.click();    }
	
public void ValidateUser() {
	
	if (Greetings.isDisplayed())
	{
		System.out.println("User logged in and home page opens");
	}
}
	
public void ValidateIncome() {
	
	if (IncomeGraph.isDisplayed())
	{
		System.out.println("Income and Expense graph is shown");
	}	
	
}

public void ValidateIncomeChart() {
	
	if (IncomeChart.isDisplayed())
	{
		System.out.println("Income and Expense chart is shown");
	}	

}

public void ValidateIncomeandExpenseBox() {
	
	IncomeGraph.isDisplayed();
	IncomeChart.isDisplayed();
	IncomeToday.isDisplayed();
	ExpenseToday.isDisplayed();
	IncomeThisMonth.isDisplayed();
	ExpenseThisMonth.isDisplayed();
	
	System.out.println("Income and Expense boxes is displayed");
}

public void ValidateSearchBox() {
	
	SearchBox.isDisplayed();
	System.out.println("Search Box is displayed");
}

public void ValidateUserProfile() {
	
	ProfileName.isDisplayed();
	System.out.println("User Profile displays");
}

public void ValidateNetWorth() {
	NetWorth.isDisplayed();
	System.out.println("Net Worth Table displays content");
}

public void ValidateLastestIncome() {
	LatestIncome.isDisplayed();
	System.out.println("Latest Income Table displays content");	
}

public void ValidateLastestExpense() {
	LatestExpense.isDisplayed();
	System.out.println("Latest Expense Table displays content");
}
	}

