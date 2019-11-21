Feature: Touch Central Actions page features

  Scenario Outline: I can reach the Touch Central Actions page with mixed and Jurisdiction rights
    Given I navigate to the login page
    And I log into the Touch with <username> username and <password> password with <rights> rights
    And I click on the login button
    And I click on the "UK" option
    Then I arrive on the Touch Central Page

    Examples:
      | username                   | password    | rights              |
      | istvan.gercsak@Test.com | Igercsak8!# | Mixed rights        |
      | istvan.gercsak@Test.com | Igercsak8!# | Jurisdiction rights |

  Scenario Outline: I can see the right placeholders
    Given I go on the UK page
    And I choose the <search_by>
    Then I see the right <placeholder> based on <referenceid> selector

    Examples:
      | search_by | placeholder                               | referenceid |
      | Reference | Search for name or reference              | #reference  |
      | Name      | uk:tlbl:zone:searchbar-search-given-name  | #given      |
      | Name      | uk:tlbl:zone:searchbar-search-family-name | #family     |
      | Email     | uk:tlbl:zone:searchbar-search-email       | #email      |

  Scenario: The right breadcrumb is appears on the page
    Given I log into the application with Jurisdiction user
    And I go on the UK page
    Then The "uk:tlbl:zone:touchpoints-title" breadcrumb appears

  Scenario Outline: I can search based on the Reference and Email
    Given I go on the UK page
    And I choose the <search_by>
    And I give the searchable <keyword> based on the <referenceid>
    And I click on the search button
    Then I arrive on the Touchpoints result page

    Examples:
      | search_by | keyword         | referenceid |
      | Reference | reference       | #reference  |
 #     | Name      | given ||
      | Email     | email@email.com | #email      |

  Scenario Outline: I can search based on Name
    Given I go on the UK page
    And I choose the <search_by>
    And I give the <given_name> as given name and <family_name> as family name
    And I click on the search button
    Then I arrive on the Touchpoints result page

    Examples:
      | search_by | given_name | family_name |
      | Name      | Test1      | Test2       |

#  Scenario: I get "No Results Found"
#    Given I go on the UK page
#
#  Scenario: I can not search with 2 or less character
#    Given I go on the UK page

  Scenario Outline: Email format check is working
    Given I go on the UK page
    And I choose the <search_by>
    And I give the searchable <keyword> based on the <referenceid>
    And I click on the search button
    Then I don not move to the Touchpoints result page

      # TODO: How to test basic JS
      # TODO: How to ignore tests

    Examples:
      | search_by | keyword | referenceid |
      | Email     | email   | #email      |