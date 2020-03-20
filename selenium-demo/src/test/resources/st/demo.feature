@with_browser
Feature: demo
    Scenario: demo
     Given the base page is accessible
      And I switch to the "Component Reference" tab
      And I search for "datatable" component
      And I click first result under components
      And I select the "with Inline Edit" option
      Then testable outcome
     
 