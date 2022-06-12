@resetPass
Feature: Test the reset password process
#  Background:
#    Given the user open and navigate to the login page

    Scenario: the user could be able to reset his password
      When the user reset his password through reset password link
      And he enter his valid email
      Then the password reset successfully
#      And Quit