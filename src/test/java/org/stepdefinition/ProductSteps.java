package org.stepdefinition;

import org.pageobjects.ProductPage;
import org.utility.Utilities;

import io.cucumber.java.en.*;
import org.junit.*;

public class ProductSteps extends Utilities{
	ProductPage page;

	@Given("User in {string} homepage and search {string} in search box")
	public void user_in_homepage_and_search_in_search_box(String url, String serach) {
		openUrl(url);
		page=new ProductPage();
		page.searchProduct(serach);
	}

	@When("check the search results for given input in search box")
	public void check_the_search_results_for_given_input_in_search_box() {
		page.getAllproducts();
	}

	@When("user can select first product from the showed results")
	public void user_can_select_first_product_from_the_showed_results() {
		page.selectFristProduct();
		windowHandles(1);
	}

	@When("check total results showed for given search results")
	public void check_total_results_showed_for_given_search_results() {
	}

	@When("check if the user select first product it will navigate to the coressponding product landing page")
	public void check_if_the_user_select_first_product_it_will_navigate_to_the_coressponding_product_landing_page() {
		
	}

	@When("validate the title of the page after landing the product page")
	public void validate_the_title_of_the_page_after_landing_the_product_page() {
		Assert.assertTrue("verify the product title",page.verifytheTitleogPage());;
	}

	@When("validate the product page was same what user selected in result page")
	public void validate_the_product_page_was_same_what_user_selected_in_result_page() {
		
		Assert.assertTrue("verify the product Name",page.verifyTheProductName());;
	}

	@When("validate the given ASIN {string} value is presented in the product page and verify the search asin and showed result value is same")
	public void validate_the_given_asin_value_is_presented_in_the_product_page_and_verify_the_search_asin_and_showed_result_value_is_same(
			String asin) {
		
		Assert.assertTrue("verify the product ASIN Value",page.verifytheASINNumber(asin));;
		
	}

}
