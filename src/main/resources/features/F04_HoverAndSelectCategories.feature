Feature: Test the hovering and selection different categories process

  Scenario: the logged user could be able to hover and select different categories
    When the user hover on the category
    And select the first category
    Then the last category is a final category
