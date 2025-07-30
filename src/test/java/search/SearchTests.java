package search;

import utils.BaseTests;
import org.junit.Assert;
import org.junit.Test;
import pages.Page;
import org.openqa.selenium.WebDriver;

import widgets.SearchResults;

//extends will inherit everything from basetests
public class SearchTests extends BaseTests{
	
	public SearchTests() {
		super();
	}

	//protected Page homePage;
	
	@Test
	public void testSearchForDiscountedProduct() {
		
		String productName = "beanie";
		
		SearchResults searchResults = homePage.search(productName);
		
		Assert.assertTrue (productName + "is in search results", searchResults.isProductListed(productName));
		Assert.assertEquals(productName + " original price", "$20.00", searchResults.getOriginalPrice(productName));
		Assert.assertEquals(productName + "current price", "$18.00", searchResults.getCurrentPrice(productName));
		Assert.assertEquals("Number of search results", 2, searchResults.getNumberOfListedProducts());
		
	}

}
