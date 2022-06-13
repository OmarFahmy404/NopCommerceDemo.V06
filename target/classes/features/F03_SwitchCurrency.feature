@regression
Feature: Test The Currency Feature

  Scenario: the user could be able to switching between Euro and Dollar
   When the user choose a Euro currency
    And switch it to Dollar currency
    Then the currency switched from Euro to Dollar