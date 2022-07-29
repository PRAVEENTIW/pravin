package TESTINGzerodha;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import zerodha.login;
import zerodha.login2;
import zerodha.Home;

public class Test2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\web broser\\chromedriver.exe");
	ChromeOptions opt = new ChromeOptions();
	opt.addArguments("--disable-notifications");
	WebDriver driver = new ChromeDriver();   //upcasting
	
	driver.get("https://kite.zerodha.com/");
	driver.manage().window().maximize();
	
	login log = new login(driver);
	log.enterUN();
	log.enterPWD();
	log.ClickButton();
	
	Thread.sleep(2000);
	login2 log2 = new login2(driver);
	log2.enterPIN();
	log2.Continue();
	
	Thread.sleep(2000);
	Home hom = new Home(driver);
	hom.PN();
	Thread.sleep(2000);
	//driver.close();
}
}
