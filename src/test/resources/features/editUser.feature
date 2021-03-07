Feature:

  Background:
		#@PROF-229
    Given the librarian logged in the application

  @SmokeUsers
  Scenario: Edit User Functionality Smoke Suit
    Given the librarian clicked on Users module
    Then the User Management page opened
    When the librarian clicked Edit User button
    And the Edit User Information window will open
    When the librarian clicked Add User button
    Then the Add User window will open
