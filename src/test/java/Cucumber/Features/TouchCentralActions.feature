Feature: Touch Central Actions page features

  Scenario Outline: I can reach the Touch Central Actions page with mixed and Jurisdiction rights
    Given I navigate to the login page
    And I log into the Touch with <username> username and <password> password with <rights> rights
    And I click on the login button
    And I click on the "UK" option
    Then I arrive on the Touch Central Page

    Examples:
      | username                   | password    |
      | istvan.gercsak@metlife.com | Igercsak8!# |

  Scenario Outline: I can see the right placeholders
    Given I go on the UK page
    And I choose the <searchby>
    Then I see the right <placeholder> based on <referenceid> selector

    Examples:
      | searchby  | placeholder                               | referenceid |
      | Reference | Search for name or reference              | #reference  |
      | Name      | uk:tlbl:zone:searchbar-search-given-name  | #given      |
      | Name      | uk:tlbl:zone:searchbar-search-family-name | #family     |
      | Email     | uk:tlbl:zone:searchbar-search-email       | #email      |
