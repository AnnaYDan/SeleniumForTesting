Feature: Test cases for Travel Portal login page with different credentials by Anna D.

  Scenario Outline: Test login page with different credentials
    Given I am on at newtours homepage "http://newtours.demoaut.com/"
    When I insert username = "<name>" and password ="<pass>"
    And click login button
    Then "<link>" link should be displayed
    And page title should be "<title>" 

    Examples: 
      | name  | pass  | link     | title |
      | a     | a     | SIGN-OFF | |
      | a     | wrong | SIGN-ON  ||
      | a     |       | SIGN-ON  ||
      |       | a     | SIGN-ON  ||
      |       |       | SIGN-ON  ||
      |       | wrong | SIGN-ON  ||
      | wrong | wrong | SIGN-ON  ||
      | wrong | a     | SIGN-ON  ||
      | wrong |       | SIGN-ON  ||
