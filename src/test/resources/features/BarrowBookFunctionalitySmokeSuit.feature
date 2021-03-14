@123
Feature:Barrow Book Smoke Test Suit

  Background:
		#@PROF-234
    Given Student logged in the application

  @PROF-404 @PROF-396
  Scenario: Barrow Book Functionality Smoke Suit
    Given the user click the active Barrow Book button
    Then the user can see green pop up and borrow the book
    And  the user click inactive Borrow Book button
    Then the user can not borrowed same book twice
    When the user navigate Borrowing Book module
    Then the user should see own borrowed books history
    When the user click the active Return Book button
    Then the user see green pop up after return the book
		