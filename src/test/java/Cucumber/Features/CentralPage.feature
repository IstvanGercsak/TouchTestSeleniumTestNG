Feature: Central page features 


  Scenario: The right breadcrumb appears on the page
    Given I log into the application with Jurisdiction user
    Then The "Touch Central" breadcrumb appears

  Scenario: UK page is available
    Given I log into the application with Jurisdiction user
    And I click on the "UK" options
    Then I redirected to the UK page

  Scenario: Dashboard page is available
    Given I log into the application with Jurisdiction user
    And I click on the "Dashboard" options
    Then I redirected to the Dashboard page