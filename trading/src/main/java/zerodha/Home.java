package zerodha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
@FindBy(xpath="//span[text()='OKP335']")private WebElement ProfileName;

public Home(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void PN() {
	ProfileName.click();
}
}
