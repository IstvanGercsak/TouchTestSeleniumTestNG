Feature: About Touch page features


  Scenario Outline: I can reach the About Touch page
    Given I navigate to the login page
    And I log into the Touch with <username> username and <password> password with <rights> rights
    And I click on the login button
    And I go on the "About Touch" page
    Then I arrive on the About page
    Examples:
      | username                   | password    |
      | testadmin@testadmin.com    | Igercsak8!# |
      | istvan.gercsak@gmail.com   | Igercsak8!# |
      | istvan.gercsak@test.com | Igercsak8!# |

  Scenario: The right breadcrumb is appears on the page
    Given I log into the application with Jurisdiction user
    And I go on the "About Touch" page
    Then The "About Touch" breadcrumb appears

  Scenario Outline: The actual version is "0.17.0-SNAPSHOT"
    Given I log into the application with Jurisdiction user
    And I go on the "About Touch" page
    Then I see following <Touch_build_version>, <Touch_commit_id>, <Touch_build_number>, <Touch_build_timestamp>
    Examples:
      | Touch_build_version | Touch_commit_id | Touch_build_number | Touch_build_timestamp |
      | 0.17.0-SNAPSHOT     | d19bc7e         | 1                 | 1537960892736         |