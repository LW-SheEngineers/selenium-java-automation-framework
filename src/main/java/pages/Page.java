package pages;
//this is a base class that other pages will inherit from
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.DriverManager;
import widgets.SearchResults;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Page {
	
	protected WebDriver webDriver; //= DriverManager.getWebDriver();
	
	public Page (WebDriver webDriver) {
		this.webDriver = webDriver;
	}
	
	public SearchResults search (String productName) {
		WebElement searchBox = webDriver.findElement(By.name("s")); 
		searchBox.clear();
		searchBox.sendKeys(productName);
		searchBox.sendKeys(Keys.ENTER);
		searchBox.submit();
		return new SearchResults(webDriver);
	}
	
	//below are the items on the site that are common throughout the page so I added them here
	//to the page class so that every class will inherit from so i don't have to duplicate it everywhere
	By account 		=By.id("account");
	By cart 		=By.id("header_cart");
	String menuItem_Format = ".//li[contains(@class, 'menu-item') and text() = '%s'";
	By searchField 	=By.name("s");
	
	public CartPage clickCart() {
		webDriver.findElement(cart).click();
		return new CartPage();
	}
	
	public AccountPage clickMyAccount() {
		webDriver.findElement(account).click();
		return new AccountPage(webDriver);
	}
	
	public Page clickMenuItem (String menuItem) {
		findMenuItem(menuItem).click();
		return new Page(webDriver);
	}
	
	public Page clickMenuItemPage (String menuItem, String submenuItem) {
		Actions actions = new Actions(webDriver);
		actions.moveToElement (findMenuItem (menuItem)).perform();
		return clickMenuItem (submenuItem);
	}
	
	//this will return search results
	/**public SearchResults searchResults (String text) {
		WebElement field = webDriver.findElement(searchField);
		field.sendKeys(text);
		field.sendKeys(Keys.ENTER);
		return new SearchResults(webDriver);
	}
	**/
	//since this returns a web element I made it private so that none of the test can access it
	private WebElement findMenuItem (String menuItem) {
		String xpath = String.format(menuItem_Format, menuItem);
		return webDriver.findElement (By.xpath (xpath));
	}

}
