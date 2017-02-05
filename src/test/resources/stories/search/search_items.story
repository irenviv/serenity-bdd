Meta: Main functionality

Search by categories

Narrative:
As a user
I want to look for products by various criterias
So that I can find the searched product quickly

Scenario: Product search by variuos categories
Given the user is on the ebay home page
When the user looks up the <searchValue>
And select <category>
And click search button
Then the user should see the list of products that include <searchValue> in the product title
Examples:
|category      |searchValue|
|All Categories|book       |
|Art           |painting   |
|Baby          |TShirt     |


Scenario: Product search (negative case)
Given the user is on the ebay home page
When the user looks up the 'sdgjsklgfjsdflgk39458345384059345034583'
And click search button
Then the user should see error message '[0, results for sdgjsklgfjsdflgk39458345384059345034583]