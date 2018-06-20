Feature: Touch Central Actions page features

  Scenario Outline: I can reach the Touch Central Actions page with mixed and Jurisdiction rights
    Given I navigate to the login page
    And I log into the Touch with <username> username and <password> password
    And I click on the login button
    And I click on the "UK" options
    Then I arrive on the Touch Central Page

    Examples:
      | username                   | password    | rights                   |
      | istvan.gercsak@gmail.com   | Igercsak8!# | UK Jurisdiction Operator |
      | istvan.gercsak@metlife.com | Igercsak8!# | mixed rights             |


  Scenario: I can not reach the Touch Central Actions page with single admin rights
    Given I navigate to the login page
    And I log into the Touch with "TestAdmin@TestAdmin.com" username and "Igercsak8!#" password
    And I click on the login button
    And I click on the "UK" options
    Then The UK link not visible