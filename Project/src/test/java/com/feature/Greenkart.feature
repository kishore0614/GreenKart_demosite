Feature: GreenKart Automation

Scenario: User buy some vegetable in GreenKart
Given User Launch the url
When User Click the add to cart button(beetroot)
And User Click the add to cart button(carrot)  
And User Click the items
And User Click the Proceed to CheckOut
Then Next page shown


Scenario: User Placed the Order

When User enter promo code
And User click the apply botton
And User Click the Place Order
Then Next Page Shown1


Scenario: Last Page Of Application

When User Select the Country
And User Click the Agree button
And User Click the Proceed