package utils;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import utils.DriverManager;
import org.junit.Before;
import pages.Page;
//import org.openqa.selenium.devtools.v135.page.Page;
import org.openqa.selenium.firefox.FirefoxDriver;

//from all of my other test I am going to inherit from this base test class
public class BaseTests {
	
	//this class just serves as a base
	//in this class I am going to make a web driver variable
	protected static WebDriver webDriver;
	
	//created a page class so i came back and added this handle and making it protected so my
	//test class can have access to it
	protected static Page homePage;
	
	//public BaseTests() {
		//this.webDriver = webDriver;
	//}
	
	@Before
	public void setUp() {
		
	}
	
	//make a method that will launch the browser. I am also going to use Junit annotations
	//before and after so that every test doesn't have to launch and close the browser
	@BeforeClass
	public static void launchApplication() {
		//set up driver
		System.setProperty ("webdriver.firefox.driver", "resources/geckodriver.exe");
		
		//homePage = new Page();
		setFirefoxDriverProperty();
			
			//instantiate the web driver
			webDriver = new FirefoxDriver();
			
			//store the driver in the DriverManager so Page classes can use it
			DriverManager.setWebDriver(webDriver);
			
			//launch the browser with the command get
			//changed this from https://www.store.demoqa.com to my links class 
			webDriver.get (Links.HOME);
			
			//adding this so I can use the home page in my test
			homePage = new Page(webDriver);
	
	}
	
	@AfterClass
	public static void closeBrowser() {
		if (webDriver != null) {
		webDriver.quit();	
		}
	}
	
	public static WebDriver getWebDriver() {
		return webDriver;
	}
	
	private static void setFirefoxDriverProperty() {
		//System.setProperty ("webdriver.firefox.driver", "resources/geckodriver.exe");
	}
	
	

}
