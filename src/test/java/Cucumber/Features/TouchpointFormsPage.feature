Feature: Touchpoint Forms Page

  Scenario Outline: I can reach the site with admin rights
    Given I navigate to the login page
    And I log into the Touch with <username> username and <password> password with <rights> rights
    And I click on the login button
    And I go on the "Touchpoint Forms" page
    Then I arrive on the Touchpoint Forms page
    Examples:
      | username                   | password    | rights |
      | testadmin@testadmin.com    | Igercsak8!# | admin  |
      | istvan.gercsak@Test.com | Igercsak8!# | mixed  |

  Scenario: The right breadcrumb is appears on the page
    Given I log into the application with Jurisdiction user
    And I go on the "Touchpoint Forms" page
    Then The "Touchpoint Forms" breadcrumb appears

# Bug Scenario: New Central form button is clickable