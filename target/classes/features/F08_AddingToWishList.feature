@regression
Feature: Test the process of adding items to wishlist

#  Background:
#    Given the user open browser and navigate to the login page
#    And the user logging in


    Scenario: the logged user could be able to add any item to wishlist
      When the logged user select an item to add it to wishlist for the first time

      Then the item added successfully to wishlist
#      And close the browser