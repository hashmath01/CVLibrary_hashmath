Feature: JobSearch
  @smoke
  Scenario: Search for Job by Job title
    Given User open the "Chrome" browser
    And User visits the CV Library website
    When User search for "Test Automation" role by job title
    Then All the search result should display relevant to "Test Automation" job role

  Scenario: Search for Job by location
    Given User open the "Chrome" browser
    And User visits the CV Library website
    When User search for job roles by location "London"
    Then All the search result should display relevant to "London" location

  Scenario: Search for Job by Type
    Given User open the "Chrome" browser
    And User visits the CV Library website
    And User clicks on Search more options to get more options
    When User selects "Permanent" job type
    Then All the search result should display relevant to "Permanent" by job type

