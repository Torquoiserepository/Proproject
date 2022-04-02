package createaccount;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateaccountPOM {
	
WebDriver driver;
@FindBy(id="ap_customer_name")WebElement cxname;
@FindBy(id="ap_email")WebElement cxemail;
@FindBy(id="ap_password")WebElement cxpass;
@FindBy(id="ap_password_check")WebElement cxpassagain;
@FindBy(id="a-button-input")WebElement continuee;


public CreateaccountPOM(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
}
