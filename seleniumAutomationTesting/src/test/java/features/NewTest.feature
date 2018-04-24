Feature: Test cases for Login Page 

  Scenario: Login with correct credentials
    Given A user navigate to travel portal home page with url "http://newtours.demoaut.com/"
    When A user type username = "a" and password = "a"
    And A user click Sign-In button
    Then A user should get "SIGN-OFF" link
    And A user as a page title "Find a Flight"
