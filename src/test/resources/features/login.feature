@wip
Feature: login function

@wip
  Scenario: Login with Librarian valid credentials
    Given the librarian logged in the application
@wip
  Scenario: Login with Student valid credentials
    Given Student logged in the application

  @PROF-378 @PROF-377
  Scenario Outline: Lib. log in with valid cred. (Test)
    When the user enter valid credentials "<Email>" "<Password>"
    Then the user can log in
    Examples:
      | Email               | Password |
      | librarian26@library | gFOHHm6H |
      | librarian27@library | ZM9JMdIK |
      | librarian28@library | wVFVnaCO |
      | librarian29@library | PZ7IQ8G5 |
      | librarian30@library | e3BxcFKE |
      | librarian31@library | pogXBhac |
      | librarian32@library | sRALQfSE |
      | librarian33@library | df6NfMib |
      | librarian34@library | AN4rrS52 |
      | librarian35@library | qMgZFGfc |


  @PROF-379 @PROF-377
  Scenario Outline: Stu. log in with valid cred. (Test)
    When the user enter valid credentials "<Email>" "<Password>"
    Then the user can log in
    Examples:
      | Email               | Password |
      | student46@library   | pOM6YL0B |
      | student47@library   | 3lUpdof3 |
      | student48@library   | b0zgv1ab |
      | student49@library   | npSk3tsr |
      | student50@library   | so9lCgZf |
      | student51@library   | wFe76AL0 |
      | student52@library   | eiJolZ4e |
      | student53@library   | BzMxHu3s |
      | student54@library   | PTXgKAAR |
      | student55@library   | Bn9rNDOI |


  @PROF-380 @PROF-377
  Scenario Outline: Lib. log in with invalid cred. (Test)
    When the user cannot enter invalid credentials "<Email>" "<Password>"
    Then the user cannot log in
    Examples:
      | Email               | Password |
      | librarian26@library |          |
      |                     | ZM9JMdIK |
      | librarian28@library | pogXBhac |
      | librarian29@library | qMgZFGfc |
      | librarian30@library | PZ7IQ8G5 |



  @PROF-381 @PROF-377
  Scenario Outline: Stu. log in with invalid cred. (Test)
    When the user enter invalid credentials "<InvalidEmail>" "<InvalidPassword>"
    Then the user cannot log in

    Examples:
      | InvalidEmail        | InvalidPassword |
      | student46@library   |  Bs1452C |
      |                     | 3lUpdof3 |
      | student4            | b0zgv1ab |
      |          @library   | npSk3tsr |
      |                     |          |



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
    Then the student and librarian should not be able to log in