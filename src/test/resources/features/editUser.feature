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

  @PROF-328 @PROF-332
  Scenario: User Group dropdown
    Given the librarian clicked on Users module
    Then the User Management page opened
    When the user clicks on User Group dropdown and see following options
      |ALL      |
      |Librarian|
      |Students |
    And the user can click and select one of the options
    Then the Group column in the table should show only related options

  @PROF-329 @PROF-332
  Scenario Outline: Show user records dropdown
    Given the librarian clicked on Users module
    Then the user clicks show records dropdown
    And the user can select,click one of the <numbers>
    Then the number of rows in the table should be <relatedNumber>
    Examples:
      | numbers | relatedNumber |
      | 5       | 5             |
      | 10      | 10            |
      | 15      | 15            |
      | 50      | 50            |
      | 100     | 100           |
      | 200     | 200           |
      | 500     | 500           |

