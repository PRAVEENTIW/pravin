package zerodha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
	
//step1 - declare variable globaly (Data member)	
	
	@FindBy(xpath="//input[@id='userid']")private WebElement Username;
	@FindBy(xpath="//input[@id='password']")private WebElement Pssword;
	@FindBy(xpath="//button[@type='submit']")private WebElement Loginbutton;
	
	//step2 - Initialization global data member
	public login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//step3 - Method creation
	public void enterUN() {
		Username.sendKeys("OKP335");
	}
	public void enterPWD() {
		Pssword.sendKeys("WSX12345");
	}
	public void ClickButton() {
		Loginbutton.click();
	}
}
