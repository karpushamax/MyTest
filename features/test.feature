
Feature: Test scenarios
   


  Scenario: 01_Loading
    
    Given I navigate to ydl page
    When I navigate to WhatWeDo section
    Then WhatWeDo section is visible
    When I navigate to Customers section
    Then Customer section is visible
    
    
  Scenario: 02_Menu
    Given I navigate to ydl page
    When I navigate to WhatWeDo section
    Then we are on whatWeDo page
    When I navigate to Customers section
    Then we are on customers page
    When I navigate to Resources section
    Then we are on Resources page
    When I navigate to About section
    Then we are on About page
    When I navigate to Contact section
    Then we are on Contact page

     
  Scenario: 03_Subscribe to newsletter
    Given I navigate to ydl page
    When I fill email
    Then I see text SubscriptionComplete
    
     
    
    
