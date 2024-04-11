Feature: Pharmeasy pacakge functionality

Background:
					Given the user in health package functionality
					
Scenario: i am on the pharmeasy home page
					When i click on tab labtest
					And i select health package option
					And i select any one package 
					And i select patient
					And i click view cart
					And i click remove option
					And i click yes option
					Then Your cart is empty, please add Tests/Packages to proceed. should be displayed

Scenario: Add a personal care product to the cart
    Given I navigate to the "Personal Care" category
    When I select a product
    And I add the product to my cart

Scenario: Sort products by Discount
    When User navigate to the "Mother and Baby Care" category
    Then User select the sort by discount
