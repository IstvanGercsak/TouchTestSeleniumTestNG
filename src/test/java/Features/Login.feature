Feature: LoginFeature
  This feature deals with the login functionality of the application

#  Scenario: Login with correct username and password
#    Given I navigate to the login page
#    And I enter the following for login
#      | admin | adminpassword |
#      | user  | userpassword  |
#    And I click on the login button
#    Then I see the Touch central page

  Scenario: Login with correct username and password
    Given I navigate to the login page
    And I enter the "user" as admin and "password" as admin
    And I click on the login button
    Then I see the Touch central page

  Scenario Outline: Login with correct username and password using Scenario outline
    Given I navigate to the login page
    And I enter <username> and <password>
    And I click on the login button
    Then I see the Touch central page

    Examples:
      | username | password     |
      | user     | userpassword |
      | admin    | admin        |
      | asd      | dsa          |