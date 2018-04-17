Feature: Test cases for Login Page 

  Scenario: Login with correct credentials
    Given I opened home page
    When I type username = a and password = a
    And click Sign-In button
    Then I should get SIGN-OFF link
    And page title should have Find flight
