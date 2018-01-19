
Feature: Test scenarios
   


  Scenario: 01_Loading
    
    Given I navigate to webpage
    Then I see section Latest_News
   	When I click on About link 
   	Then I can see page title is About
   	When I click on Service link 
   	Then I can see page title is Service   
   	When I click on Work link 
   	Then I can see page title is Work 
    When I click on Contact link 
    Then I can see offices
    
    
