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


#WORK IN PROGRESS - DO NOT TEST
#
#  Scenario: New text resource content
#    Given I navigate to the login page
#    And I log into the Touch with "TestAdmin@TestAdmin.com" username and "Igercsak8!#" password
#    And I click on the login button
#    And I go on the "Text Content" page
#    And I click on the new text resource content
#    And Fields are clickable
#    And I click on the Cancel
#    And I click on the new text resource content
#    And I click on the Save

  Scenario Outline: Text content content
    Given I navigate to the login page
    And I log into the Touch with "TestAdmin@TestAdmin.com" username and "Igercsak8!#" password
    And I click on the login button
    And I go on the "Text Content" page
    And I click on the <text_id> text id
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
      | text_id                                 | Text_locale | text_title            | text_description      | title_modification_to        | text_description_modification_to      |
      | base:tlbl:central:about-build-number    | en_US       | Touch build number    | Touch build number    | Touch build number_test12    | Touch build number_descriptiontest    |
      | base:tlbl:central:about-build-timestamp | en_US       | Touch build timestamp | Touch build timestamp | Touch build timestamp_test13 | Touch build timestamp_descriptiontest |


  Scenario Outline:
    Given I navigate to the login page
    And I log into the Touch with "TestAdmin@TestAdmin.com" username and "Igercsak8!#" password
    And I click on the login button
    And I go on the "Text Content" page
    And I click on the <text_id> text id
    And I can see the right <Text_locale> text locale, <text_title> title, <text_title> text title and <text_description> text description

    Examples:
      | text_id | Text_locale                         | text_title                                           |
      | en_US   | Touch build number                  | Touch build number                                   |
      | en_US   | Touch build timestamp               | Touch build timestamp                                |
      | en_US   | Touch build version                 | Touch build version                                  |
      | en_US   | Content Templates                   | Content Templates                                    |
      | en_US   | Text Content                        | Text Content                                         |
      | en_US   | Manage Jurisdictions                | Manage Jurisdictions                                 |
      | en_US   | Manage Jurisdictions                | Manage Jurisdictions                                 |
      | en_US   | Manage Users                        | Manage Users                                         |
      | en_US   | Data List Description               | Data List Description                                |
      | en_US   | Data List Scope                     | Data List Scope                                      |
      | en_US   | Data List Title                     | Data List Title                                      |
      | en_US   | Touchpoint Data Lists               | Touchpoint Data Lists                                |
      | en_US   | Touchpoint Form                     | Touchpoint Form                                      |
      | en_US   | Touchpoint Forms                    | Touchpoint Forms                                     |
      | en_US   | Manage Touch Users                  | Manage TouchUsers                                    |
      | en_US   | An Error Has Occurred               | An Error Has Occurred                                |
      | en_US   | Back                                | Back                                                 |
      | en_US   | Cancel                              | Cancel                                               |
      | en_US   | Form Description                    | Form Description                                     |
      | en_US   | Form Name                           | Form Name                                            |
      | en_US   | Save                                | Save                                                 |
      | en_US   | Form Scope                          | Form Scope                                           |
      | en_US   | About Touch                         | About Touch                                          |
      | en_US   | Select one of the following options | Select one of the following options                  |
      | en_US   | Touch Central                       | Touch Central                                        |
      | en_US   | Active jurisdiction                 | Toggles whether the jurisdiction is active           |
      | en_US   | Edit jurisdiction                   | Edit jurisdiction                                    |
      | en_US   | ID                                  | Unique identifier for a jurisdiction                 |
      | en_US   | Name                                | Name                                                 |
      | en_US   | Create jurisdiction                 | Create jurisdiction                                  |
      | en_US   | URL                                 | URL                                                  |
      | en_US   | Password                            | Password                                             |
      | en_US   | Login                               | Login                                                |
      | en_US   | Sign-on                             | Sign on Title                                        |
      | en_US   | Username / Email                    | Username / Email                                     |
      | en_US   | Touch Central Actions               | Touch Central Actions                                |
      | en_US   | Content Administration              | Content Administration                               |
      | en_US   | System Administration               | System Administration                                |
      | en_US   | Touchpoint Administration           | Touchpoint Administration                            |
      | en_US   | Dashboard                           | Reporting dashboard                                  |
      | en_US   | Help                                | Help                                                 |
      | en_US   | Logout                              | Logout                                               |
      | en_US   | Dashboards                          | Dashboards                                           |
      | en_US   | Touchpoints by Last Touch           | Touchpoints by Last Touch                            |
      | en_US   | Add value                           | Add value                                            |
      | en_US   | Edit value                          | Edit value                                           |
      | en_US   | Component                           | Component                                            |
      | en_US   | Resource description                | Resource description                                 |
      | en_US   | en-US Description                   | en-US Description                                    |
      | en_US   | Individual Id                       | Individual Id                                        |
      | en_US   | Resource locale                     | Resource locale                                      |
      | en_US   | Resource Description                | Resource description                                 |
      | en_US   | Resource Enabled                    | Resource Enabled                                     |
      | en_US   | Resource Title                      | Resource Title                                       |
      | en_US   | Scope                               | Scope                                                |
      | en_US   | Resource title                      | Resource title                                       |
      | en_US   | Resource Type                       | Resource type                                        |
      | en_US   | Confirm New Password                | Confirm New Password                                 |
      | en_US   | New Password                        | New Password                                         |
      | en_US   | Create New Password                 | Create New Password                                  |
      | en_US   | User Profile                        | User Profile                                         |
      | en_US   | Manage Touch User Roles             | Manage Touch User Roles                              |
      | en_US   | Edit Touch User                     | Edit Touch User                                      |
      | en_US   | Touch User Registration Token       | Touch User Registration Token                        |
      | en_US   | Active                              | Active                                               |
      | en_US   | Touch Central Admin                 | Touch Central Admin                                  |
      | en_US   | Touch Central Roles                 | Touch Central Roles                                  |
      | en_US   | User details                        | User details                                         |
      | en_US   | Email                               | Email                                                |
      | en_US   | First Name                          | Full Name                                            |
      | en_US   | Full Name                           | Full Name                                            |
      | en_US   | Id                                  | Id                                                   |
      | en_US   | Jurisdiction Admin                  | Jurisdiction Roles                                   |
      | en_US   | Full Name                           | Last Name                                            |
      | en_US   | Manage roles                        | Manage roles                                         |
      | en_US   | Create Touch User                   | Create Touch User                                    |
      | en_US   | Registration Date                   | Registration Date                                    |
      | en_US   | Registration                        | Registration                                         |
      | en_US   | Role Memberships                    | Role Memberships                                     |
      | en_US   | Send registration token             | Send registration token                              |
      | en_US   | Build Number                        | Build Number                                         |
      | en_US   | Build Time Stamp                    | Build Time Stamp                                     |
      | en_US   | Create New Contact                  | Create New Contact                                   |
      | en_US   | First Name                          | Contact First Name                                   |
      | en_US   | Last Name                           | Contact Last Name                                    |
      | en_US   | No Results Found                    | No Results Found                                     |
      | en_US   | Search for a Contact                | Search for a Contact                                 |
      | en_US   | Save                                | Save                                                 |
      | en_US   | Cancel                              | Cancel                                               |
      | en_US   | Save                                | Save                                                 |
      | en_US   | About Touch                         | About Touch                                          |
      | en_US   | Dashboard                           | Dashboard                                            |
      | en_US   | Help                                | Help                                                 |
      | en_US   | Logout                              | Logout                                               |
      | en_US   | Reports                             | Reports                                              |
      | en_US   | Contact Details                     | Contact Details                                      |
      | en_US   | Last Touch                          | Last Touch                                           |
      | en_US   | No Results Found                    | No Results Found                                     |
      | en_US   | Product Category                    | Product Category                                     |
      | en_US   | Product Name                        | Product Name                                         |
      | en_US   | Search for name or reference        | Search for First Name, Last Name, email or reference |
      | en_US   | Show Customer View                  | Show Customer View                                   |
      | en_US   | Back                                | Back                                                 |
      | en_US   | Terms & Conditions                  | Terms & Conditions                                   |
      | en_US   | Create New Touchpoint               | Create New Touchpoint                                |
      | en_US   | Touchpoint                          | Touchpoint                                           |
      | en_US   | Touchpoint Updates                  | Touchpoint Updates                                   |
      | en_US   | Add Update                          | Add Update                                           |
      | en_US   | Internal Comment                    | Internal Comment                                     |
      | en_US   | Send Notification                   | Send Notification                                    |
      | en_US   | Customer Facing Update              | Customer Facing Update                               |
      | en_US   | Internal Update                     | Internal Update                                      |
      | en_US   | Add New Update                      | Add New Update                                       |
      | en_US   | Touchpoint Updates                  | Touchpoint Updates                                   |
      | en_US   | User Profile                        | User Profile                                         |
