Feature: Text Content Page features


  Scenario Outline: I can reach the site with admin rights
    Given I navigate to the login page
    And I log into the Touch with <username> username and <password> password with <rights> rights
    And I click on the login button
    And I go on the "Text Content" page
    Then I arrive on the Text Content Lists page
    Examples:
      | username                   | password    | rights |
      | TestAdmin@TestAdmin.com    | Igercsak8!# | admin  |
      | istvan.gercsak@metlife.com | Igercsak8!# | mixed  |

  Scenario: The right breadcrumb is appears on the page
    Given I log into the application with Jurisdiction user
    And I go on the "Text Content" page
    Then The "Text Content" breadcrumb appears

  Scenario Outline: Text content content
    Given I navigate to the login page
    And I log into the Touch with "TestAdmin@TestAdmin.com" username and "Igercsak8!#" password
    And I click on the login button
    And I go on the "Text Content" page
    And I click on the <text_id> text id
    And I can see the right <Text_locale> text locale, <text_title> title, <text_title> text title and <text_description> text description
    And I click on the modification pencil button
    And I click on the Cancel button
    And I click on the modification pencil button
    And I modify the Resource Title to <title_modification_to> and the Resource Description to <text_description_modification_to>
    And I click on the Save button
    And I can see the right <Text_locale> text locale, <title_modification_to> title, <title_modification_to> text title and <text_description_modification_to> text description
    And I click on the modification pencil button
    And I modify the Resource Title to <text_title> and the Resource Description to <text_description>
    And I click on the Save button
    And I can see the right <Text_locale> text locale, <text_title> title, <text_title> text title and <text_description> text description

    Examples:
      | text_id                                         | Text_locale | text_title            | text_description      | title_modification_to        | text_description_modification_to      |
      | base:tlbl:central:about-build-number            | en_US       | Touch build number    | Touch build number    | Touch build number_test12    | Touch build number_descriptiontest    |
      | base:tlbl:central:about-build-timestamp         | en_US       | Touch build timestamp | Touch build timestamp | Touch build timestamp_test12 | Touch build timestamp_descriptiontest |
      | base:tlbl:central:about-build-version           | en_US       | Touch build version   | Touch build version   | Touch build version_test12   | Touch build version_descriptiontest   |
      | base:tlbl:central:admin-content-templates-title | en_US       | Content Templates     | Content Templates     | Content Templates_test12     | Content Templates_descriptiontest     |
      | base:tlbl:central:admin-content-text-title      | en_US       | Text Content          | Text Content          | Text Content_test12          | Text Content_descriptiontest          |