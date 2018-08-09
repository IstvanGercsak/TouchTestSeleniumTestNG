Feature: User profile page features

  Scenario Outline: I can reach the User profile page with hamburger menu
    Given I navigate to the login page
    And I log into the Touch with <username> username and <password> password
    And I click on the login button
    And I go on the "User Profile" page
    Then I arrive on the user Profile page
    Examples:
      | username                   | password    | rights                   |
      | TestAdmin@TestAdmin.com    | Igercsak8!# | Central Admin            |
      | istvan.gercsak@gmail.com   | Igercsak8!# | UK Jurisdiction Operator |
      | istvan.gercsak@metlife.com | Igercsak8!# | mixed rights             |

  Scenario Outline: I can reach the User profile page with profile icon
    Given I navigate to the login page
    And I log into the Touch with <username> username and <password> password
    And I click on the login button
    And  I click on the profile icon
    Then I arrive on the user Profile page
    Examples:
      | username                   | password    | rights                   |
      | TestAdmin@TestAdmin.com    | Igercsak8!# | Central Admin            |
      | istvan.gercsak@gmail.com   | Igercsak8!# | UK Jurisdiction Operator |
      | istvan.gercsak@metlife.com | Igercsak8!# | mixed rights             |

  Scenario Outline: I can see the right rights
    Given I navigate to the login page
    And I log into the Touch with <username> username and <password> password
    And I click on the login button
    And I go on the "User Profile" page
    Then The <rights> is <available>

    Examples:
      | username                   | password    | rights                   | available |
      | TestAdmin@TestAdmin.com    | Igercsak8!# | Central Admin            | true      |
      | TestAdmin@TestAdmin.com    | Igercsak8!# | UK Jurisdiction Operator | false     |
      | istvan.gercsak@gmail.com   | Igercsak8!# | UK Jurisdiction Operator | true      |
      | istvan.gercsak@gmail.com   | Igercsak8!# | Central Admin            | false     |
      | istvan.gercsak@metlife.com | Igercsak8!# | UK Jurisdiction Operator | true      |
      | istvan.gercsak@metlife.com | Igercsak8!# | Central Admin            | true      |

  Scenario: The right breadcrumb is appears on the page
    Given I log into the application with Jurisdiction user
    And I go on the "User Profile" page
    Then The "User Profile" breadcrumb appears

  Scenario: I can log out with the Logout button
    Given I log into the application with Jurisdiction user
    And I go on the "User Profile" page
    And I click on the "Logout" button
    Then I navigate to the login page

  Scenario: I can go back on the central page with the Back button
    Given I log into the application with Jurisdiction user
    And I go on the "User Profile" page
    And I click on the "Back" button
    Then I arrive on the central page