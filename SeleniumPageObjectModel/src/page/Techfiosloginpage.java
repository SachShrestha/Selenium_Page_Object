package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Techfiosloginpage {

WebDriver driver;

public Techfiosloginpage(WebDriver ldriver){
	
	this.driver=ldriver;
}
// username=Id= user_login
@FindBy(how=How.ID,using="username")
WebElement username;

@FindBy(how=How.ID,using="password")
WebElement password;

@FindBy(how=How.NAME, using="login")
WebElement login_button;




public void login_Techfios(){
	
	username.sendKeys("techfiosdemo@gmail.com");
	password.sendKeys("abc123");
	login_button.click();


}
}