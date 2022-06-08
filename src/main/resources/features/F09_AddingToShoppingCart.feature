Feature: Test the process of adding an item to shopping cart

  Background:
    Given the user open browser and navigate to the login page to add an item
    And the user logging in to add an item

    Scenario: the logged user could be able to add items to his shopping cart
      When the logged user select an item to add it to shopping cart
      Then the item added successfully to shopping cart
      And close the browser after adding the item