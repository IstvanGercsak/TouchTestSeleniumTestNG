Feature: Text Content Page features


  Scenario Outline: I can reach the site with admin rights
    Given I navigate to the login page
    And I log into the Touch with <username> username and <password> password with <rights> rights
    And I click on the login button
    And I go on the "Text Content" page
    Then I arrive on the Text Content Lists page
    Examples:
      | username                   | password    | rights |
      | testadmin@testadmin.com    | Igercsak8!# | admin  |
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

  Scenario Outline: Text content modification
    Given I navigate to the login page
    And I log into the Touch with "testadmin@testadmin.com" username and "Igercsak8!#" password
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


  Scenario Outline: Text content content is correct
    Given I navigate to the login page
    And I log into the Touch with "testadmin@testadmin.com" username and "Igercsak8!#" password
    And I click on the login button
    And I go on the "Text Content" page
    And I click on the <text_id> text id
    And I can see the right <Text_locale> text locale, <text_title> title, <text_title> text title and <text_description> text description

    Examples:
      | text_id                                                 | Text_locale | text_title                          | text_description                                     |
      | base:tlbl:central:about-build-number                    | en_US       | Touch build number                  | Touch build number                                   |
      | base:tlbl:central:about-build-timestamp                 | en_US       | Touch build timestamp               | Touch build timestamp                                |
      | base:tlbl:central:about-build-version                   | en_US       | Touch build version                 | Touch build version                                  |
      | base:tlbl:central:admin-content-templates-title         | en_US       | Content Templates                   | Content Templates                                    |
      | base:tlbl:central:admin-content-text-title              | en_US       | Text Content                        | Text Content                                         |
      | base:tlbl:central:admin-jurisdictions-title             | en_US       | Manage Jurisdictions                | Manage Jurisdictions                                 |
      | base:tlbl:central:admin-system-jurisdictions-title      | en_US       | Manage Jurisdictions                | Manage Jurisdictions                                 |
      | base:tlbl:central:admin-system-users-title              | en_US       | Manage Users                        | Manage Users                                         |
      | base:tlbl:central:admin-touchpoint-datalist-description | en_US       | Data List Description               | Data List Description                                |
      | base:tlbl:central:admin-touchpoint-datalist-scope       | en_US       | Data List Scope                     | Data List Scope                                      |
      | base:tlbl:central:admin-touchpoint-datalist-title       | en_US       | Data List Title                     | Data List Title                                      |
      | base:tlbl:central:admin-touchpoint-datalists-title      | en_US       | Touchpoint Data Lists               | Touchpoint Data Lists                                |
      | base:tlbl:central:admin-touchpoint-form-title           | en_US       | Touchpoint Form                     | Touchpoint Form                                      |
      | base:tlbl:central:admin-touchpoint-forms-title          | en_US       | Touchpoint Forms                    | Touchpoint Forms                                     |
      | base:tlbl:central:admin-users-title                     | en_US       | Manage Touch Users                  | Manage TouchUsers                                    |
      | base:tlbl:central:error-title                           | en_US       | An Error Has Occurred               | An Error Has Occurred                                |
      | base:tlbl:central:form-back                             | en_US       | Back                                | Back                                                 |
      | base:tlbl:central:form-cancel                           | en_US       | Cancel                              | Cancel                                               |
      | base:tlbl:central:form-description                      | en_US       | Form Description                    | Form Description                                     |
      | base:tlbl:central:form-name                             | en_US       | Form Name                           | Form Name                                            |
      | base:tlbl:central:form-save                             | en_US       | Save                                | Save                                                 |
      | base:tlbl:central:form-scope                            | en_US       | Form Scope                          | Form Scope                                           |
      | base:tlbl:central:help-about-title                      | en_US       | About Touch                         | About Touch                                          |
      | base:tlbl:central:home-intro                            | en_US       | Select one of the following options | Select one of the following options                  |
      | base:tlbl:central:home-title                            | en_US       | Touch Central                       | Touch Central                                        |
      | base:tlbl:central:jurisdiction-active                   | en_US       | Active jurisdiction                 | Toggles whether the jurisdiction is active           |
      | base:tlbl:central:jurisdiction-edit                     | en_US       | Edit jurisdiction                   | Edit jurisdiction                                    |
      | base:tlbl:central:jurisdiction-id                       | en_US       | ID                                  | Unique identifier for a jurisdiction                 |
      | base:tlbl:central:jurisdiction-name                     | en_US       | Name                                | Name                                                 |
      | base:tlbl:central:jurisdiction-new                      | en_US       | Create jurisdiction                 | Create jurisdiction                                  |
      | base:tlbl:central:jurisdiction-url                      | en_US       | URL                                 | URL                                                  |
      | base:tlbl:central:login-password                        | en_US       | Password                            | Password                                             |
      | base:tlbl:central:login-signin                          | en_US       | Login                               | Login                                                |
      #BUG | base:tlbl:central:login-title                           | en_US       | Sign-on                             | Sign on Title                                        |
      | base:tlbl:central:login-username                        | en_US       | Username / Email                    | Username / Email                                     |
      | base:tlbl:central:nav-actions                           | en_US       | Touch Central Actions               | Touch Central Actions                                |
      | base:tlbl:central:nav-admin-content-title               | en_US       | Content Administration              | Content Administration                               |
      | base:tlbl:central:nav-admin-system-title                | en_US       | System Administration               | System Administration                                |
      | base:tlbl:central:nav-admin-touchpoint-title            | en_US       | Touchpoint Administration           | Touchpoint Administration                            |
      | base:tlbl:central:nav-dashboard                         | en_US       | Dashboard                           | Reporting dashboard                                  |
      | base:tlbl:central:nav-help                              | en_US       | Help                                | Help                                                 |
      | base:tlbl:central:nav-logout                            | en_US       | Logout                              | Logout                                               |
      | base:tlbl:central:reports-dashboard-title               | en_US       | Dashboards                          | Dashboards                                           |
      | base:tlbl:central:reports-touch-report                  | en_US       | Touchpoints by Last Touch           | Touchpoints by Last Touch                            |
      | base:tlbl:central:resource-value-add                    | en_US       | Add value                           | Add value                                            |
      | base:tlbl:central:resource-value-edit                   | en_US       | Edit value                          | Edit value                                           |
      | base:tlbl:central:resources-component                   | en_US       | Component                           | Component                                            |
      | base:tlbl:central:resources-description                 | en_US       | Resource description                | Resource description                                 |
      | base:tlbl:central:resources-en-us-description           | en_US       | en-US Description                   | en-US Description                                    |
      | base:tlbl:central:resources-individual-id               | en_US       | Individual Id                       | Individual Id                                        |
      | base:tlbl:central:resources-locale                      | en_US       | Resource locale                     | Resource locale                                      |
      | base:tlbl:central:resources-resource-description        | en_US       | Resource Description                | Resource description                                 |
      | base:tlbl:central:resources-resource-enabled            | en_US       | Resource Enabled                    | Resource Enabled                                     |
      | base:tlbl:central:resources-resource-title              | en_US       | Resource Title                      | Resource Title                                       |
      | base:tlbl:central:resources-scope                       | en_US       | Scope                               | Scope                                                |
      | base:tlbl:central:resources-title                       | en_US       | Resource title                      | Resource title                                       |
      | base:tlbl:central:resources-type                        | en_US       | Resource Type                       | Resource type                                        |
      | base:tlbl:central:touch-user-confirm-password           | en_US       | Confirm New Password                | Confirm New Password                                 |
      | base:tlbl:central:touch-user-password                   | en_US       | New Password                        | New Password                                         |
      | base:tlbl:central:user-create-password-title            | en_US       | Create New Password                 | Create New Password                                  |
      | base:tlbl:central:user-profile-title                    | en_US       | User Profile                        | User Profile                                         |
      | base:tlbl:central:users-edit-roles-title                | en_US       | Manage Touch User Roles             | Manage Touch User Roles                              |
      | base:tlbl:central:users-edit-user-title                 | en_US       | Edit Touch User                     | Edit Touch User                                      |
      | base:tlbl:central:users-send-token-title                | en_US       | Touch User Registration Token       | Touch User Registration Token                        |
      | base:tlbl:central:users-user-active                     | en_US       | Active                              | Active                                               |
      | base:tlbl:central:users-user-central-admin              | en_US       | Touch Central Admin                 | Touch Central Admin                                  |
      | base:tlbl:central:users-user-central-roles              | en_US       | Touch Central Roles                 | Touch Central Roles                                  |
      | base:tlbl:central:users-user-details                    | en_US       | User details                        | User details                                         |
      | base:tlbl:central:users-user-email                      | en_US       | Email                               | Email                                                |
      | base:tlbl:central:users-user-firstname                  | en_US       | First Name                          | Full Name                                            |
      | base:tlbl:central:users-user-fullname                   | en_US       | Full Name                           | Full Name                                            |
      | base:tlbl:central:users-user-id                         | en_US       | Id                                  | Id                                                   |
      | base:tlbl:central:users-user-jurisdiction-admin         | en_US       | Jurisdiction Admin                  | Jurisdiction Roles                                   |
      | base:tlbl:central:users-user-lastname                   | en_US       | Full Name                           | Last Name                                            |
      | base:tlbl:central:users-user-manage-roles               | en_US       | Manage roles                        | Manage roles                                         |
      | base:tlbl:central:users-user-new                        | en_US       | Create Touch User                   | Create Touch User                                    |
      | base:tlbl:central:users-user-registered                 | en_US       | Registration Date                   | Registration Date                                    |
      | base:tlbl:central:users-user-registration               | en_US       | Registration                        | Registration                                         |
      | base:tlbl:central:users-user-role-memberships           | en_US       | Role Memberships                    | Role Memberships                                     |
      | base:tlbl:central:users-user-send-registration-token    | en_US       | Send registration token             | Send registration token                              |
      | base:tlbl:zone:about-build-number                       | en_US       | Build Number                        | Build Number                                         |
      | base:tlbl:zone:about-build-timestamp                    | en_US       | Build Time Stamp                    | Build Time Stamp                                     |
      | base:tlbl:zone:contact-create-new                       | en_US       | Create New Contact                  | Create New Contact                                   |
      | base:tlbl:zone:contact-first-name                       | en_US       | First Name                          | Contact First Name                                   |
      | base:tlbl:zone:contact-last-name                        | en_US       | Last Name                           | Contact Last Name                                    |
      | base:tlbl:zone:contact-no-results                       | en_US       | No Results Found                    | No Results Found                                     |
      | base:tlbl:zone:contact-search                           | en_US       | Search for a Contact                | Search for a Contact                                 |
      | base:tlbl:zone:form-action-save                         | en_US       | Save                                | Save                                                 |
      | base:tlbl:zone:form-cancel                              | en_US       | Cancel                              | Cancel                                               |
      | base:tlbl:zone:form-save                                | en_US       | Save                                | Save                                                 |
      | base:tlbl:zone:help-about-title                         | en_US       | About Touch                         | About Touch                                          |
      | base:tlbl:zone:nav-dashboard                            | en_US       | Dashboard                           | Dashboard                                            |
      | base:tlbl:zone:nav-help                                 | en_US       | Help                                | Help                                                 |
      | base:tlbl:zone:nav-logout                               | en_US       | Logout                              | Logout                                               |
      | base:tlbl:zone:nav-reports                              | en_US       | Reports                             | Reports                                              |
      | base:tlbl:zone:results-contact                          | en_US       | Contact Details                     | Contact Details                                      |
      | base:tlbl:zone:results-last-touch                       | en_US       | Last Touch                          | Last Touch                                           |
      | base:tlbl:zone:results-no-results                       | en_US       | No Results Found                    | No Results Found                                     |
      | base:tlbl:zone:results-product-category                 | en_US       | Product Category                    | Product Category                                     |
      | base:tlbl:zone:results-product-name                     | en_US       | Product Name                        | Product Name                                         |
      | base:tlbl:zone:searchbar-search                         | en_US       | Search for name or reference        | Search for First Name, Last Name, email or reference |
      | base:tlbl:zone:show-external                            | en_US       | Show Customer View                  | Show Customer View                                   |
      | base:tlbl:zone:tac-backlink                             | en_US       | Back                                | Back                                                 |
      | base:tlbl:zone:tac-title                                | en_US       | Terms & Conditions                  | Terms & Conditions                                   |
      | base:tlbl:zone:touchpoint-new                           | en_US       | Create New Touchpoint               | Create New Touchpoint                                |
      | base:tlbl:zone:touchpoint-title                         | en_US       | Touchpoint                          | Touchpoint                                           |
      | base:tlbl:zone:touchpoint-updates                       | en_US       | Touchpoint Updates                  | Touchpoint Updates                                   |
      | base:tlbl:zone:update-add                               | en_US       | Add Update                          | Add Update                                           |
      | base:tlbl:zone:update-comment                           | en_US       | Internal Comment                    | Internal Comment                                     |
      | base:tlbl:zone:update-notification                      | en_US       | Send Notification                   | Send Notification                                    |
      | base:tlbl:zone:update-selector-external                 | en_US       | Customer Facing Update              | Customer Facing Update                               |
      | base:tlbl:zone:update-selector-internal                 | en_US       | Internal Update                     | Internal Update                                      |
      | base:tlbl:zone:update-title                             | en_US       | Add New Update                      | Add New Update                                       |
      | base:tlbl:zone:updates-title                            | en_US       | Touchpoint Updates                  | Touchpoint Updates                                   |
      | base:tlbl:zone:user-profile-title                       | en_US       | User Profile                        | User Profile                                         |
