@PROF-327
Feature: Barrow Book Functions

  Background:
		#@PROF-234
    Given Student logged in the application

  @PROF-319 @PROF-326
  Scenario Outline: Student can barrow books
    And the user choose one records dropdow "<options>"
    When the user click the active Barrow Book button
    Then the user can see green pop up and borrow the book
    Examples:

      | options|
      | 5      |
      | 10     |
      | 15     |
      | 50     |
      | 100    |
      | 200    |
      | 500    |



	@PROF-320 @PROF-326
	Scenario: Book can not barrowed twice
		When the user click inactive Borrow Book button
		Then the user can not borrowed same book twice


#	@PROF-321 @PROF-326
#	Scenario: Navigate history of barrowed books
#		When the user navigate Borrowing Book module
#		Then the user should see own borrowed books history
#
#
#	@PROF-322 @PROF-326
#	Scenario: Navigate Return books
#		When the user click the Borrowing Books module
#		Then the user see history of borrowed books list
#		And the user click the active Return Book button
#		Then the user see green pop up after return the book
#
#	@PROF-323 @PROF-326
#	Scenario Outline: Navigate the book categories
#		When the user click Book Categories dropdown box
#		Then the user see all book categories
#		Examples:
#		| Action and Adventure    |
#		| Anthology               |
#		| Classic                 |
#		| Comic and Graphic Novel |
#		| Crime and Detective     |
#		| Drama                   |
#		| Fable                   |
#		| Fairy Tale              |
#		| Fan-Fiction             |
#		| Fantasy                 |
#		| Historical Fiction      |
#		| Horror                  |
#		| Science Fiction         |
#		| Biography/Autobiography |
#		| Humor                   |
#		| Romance                 |
#		| Short Story             |
#		| Essay                   |
#		| Memoir                  |
#		| Poetry                  |
#		When the user select and click one category
#		Then the user see books related to that category
#
#
#
#
#	@PROF-324 @PROF-326
#	Scenario Outline: Show records dropdown
#		When the user navigate the Book Managment page
#		Then the user should be able to click to show records dropdown box
#		When the user select one <option> in show records dropdown
#		Then the user should be able to see the exact number of books that he selected
#
#		Examples:
#		|option|
#		| 5   |
#		| 10  |
#		| 15  |
#		| 50  |
#		| 100 |
#		| 200 |
#		| 500 |
#
#
#	@PROF-325 @PROF-326
#	Scenario: Finding Book by using search box
#		When the user in search box should type the name of the book
#		Then the user will see all books according to search
#		When the user in search box should type the name of author
#		Then the user can see all books written by author that he searched