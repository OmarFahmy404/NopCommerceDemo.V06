@regression
Feature: Test follow us links

  Scenario: the guest could be able to redirected to the facebook page
    When the guest click on the facebook link
    Then the guest redirected to the facebook page

  Scenario: the guest could be able to redirected to the twitter page
    When the guest click on the twitter link
    Then  the guest redirected to the twitter page

  Scenario: the guest could be able to redirected to the news page
    When the guest click on the news link
    Then  the guest redirected to the news page

  Scenario: the guest could be able to redirected to the youtube page
    When the guest click on the youtube link
    Then  the guest redirected to the youtube page