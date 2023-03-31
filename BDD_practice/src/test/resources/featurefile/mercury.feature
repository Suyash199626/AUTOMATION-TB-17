Feature: flight book on on mercury page
@ab
Scenario: register on mercury page
Given open chrome browser and open mercury website
When click on register page  
And enter first name in first name textbox
And enter last name in last name textbox
And enter phone in phone number textbox
And enter email in email textbox
And enter city in city textbox
And enter state in state textbox
And enter postal code in postal textbox
And enter country in country textbox
And enter username in username textbox
And enter password in password textbox
And enter confirm password in password textbox
And click on submit button 
Then disply success page

@cd
Scenario: sign up on mercury page
Given open chrome browser and open mercury website
When click on sign up page
And enter username in username textbox
And enter password in password textbox
And click on submit button
Then  display success page

@ef
Scenario: flight book on mercury page 
Given after success page 
When click on flight book
And click on trip type
And click on passenger
And click on departure
And click on date 
And click on arriaval
And click on return date
And click on class
And click on airline 
And click on continue
Then disply success page







