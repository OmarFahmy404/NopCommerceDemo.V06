@regression
Feature: Test the slider wrapper

  Scenario: the guest could be able to click on the first slider wrapper
    When the guest click on the first wrapper slider
    Then the guest redirected to new page after click on the 1st one

  Scenario: the guest could be able to click on the second slider wrapper
    When the guest click on the second wrapper slider
    Then the guest redirected to new page after click on the 2nd one