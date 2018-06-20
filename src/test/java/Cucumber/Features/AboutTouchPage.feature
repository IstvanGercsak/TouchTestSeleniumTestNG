Feature: About Touch page features


  Scenario Outline: I can reach the About Touch page
    Given I navigate to the login page
    And I log into the Touch with <username> and <password>
    And I click on the login button
    And I go on the "About Touch" page
    Then I arrive on the About page
    Examples:
      | username                   | password    | rights                   |
      | TestAdmin@TestAdmin.com    | Igercsak8!# | Central Admin            |
      | istvan.gercsak@gmail.com   | Igercsak8!# | UK Jurisdiction Operator |
      | istvan.gercsak@metlife.com | Igercsak8!# | mixed rights             |

  Scenario: The right breadcrumb is appears on the page
    Given I log into the application with Jurisdiction user
    And I go on the "About Touch" page
    Then The "About Touch" breadcrumb appears

  Scenario Outline: The actual version is "1a3e0cf"
    Given I log into the application with Jurisdiction user
    And I go on the "About Touch" page
    Then I see following <Touch build version>, <Touch build number>, <Touch build timestamp>
    Examples:
      | Touch build version | Touch build number | Touch build timestamp |
      | 0.16.0-RELEASE      | 1a3e0cf            | 1527525936069         |