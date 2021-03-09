Feature: 

	Background:
		#@PROF-229
		Given the librarian logged in the application
		

	@PROF-369
	Scenario: Edit Book Functionality Smoke
		    Given the librarian clicked on Books module
		    Then the Book Management page opened
		    When the librarian clicks Edit Book button
		    And the Edit Book Information window will open
		    When the librarian clicks Add Book button
		    Then the Add Book window will open