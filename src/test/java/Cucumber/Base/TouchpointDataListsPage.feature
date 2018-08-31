Feature: Touchpoint Data Lists Page

  Scenario Outline: I can reach the site with admin rights
    Given I navigate to the login page
    And I log into the Touch with <username> username and <password> password with <rights> rights
    And I click on the login button
    And I go on the "Touchpoint Data Lists" page
    Then I arrive on the Touchpoint Data Lists page
    Examples:
      | username                   | password    | rights |
      | TestAdmin@TestAdmin.com    | Igercsak8!# | admin  |
      | istvan.gercsak@metlife.com | Igercsak8!# | mixed  |

  Scenario: The right breadcrumb is appears on the page
    Given I log into the application with Jurisdiction user
    And I go on the "Touchpoint Data Lists" page
    Then The "Touchpoint Data Lists" breadcrumb appears