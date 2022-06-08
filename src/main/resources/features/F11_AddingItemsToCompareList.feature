Feature: Test the process of adding different items to compare list

#  Background:
#    Given the user open browser and navigate to the login page to compare items
#    And the user logged in to compare between two items

    Scenario: the logged user could be able to add different items to compare list
      When the logged user select two items to add them to compare list
      Then the two items added successfully to compare list page
#      And quiting