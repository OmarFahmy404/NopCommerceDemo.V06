Feature: Test filter process using color

  Background:
    Given user open and navigate to login page
    And user logged in

    Scenario: the logged user could be able to filter with color
      When the user select a color and unselect it
      And the user select a new color
      Then the filter work as expected
      And close