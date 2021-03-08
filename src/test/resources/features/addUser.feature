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
