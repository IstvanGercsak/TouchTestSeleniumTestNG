Feature: Login Page Feature


  Scenario Outline: Login with correct username and password with different rights
    Given I navigate to the login page
    And I log into the Touch with <username> username and <password> password
    And I click on the login button
    Then I arrive on the central page

    Examples:
      | username                   | password    | rights                   |
      | TestAdmin@TestAdmin.com    | Igercsak8!# | Central Admin            |
      | istvan.gercsak@gmail.com   | Igercsak8!# | UK Jurisdiction Operator |
      | istvan.gercsak@metlife.com | Igercsak8!# | mixed rights             |

  Scenario Outline: Login with wrong username and password
    Given I navigate to the login page
    And I log into the Touch with <username> username and <password> password
    And I click on the login button
    Then I redirected to the invalid login page

    Examples:
      | username                   | password    | wrong_data |
      |                            |             | both       |
      | istvan.gercsak@metlife.com | Igercsak8!  | password   |
      | istvan.gercsak@metlife.co  | Igercsak8!# | username   |

  Scenario: I can see the right placeholders
    Given I navigate to the login page
    Then I can see the "Username / Email" placeholder in the username and the "Password" placeholder for the password field

  Scenario: I can see the right placeholders on the invalid login page
    Given I navigate to the login page
    And I log into the Touch with "" username and "" password
    And I click on the login button
    Then I can see the "Username / Email" placeholder in the username and the "Password" placeholder for the password field

  Scenario: I can login after I try to login with bad data
    Given I navigate to the login page
    And I log into the Touch with "" username and "" password
    And I click on the login button
    And I log into the Touch with "TestAdmin@TestAdmin.com" username and "Igercsak8!#" password
    Then I arrive on the central page