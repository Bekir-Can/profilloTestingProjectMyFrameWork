@wippp
Feature:

  Background:
		#@PROF-229
    Given the librarian logged in the application


	#{color:#00875a}*User Story :* {color}
	#
	#As a librarian I should be able to add new books
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#
	#_1-Librarian can add books_
  @PROF-363
  Scenario: Add Book Functionality (c)
    Given the librarian clicked on Books module
    And the librarian clicks Add Book button
    When user fills each add book parameters on add book window
    And user clicks on save changes button
    Then new added book will appear on book managament page




    #{color:#00875a}*User Story :* {color}
	#
	#As a librarian I should be able to add new books
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#_2- Add book should have following parameters: name,_
	#_author, description, category, ISBN, year._
  @PROF-365
  Scenario: Add Book Parameters (c)
    Given the librarian clicked on Books module
    When the librarian clicks Add Book button
    Then user should be able to see following parameters
      | Book Name     |
      | Description   |
      | Author        |
      | Book Category |
      | ISBN          |
      | Year          |



    #{color:#00875a}*User Story :* {color}
	#
	#As a librarian I should be able to add new books
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criteria:_*{color}
	#_3- ISBN must be 10 or 13 digits in length and consists of digits (0-9) and dashes (-)._ 
  @PROF-366
  Scenario: ISBN Function (c)
    When the librarian clicked on Books module
    And the librarian clicks Add Book button
    And user clicks on ISBN box
    Then user enters ISBN data



    #{color:#00875a}*User Story :* {color}
	#
	#As a librarian I should be able to add new books
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criteria:_*{color}
	#_4-Year parameter should have only digits (0-9)_
  @PROF-367
  Scenario: Year Function (c)
    When the librarian clicked on Books module
    And the librarian clicks Add Book button
    And user clicks on Year box
    Then user enters Year data





    #{color:#00875a}*User Story :* {color}
	#
	#As a librarian I should be able to add new books
	#
	# 
	#
	#{color:#de350b}*_Acceptance Criterias:_*{color}
	#_5-Following categories should be present:_
	#_- Action and Adventure_
	#_- Anthology_
	#_- Classic_
	#_- Comic and Graphic Novel_
	#_- Crime and Detective_
	#_- Drama_
	#_- Fable_
	#_- Fairy Tale_
	#_- Fan-Fiction_
	#_- Fantasy_
	#_- Historical Fiction_
	#_- Horror_
	#_- Science Fiction_
	#_- Biography/Autobiography_
	#_- Humor_
	#_- Romance_
	#_- Short Story_
	#_- Essay_
	#_- Memoir_
	#_- Poetry_
  @PROF-368
  Scenario: Book Categories (c)
    When the librarian clicked on Books module
    And the librarian clicks Add Book button
    When the user clicks on Book Category dropdown
    Then the user should see following options
      | Action and Adventure    |
      | Anthology               |
      | Classic                 |
      | Comic and Graphic Novel |
      | Crime and Detective     |
      | Drama                   |
      | Fable                   |
      | Fairy Tale              |
      | Fan-Fiction             |
      | Fantasy                 |
      | Historical Fiction      |
      | Horror                  |
      | Science Fiction         |
      | Biography/Autobiography |
      | Humor                   |
      | Romance                 |
      | Short Story             |
      | Essay                   |
      | Memoir                  |
      | Poetry                  |