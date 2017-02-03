Meta:

Toolbar Navigation to product categories

Narrative:
As a user
I want to buy products
So that I can navigate to appropriate category via toolbsr

Scenario: Navigate to appropriate category via toolbsr
Given the user is on the ebay home page
When user navigate to <category> category
Then user is redirected to <category> page
Examples:
|category          |
|Fashion           |
|Electronics       |
|Collectibles & Art|
|Home & Garden     |
|Sporting Goods    |
|Motors            |
|Daily Deals       |