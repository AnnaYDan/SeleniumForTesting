Feature: this it test for login with correct credentials

Scenario: test one
Given I opened   newtours page
When I type a   as username and a as a password
And click sign-in    button
Then I should get   sign-off link
