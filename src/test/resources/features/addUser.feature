@addUser
Feature:Add User Functionality

  Background:
		#@PROF-229
    Given the librarian logged in the application


  @PROF-350
  Scenario: Librarian can add new user as a student
    Given the librarian clicked on Users module
    And the librarian clicked +Add User button
    When the librarian fill all fields with proper infos and click save changes
    Then the librarian should get "The user has been created."



  @PROF-371
  Scenario: Librarian can add new user as a librarian
    Given the librarian clicked on Users module
    And the librarian clicked +Add User button
    When the librarian fill all fields and click button with librarian role
    Then the librarian should get "The user has been created."



  @PROF-372
  Scenario: Add User Parameters Test
    Given the librarian clicked on Users module
    When the librarian clicked +Add User button
    Then all the parameters titles should match with "Full Name","Password","Email","User Group","Status","Start Date","End Date","Address"



  @PROF-395
  Scenario: Add User Group Test
    Given the librarian clicked on Users module
    When the librarian clicked +Add User button
    Then the user should get all necessary userGroup options
      |Librarian|
      |Students |



  @PROF-398
  Scenario: Add User Status Test
    Given the librarian clicked on Users module
    When the librarian clicked +Add User button
    Then the user should get all necessary status options
      |ACTIVE  |
      |INACTIVE|



  @PROF-403
  Scenario: Add User Test for Smoke Suit
    Given the librarian clicked on Users module
    When the librarian clicked +Add User button
    Then user should get "Add User" main title