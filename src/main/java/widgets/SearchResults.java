package widgets;

import java.util.List;

import javax.management.loading.PrivateClassLoader;
import javax.swing.border.TitledBorder;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.bytebuddy.asm.Advice.Return;
import net.bytebuddy.description.type.TypeDescription.ArrayProjection;
import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class SearchResults {
	
	private WebDriver webDriver;
	
	private By originalPrice = By.cssSelector("span.price del span.woocommerce-Price-amount");
	private By currentPrice = By.cssSelector("span.price ins span.woocommerce-Price-amount");
	private By productTitle = By.cssSelector("h2.woocommerce-loop-product__title");
	private By grid = By.cssSelector("ul.products"); // or whatever the parent container is
	private By products = By.cssSelector("li.product");
	
	public SearchResults(WebDriver webDriver) {
		this.webDriver = webDriver;
	}
	
	public boolean isProductListed(String productName) {
		return findProduct(productName) !=null;
	}
	//i changed the below to public string in place of public object b/c using String
	//is more precise and helps the compiler catch mistakes
	public String getOriginalPrice(String productName) {
		try {
			WebElement product = findProduct(productName);
			return product.findElement(originalPrice).getText();
		} catch (StaleElementReferenceException e) {
			//refresh everything
			List<WebElement> refreshedProducts = getListedProducts();
			for (WebElement product: refreshedProducts) {
				String title = product.findElement(productTitle).getText().toLowerCase().trim();
				if (title.contains(productName.toLowerCase().trim())) {
					return product.findElement(originalPrice).getText();
				}
				
			}
			throw new RuntimeException("Product not found after retry: " + productName);
		}
		//WebElement product = findProduct(productName);
		//return findProduct(productName).findElement(originalPrice).getText();
	}
	
	public String getCurrentPrice(String productName) {
		try {
			WebElement product = findProduct(productName);
			return product.findElement(currentPrice).getText();
		} catch (StaleElementReferenceException e) {
			//refresh everything
			List<WebElement> refreshedProducts = getListedProducts();
			for (WebElement product: refreshedProducts) {
				String title = product.findElement(productTitle).getText().toLowerCase().trim();
				if (title.contains(productName.toLowerCase().trim())) {
					return product.findElement(currentPrice).getText();
				}
				
			}
			throw new RuntimeException("Product not found after retry: " + productName);
		}
		//WebElement product = findProduct(productName);
		//return findProduct(productName).findElement(originalPrice).getText();
	}
	
	
	public int getNumberOfListedProducts() {
		//changed public Object to public int b/c .size() returns an int, not an 
		//Object. Declaring it as Object is too vague and unnecessary.
		return getListedProducts().size();
	}
	
	private WebElement findProduct(String productName) {
		List<WebElement> products = getListedProducts();
		for (WebElement product : products) {
			String title = product.findElement(productTitle).getText().toLowerCase().trim();
			if (title.contains(productName.toLowerCase().trim())) {
			return product;
		}
	}
	
	return null;
}
	
	private List<WebElement> getListedProducts(){
		WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
		WebElement productsGrid = wait.until(
				ExpectedConditions.visibilityOfElementLocated(grid)
				);
		return productsGrid.findElements(products);
	}

}
