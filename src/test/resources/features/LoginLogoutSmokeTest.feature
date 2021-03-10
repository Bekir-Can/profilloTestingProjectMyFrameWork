@smoke
Feature: Login&Logout SmokeTest

	@PROF-382 @PROF-377
	Scenario: Lib login/ logout with valid credentials (Smoke Test)
		Given the librarian should be able to login page "https://library3.cybertekschool.com"
		When the librarian should be able to enter valid credentials "librarian26@library" "gFOHHm6H"
		And the librarian should be able to click sign in button
		Then the librarian should be able to log out


	@PROF-383 @PROF-377
	Scenario: Stu. login/ logout with valid credentials (Smoke Test)
		Given the student should be able to login page "https://library3.cybertekschool.com"
		When the student should be able to enter valid credentials "student46@library" "pOM6YL0B"
		And the student should be able to click sign in button
		Then the student should be able to log out


	@PROF-384 @PROF-377
	Scenario: Stu&Lib cannot login with invalid cred. (Smoke Test)
		Given the student should be able to login page "https://library3.cybertekschool.com"
		When the student should not be able to enter invalid credentials "    " "    "
		And the student should be able to click sign in button
		And the librarian should not be able to enter invalid credentials "librarian27@gmail.com" "Bc14562"
		And the librarian should be able to click sign in button
		Then the student and librarian should not be able to log in "Login - Library"