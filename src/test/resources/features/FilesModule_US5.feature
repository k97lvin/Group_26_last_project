Feature: As a user, I should be able to access to Files module - Favorites button

  Scenario: Verify users to add ﬁles to Favorites
    Given user on the dashboard page
    When the user clicks the Files module
    When the user clicks action-icon  from any ﬁle on the page
    And user choose the Add to favorites option
    And user click the Favorites sub-module on the left side
    Then Verify the chosen ﬁle is listed on the table