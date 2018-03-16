Feature: Testing registration page with different values for password and confirm password
  As a rule our customers should register only if they create
  password and confirm password according the requirements
  it should be more than six characters, at least ont uppercase letter
  at least one number number, at least one special character and no space
  So that we could be sure enough about secure passwords

  Background: 
    Given user open registraion page "http://newtours.demoaut.com/mercuryregister.php"
    And type correct data to registration form
      # transfering data using data table
      | firstName | lastName   | phone      | email               | address    | city    | state | postalCode | userName   |
      | Myname    | Mylastname | 9292128506 | email@somewhere.com | Street Ave | Herndon | VA    |      20171 | autoscript |

  Scenario Outline: Check registraion with different values for password and confirm password
    When user type password "<password>" and confirm password  "<confirm>"
    And user click submit button
    Then user should see this "<url>"

    # transfering data using examples keywords
    Examples: 
      | password  | confirm   | url                        |
      | userTy$e1 | userTy$e1 | create_account_success.php |
      | user      | userTy$e1 | create_account_success.php |
      | userTy$e1 | user      | create_account_success.php |
