Earning Frequent Flyer points from flights

Narrative:
In order to encourage travellers to book with Flying High Airlines more frequently
As the Flying High sales manager
I want travellers to earn Frequent Flyer points when they fly with us

Meta:
@tags component:payments earning_points

Scenario: Earning standard points from an Economy flight
Given the flying distance between Sydney and Melbourne is 878 km
And I am a standard Frequent Flyer member
When I fly from Sydney to Melbourne
Then I should earn 439 points
And I should earn 25 status points

Scenario: Earning extra points on flights based on the cabine category
Given the flying distance between Sydney and Melbourne is 878 km
And I am a standard Frequent Flyer member
When I fly from Sydney to Melbourne in Business class
Then I should earn 878 points
And I should earn 50 status points

Scenario: Earning extra points on flights based on frequent flyer status
Given the flying distance between Sydney and Melbourne is 878 km
And I am a Silver Frequent Flyer member
When I fly from Sydney to Melbourne on 01/01/2013 at 09:00
Then I should earn 439 points
And I should earn 200 member bonus points

Scenario: Earning points on partner flights
Given the flying distance between Sydney and Melbourne is 878 km
And I am a standard Frequent Flyer member
When I fly from Sydney to Melbourne on 01/01/2013 at 09:00
Then I should earn 439 points
