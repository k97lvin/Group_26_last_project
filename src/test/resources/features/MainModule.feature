@main
Feature: As a user, I should be accessing all the main modules of the app.

  Scenario Outline:  Verify users accessing all the main modules of the app.
    Given user on the login page
    When user use username "<username>"
    Then user should add "<password>"
    And user click the login button
    Then Verify the user see the following :

      | Dashboard |
      | Files     |
      | Photos    |
      | Activity  |
      | Talk      |
      | Mail  |
      | Contacts  |
      | Circles   |
      | Calendar  |
      | Deck      |

    Examples:

      | username | password    |

      | user7    | Userpass123 |

#      | user34   | Userpass123 |
#
#      | user99   | Userpass123 |
