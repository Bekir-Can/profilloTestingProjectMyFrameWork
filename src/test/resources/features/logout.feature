@logout
Feature: Log out function


	@PROF-387 @PROF-385 @PROF-386
	Scenario: Librarian Log out (Test)
		Given the librarian logged in the application
		When the user should be able to click the user name button
		And the user click the log out button
		Then log out page title should be "Login - Library"


	@PROF-388 @PROF-385 @PROF-386
	Scenario: Student Log out (Test)
		Given Student logged in the application
		When the user should be able to click the user name button 
		And the user click the log out button
		Then log out page title should be "Login - Library"