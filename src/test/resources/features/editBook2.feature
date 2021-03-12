@EditBook2
Feature:

	Background:
		#@PROF-229
		Given the librarian logged in the application
		

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
	@PROF-346 @PROF-364
	Scenario: Book Categories 
		Given the librarian clicked on Books module
		When the librarian clicks Edit Book button
		And the librarian clicks Book Category dropdown
		Then the librarian should see following options
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

	#_6-Librarian can select related category to see all books in that category by using book categories dropdown._
	@PROF-347 @PROF-364
	Scenario: Select book category
		Given the librarian clicked on Books module
		When the librarian click Book Categories dropdown box
		And the librarian select and click one category
		Then the librarian see books related to that category	

	#_7-Librarian can use show records dropdown for getting number of entries depends the dropdown options._
	@PROF-348 @PROF-364
	Scenario Outline: Show book records
		Given the librarian clicked on Books module
		When the librarian should be able to click to show records dropdown box
		And the librarian can select one "<options>" in show records dropdown
		Then the librarian see the exact number of books that he "<selected>"
		Examples:
			| options | selected |
			|    5    |  5       |
			|   10    | 10       |
			|   15    | 15       |
			|   50    | 50       |
			|   100   | 100      |
			|   200   | 200      |
			|   500   | 500      |

	#_8-Librarian can find book by using search box with book's Name and Author._
	@PROF-349 @PROF-364
	Scenario Outline: Search box
		Given the librarian clicked on Books module
		When the user enter "<searchBy>" information
		Then the user should get all the books consist of "<searchBy>"

		Examples:
			| searchBy           |
			| Harry Potter       |
			| War                |
			| Farm               |
			| Don                |
		
		