Feature: find flight page

Scenario: choose one way ticket with default parameters
Given a user navigated to home page
And type and login with correct login and password
When a user select one way ticket with default paramenters
Then a user should get such kind of results

Scenario: choose one way ticket with provide parameters
Given a user navigated to home page
And type and login with correct login and password
When a user select one way ticket with provide paramenters
Then a user should get such kind of results