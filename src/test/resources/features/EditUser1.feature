@mehmet
Feature:

	Background:
		#@PROF-229
		Given the librarian logged in the application
		

	@PROF-373 @PROF-391
	Scenario: Edit User Function
		Given the librarian clicked on Users module
		When the librarian clicked Edit User button
		And change the Full Name information with "John" and click Save changes
		Then librarian should get "The user is updated."	

	@PROF-374 @PROF-391
	Scenario: Edit user should have following parameters
		Given the librarian clicked on Users module
		When the librarian clicked Edit User button
		And change the Password information with "12345pass" and click Save changes
		Then librarian should get "The user is updated."	

	@PROF-375 @PROF-391
	Scenario Outline: User  types as Librarian and Students
		Given the librarian clicked on Users module
		When the librarian clicked Edit User button
		And click User Group dropdown,select <groupOptions>,and click Save changes
		Then librarian should get "The user is updated."
		Examples:
		|groupOptions|
		|Librarian   |
		|Students    |	

	@PROF-376 @PROF-391
	Scenario Outline: Status should have ACTIVE and INACTIVE
		Given the librarian clicked on Users module
		When the librarian clicked Edit User button
		And  click Status dropdown,select <statusOptions>,and click Save changes
		Then librarian should get "The user is updated."
		Examples:
		|statusOptions|
		|ACTIVE       |
		|INACTIVE     |
		