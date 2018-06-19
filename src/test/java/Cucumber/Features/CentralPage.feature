Feature: Central page availability, hamburger menu availability, links, and logout from page

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

  Scenario: I can reach the User details page
    Given I navigate to the login page
    Given I log into the Touch with "istvan.gercsak@metlife.com" username and "Igercsak8!#" password
    And I click on the login button
    And I click on the profile icon
    Then I arrive on the profile page

  Scenario: I redirected on the central page after clicking on the Metlife icon
    Given I navigate to the login page
    Given I log into the Touch with "istvan.gercsak@metlife.com" username and "Igercsak8!#" password
    And I click on the login button
    And I click on the Metlife icon
    Then I arrive on the Metlife page

  Scenario: The right breadcrumb is appears on the page
    Given I navigate to the login page
    Given I log into the Touch with "istvan.gercsak@metlife.com" username and "Igercsak8!#" password
    And I click on the login button
    Then The "Touch Central" breadcrumb appears

  Scenario: I can log out
    Given I navigate to the login page
    Given I log into the Touch with "istvan.gercsak@metlife.com" username and "Igercsak8!#" password
    And I click on the login button
    And I click on the log out
    Then I redirected to the login page