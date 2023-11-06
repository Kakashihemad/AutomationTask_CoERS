package org.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.Utilities;

public class ProductPage extends Utilities {

	public ProductPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "twotabsearchtextbox")
	private WebElement searchBox;
	
	@FindBy(id = "productTitle")
	private WebElement productTitle;

	@FindBy(id = "nav-search-submit-button")
	private WebElement searchButton;

	@FindBy(xpath = "//span[@class='a-size-base-plus a-color-base a-text-normal']")
	private List<WebElement> allproducts;

	@FindBy(xpath = "//th[text()=' ASIN ']//following-sibling::td")
	private WebElement asinValue;

	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public List<WebElement> getAllproducts() {
		return allproducts;
	}

	public WebElement getAsinValue() {
		return asinValue;
	}
	
	public WebElement getProductTitle() {
		return productTitle;
	}

	// ------------------------------//
	public void searchProduct(String input) {
		enterValue(getSearchBox(), input);
		click(getSearchButton());

	}

	static String firstname;
public void gettAllproducts() {
	System.out.println("-------Search Results-------");
	List<WebElement> list = getAllproducts();
	for (WebElement x : list) {
		System.out.println(x.getText());
	}

}
	public void selectFristProduct() {
		List<WebElement> all = getAllproducts();
		WebElement first = all.get(0);
		firstname = first.getText();
		click(first);
	}
	
	public boolean verifyTheProductName() {
		String productname = getProductTitle().getText();
		System.out.println(productname);
		System.out.println(firstname);
		return productname.equals(firstname);
		

	}

	public boolean verifytheTitleogPage() {
		boolean result=false;
		String title = getTitle();
		System.out.println(title);
		System.out.println(firstname);
		if(title.contains(firstname)) {
			result= true;
		}
		return result;

	}
	
	public boolean verifytheASINNumber(String expected) {
		String actual = getAsinValue().getText();
		System.out.println("The ASIN value..."+actual);
		return expected.equals(actual);

	}
}
