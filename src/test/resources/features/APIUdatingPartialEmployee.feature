Feature: API Updating Partial Employee

  Background:
    Given a JWT is generated
    Given a request is prepared for creating an employee via more dynamic payload "azeddine" , "sterling" , "ms" , "M" , "2012-09-14" , "normal" , "QA Engineer"
    When a POST call is made to create an employee
    And the employee id "Employee.employee_id" is stored as global variable

  @CreatingEmployeeDynamicPayloadMethod
  Scenario: Creating an employee using more dynamic payload
    Given a request is prepared for creating an employee via more dynamic payload "azeddine" , "sterling" , "ms" , "M" , "2012-09-14" , "normal" , "QA Engineer"
    When a POST call is made to create an employee
    Then the status code for creating an employee is 201
    And the employee created contains key "Message" and value "Employee Created"
    And the employee id "Employee.employee_id" is stored as global variable

  @UpdatePartialEmployeeDetails
  Scenario: UpdatePartial employees Details
    Given a request is preparing for updating Partial of an employee
    When a patch call is made to update partial of an employee
    Then the status code for updating partial of an employee is 201
