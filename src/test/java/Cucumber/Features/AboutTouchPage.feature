Feature: About Touch page features


  Scenario Outline: I can reach the About Touch page
    Given I navigate to the login page
    And I log into the Touch with <username> username and <password> password with <rights> rights
    And I click on the login button
    And I go on the "About Touch" page
    Then I arrive on the About page
    Examples:
      | username                   | password    |
      | TestAdmin@TestAdmin.com    | Igercsak8!# |
      | istvan.gercsak@gmail.com   | Igercsak8!# |
      | istvan.gercsak@metlife.com | Igercsak8!# |

  Scenario: The right breadcrumb is appears on the page
    Given I log into the application with Jurisdiction user
    And I go on the "About Touch" page
    Then The "About Touch" breadcrumb appears

  Scenario Outline: The actual version is "1a3e0cf"
    Given I log into the application with Jurisdiction user
    And I go on the "About Touch" page
    Then I see following <Touch build version>, <Touch commit id>, <Touch build number>, <Touch build timestamp>
    Examples:
      | Touch build version | Touch commit id | Touch build number | Touch build timestamp |
      | 0.17.0-SNAPSHOT     | d19bc7e         | 30                 | 1535136498681         |