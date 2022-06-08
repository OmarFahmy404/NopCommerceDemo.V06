@SmokingTest
Feature: Test search field

  Scenario: the logged user is able to search for any product by name
    When the logged user enter "Apple MacBook Pro 13-inch" and click on search button
    Then the logged user redirected to the searched product page

    Scenario: the logged user is able to search for any product by SKU
      When the logged user enter "COMP_CUST" and click on search button
      Then the logged user redirected to the searched product page SKU