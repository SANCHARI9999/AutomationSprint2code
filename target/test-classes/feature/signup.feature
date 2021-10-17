Feature: Posts feature in RealEstate Application

  Background: Login Functionality
    Given User is on the login page
    When User enter username and password
    Then User clicks on login button
    And User is redirected to dashboard
    And User navigates to posts section
    Then User is redirected to Posts section

  @create_any_post
  Scenario: Verify whether the user can create any post
    When User clicks on add new field
    And User creates any post in add title
    Then User clicks on publish button
    Then User clicks on update button

  @create_any_categories
  Scenario: Verify whether the user can create any category
    When User clicks on categories
    And User creates any category in name section
    Then User clicks on add new category button

  @create_any_tag
  Scenario: Verify whether the user can create any tag
    When User clicks on tags
    And User creates any tag in name section
    Then User clicks on add new tag button

  @bulkfunctionality_in_posts_section
  Scenario: Verify whether the user can use bulk functionality
    When User selects checkbox of any posts
    Then User clicks on bulk actions
    And User selects move to trash option"<move to trash>"
    Then User clicks on apply button

  @search_funtion
  Scenario: Verify search post functionality by name
    When User clicks the search field
    And User enters the name"<hel>"
    Then User clicks the search button

  #And User fetch the result
  @filter_funtion
  Scenario: Verify filter comment functionality by post type
    When User clicks on All dates dropdown list
    And User selects any option"<March 2021>"
    When User clicks on All categories dropdown list
    And User selects any option"<KESAV>"
    Then User clicks on filter button

  @bulkfunctionality_in_categories_section
  Scenario: Verify whether the user can use bulk functionality in categories section
    When User clicks on categories option
    And User selects multiple checkboxes of categories
    Then User clicks on bulk actions of categories
    And User selects delete option in categories bulk functionality"<delete>"
    Then User clicks on apply button in categories section

  @bulkfunctionality_in_tags_section
  Scenario: Verify whether the user can use bulk functionality in tags section
    When User clicks on tags option
    And User selects multiple checkboxes of tags
    Then User clicks on bulk actions of tags
    And User selects delete option in tags bulk functionality"<delete>"
    Then User clicks on apply button in tags section

  @trash_functionality_in_posts_section
  Scenario: Verify whether the user can use trash functionality in posts section to retrieve the deleted posts
    When User clicks on trash option
    And User selects multiple checkboxes of trash posts items
    Then User clicks on bulk actions of trash functionality
    And User selects restore option in bulk functionality"<restore>"
    Then User clicks on apply button in trash section

  @edit_functionality
  Scenario: Verify whether the user can use edit functionality
    When User clicks on any post"<first post>"
    And User edits the changes to "<first posting>"
    Then User clicks on publish button in edit functionality
    Then User clicks on update button in edit functionality

  @edit_functionality_taking_previous_dates
  Scenario: Verify whether the user can use edit functionality to edit dates
    When User clicks on the post"<good>"
    And User clicks on publish immediately"<edit>"
    Then User clicks on date dropdown
    And User selects 06-June option"<06-June>"
    Then User clicks on publish button in edit functionality to update date
    Then User clicks on update button in edit functionality to update the changes
