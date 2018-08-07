Feature: Central page features


  Scenario: The right breadcrumb appears on the page
    Given I log into the application with Jurisdiction user
    Then The "Touch Central" breadcrumb appears

  Scenario: UK page is available with Jurisdiction rights
    Given I log into the application with Jurisdiction user
    And I click on the "UK" option
    Then I redirected to the UK page

  Scenario: Dashboard page is available with Jurisdiction rights
    Given I log into the application with Jurisdiction user
    And I click on the "Dashboard" option
    Then I redirected to the Dashboard page

  Scenario: Dashboard page is available with Admin rights
    Given I log into the application with Admin user
    And I click on the "Dashboard" option
    Then I redirected to the Dashboard page

  Scenario: UK page is available with Mixed rights
    Given I log into the application with Mixed rights user
    And I click on the "UK" option
    Then I redirected to the UK page

  Scenario: Dashboard page is available with Mixed rights
    Given I log into the application with Mixed rights user
    And I click on the "Dashboard" option
    Then I redirected to the Dashboard page

  Scenario Outline: With Jurisdiction rights I can see, but I have no access to the admin pages
    Given I log into the application with Jurisdiction user
    And I navigate with the hamburger menu to the <site> page
    Then I get "Access is denied" error message

    Examples:
      | site                                           |
      | Touchpoint Forms                               |
      | Touchpoint Data Lists                          |
      | Manage Users                                   |
      | Manage Jurisdictions                           |
      | base:tlbl:central:admin-system-endpoints-title |
      | base:tlbl:central:admin-system-info-title      |
      | Text Content                                   |
      | Content Templates                              |

  Scenario Outline: With Admin rights, using the hamburger menu I can see and reach every page from the list
    Given I log into the application with Admin user
    And I navigate with the hamburger menu to the <site> page
    Then I arrive to the <site> page

    Examples:
      | site                                           |
      | Touchpoint Forms                               |
      | Touchpoint Data Lists                          |
      | Manage Users                                   |
      | Manage Jurisdictions                           |
      | base:tlbl:central:admin-system-endpoints-title |
      | base:tlbl:central:admin-system-info-title      |
      | Text Content                                   |
      | Content Templates                              |