Feature: Test cases for Login Page 

  Scenario: Login with correct credentials
    Given a user navigate to travel portal home page with url "http://newtours.demoaut.com/"
    When a user type username = "a" and password = "a"
    And a user click Sign-In button
    Then a user should get "SIGN-OFF" link
    And and see as a page title "Find a Flight"
