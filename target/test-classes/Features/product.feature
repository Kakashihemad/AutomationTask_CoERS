Feature: Validate the product results as per ASIN values

  Scenario: Validate the Product result as per the ASIN value
    Given User in "https://www.amazon.in/ref=nav_logo" homepage and search "ASIN B0BTYWFXKC" in search box
    When check the search results for given input in search box
    And user can select first product from the showed results
    And validate the title of the page after landing the product page
    And validate the product page was same what user selected in result page
    And validate the given ASIN "B0BTYWFXKC" value is presented in the product page and verify the search asin and showed result value is same
