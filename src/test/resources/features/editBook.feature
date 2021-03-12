@editBook1

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

	@PROF-340 @PROF-345
	Scenario: Librarian Edits Book Test
		Given the librarian clicked on Books module
		Then the Book Management page opened
		When the librarian clicks Edit Book button
		Then user fills each component in edit window
		And the librarian clicks on Save Changes button
		Then New changes will appear on book management page



	@PROF-335 @PROF-345
	Scenario: Edit Book Parameters Test
		Given the librarian clicked on Books module
		Then the Book Management page opened
		When the librarian clicks Edit Book button
		Then all the parameters titles should match with "Book Name","ISBN","Year","Author","Book Category","Description"
		And the librarian clicks on Save Changes button
		Then New changes will appear on book management page

	@PROF-337 @PROF-345
	Scenario: Edit Book ISBN Test
		Given the librarian clicked on Books module
		Then the Book Management page opened
		When the librarian clicks Edit Book button
		And the librarian clicks on ISBN box
		Then the librarian  enters ISBN data
	@PROF-339 @PROF-345
	Scenario: Edit Book Year Parameter Test
		Given the librarian clicked on Books module
		Then the Book Management page opened
		When the librarian clicks Edit Book button
		And the librarian clicks on Year box
		Then the librarian enters Year data
















#	@PROF-340 @PROF-345
#	Scenario: Librarian Edits Book Test
#		Given the librarian clicked on Books module
#		Then the Book Management page opened
#		When the librarian clicks Edit Book button
#		And the Edit Book Information window will open
#		Then the Librarian edit "Persuasion" and new changes appears on the Book Managements page
#
#
#	@PROF-335 @PROF-345
#	Scenario: Edit Book Parameters Test
#		Given the librarian clicked on Books module
#		Then the Book Management page opened
#		When the librarian clicks Edit Book button
#		And the Edit Book Information window will open
#		And the librarian should see following fields options
#			|Book Name      |
#			|ISBN           |
#			|Year           |
#			|Author         |
#			|Book Category  |
#			|Description    |
#		Then the librarian enters book information with valid credential
#		And the librarian clicks on Save Changes button and new changes appears on the Book Managements page
#
#	@PROF-337 @PROF-345
#	Scenario: Edit Book ISBN Test
#		Given the librarian clicked on Books module
#		Then the Book Management page opened
#		When the librarian clicks Edit Book button
#		And the Edit Book Information window will open
#		And the librarian enters to ISBN "HS-29031825"
#		Then the librarian clicks Save Changes button and new changes appears on the Book Managements page
#
#
#	@PROF-339 @PROF-345
#	Scenario: Edit Book Year Parameter Test
#		Given the librarian clicked on Books module
#		Then the Book Management page opened
#		When the librarian clicks Edit Book button
#		And the Edit Book Information window will open
#		And the librarian enters to Years " 1955"
#		Then the librarian clicks Save Changes button and new changes appears in the Book Managements page







