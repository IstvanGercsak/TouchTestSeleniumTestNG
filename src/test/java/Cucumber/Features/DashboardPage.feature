Feature: Dashboard page features

  Scenario Outline: I can reach the About Touch page
    Given I navigate to the login page
    And I log into the Touch with <username> username and <password> password with <rights> rights
    And I click on the login button
    And I go on the "Dashboard" page
    Then I arrive on the Dashboard page
    Examples:
      | username                   | password    | rights                   |
      | testadmin@testadmin.com   | Igercsak8!# | Central Admin            |
      | istvan.gercsak@gmail.com   | Igercsak8!# | UK Jurisdiction Operator |
      | istvan.gercsak@Test.com | Igercsak8!# | mixed rights             |

  Scenario: The right breadcrumb is appears on the page
    Given I log into the application with Jurisdiction user
    And I go on the "Dashboard" page
    Then The "Dashboards" breadcrumb appears

  Scenario: The dropdown list
    Given I log into the application with Jurisdiction user
    And I go on the "Dashboard" page
    Then I can click on all of the elements