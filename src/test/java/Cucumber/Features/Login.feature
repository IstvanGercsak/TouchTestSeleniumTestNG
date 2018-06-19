Feature: LoginFeature
  This feature deals with the login functionality of the application

  Scenario Outline: Login with correct username and password with different rights
    Given I navigate to the login page
    And I log into the Touch with <username> and <password>
    And I click on the login button
    Then I arrive on the central page

    Examples:
      | username                   | password    | rights         |
      | istvan.gercsak@metlife.com | Igercsak8!# | admin          |
      | istvan.gercsak@metlife.com | Igercsak8!# | UKJurisdiction |
      | istvan.gercsak@gmail.com   | Igercsak8!# | mixed rights   |

  Scenario Outline: Login with wrong username and password
    Given I navigate to the login page
    And I log into the Touch with <username> and <password>
    And I click on the login button
    Then I redirected to the invalid login page

    Examples:
      | username                   | password    | wrong_data |
      |                            |             | both       |
      | istvan.gercsak@metlife.com | Igercsak8!  | username   |
      | istvan.gercsak@metlife.co  | Igercsak8!# | password   |
