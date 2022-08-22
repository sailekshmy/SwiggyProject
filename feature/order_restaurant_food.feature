
Feature: Swiggy Food Order

@TC_102
Scenario: Order food from swiggy

Given user is in the landing page of swiggy

When user clicks on  'Bangalore , Karnataka, India' hyperlink

And click on search bar
And enter 'BTM' restaurant on search bar
And hover over 'BTM Layout' and click
And Click on the first restaurant on the next page
And Click 'Add' on the first item of the restaurant page
And Click 'Checkout' button

Then Verify you are on Checkout page by verifying the text ‘SECURE CHECKOUT’. 
