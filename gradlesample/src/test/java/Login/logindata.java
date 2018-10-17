package Login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class logindata {
	public static WebDriver driver;
	
	static {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		options.addArguments("disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	// web page URL
	String URL = "https://staging.formcreator.full.io/";

	// verify login page
	String pagetitle = "//a[@class='brand']/span[1]";
	String pagetitledata = "Full Creative";
	String emailbox = "EMAIL"; // get placeholder attribute
	String passwordbox = "PASSWORD";
	String passwordshow = "text";
	String passwordhide = "password";
	String showorhide = "//div[@class='input-group']/span[1]";
	String ortextvisible = "//div[@class='divider']/span[1]";
	String ortextdata = "OR";
	String gmailicon = "//nav[@class='social-icons']/a[1]";
	String facebookicon = "//nav[@class='social-icons']/a[2]";
	String signintitle = "//div[@class='modal-header']/h1[1]";
	String signintitledata = "Sign In";

	// login page
	String email = "//form[@id='loginForm']/div[1]/input[1]";
	String emaildata = "pavithran.sunder@anywhere.co";
	String password = "//form[@id='loginForm']/div[1]/input[2]"; // get type attribute
	String passworddata = "pavithran";
	String signinbutton = "//button[@class='btn btn-blue login-btn']";
	String invalidpassword = "//div[@class='label-error']/p[1]";
	String invalidpassworddata = "Invalid Password...";
	String invalidemail = "//div[@class='label-error']";
	String invalidemaildata = "Please Enter valid email address";
	String fetch = "//div[@class='fetch btn_cst hint--left']";
}
