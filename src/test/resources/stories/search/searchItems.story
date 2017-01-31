Meta: Main functionality

Searching

Narrative:
As a user
I want to look for products by various criterias
So that I can find the searched product quickly

Scenario: Search product in all categories
Given the user is on the ebay home page
When the user looks up the 'book'
And select "All categories"
Then the user should see the list of products that include 'book' in the name and are available to buy