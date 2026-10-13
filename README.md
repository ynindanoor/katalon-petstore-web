# katalon-petstore-web

## Project Overview
This project contains web automation test cases for the login functionality of the JPetStore Demo Website (https://petstore.octoperf.com/actions/Catalog.action). The automation is developed using Katalon Studio with Hybrid Mode (Manual + Script) to validate login functionality using positive and negative test scenarios.

## Objectives
- Automate login functionality using Katalon Studio.
- Use Hybrid Mode (Manual + Script).
- Implement positive and negative test scenarios.
- Apply Data-Driven Testing (DDT).
- Use Global Variables for login credentials and avoid hardcoding credentials.
- Execute all test cases through a Test Suite.
- Generate an execution report after the Test Suite finishes.
- Create test steps manually without using Record Web.

## Test Scenarios
| Test Case ID |                  Test Scenario                   |   Type   |
|    TC001     | Login with valid username and password           | Positive |
|    TC002     | Login with invalid username and valid password   | Negative |
|    TC003     | Login with valid username and empty password     | Negative |
|    TC004     | Login with empty username and valid password     | Negative |
|    TC005     | Login with invalid username and invalid password | Negative |

## Testing Approach
### 1. Hybrid Mode (Manual + Script)
Test cases are created using Katalon Studio's Manual view and Script view.
- **Manual view:** Defines test steps using Katalon keywords and test objects.
- **Script view:** Uses Groovy scripting for custom logic, data processing, and assertions.
All test steps are created manually. The Record Web feature is not used.

### 2. Data-Driven Testing (DDT)
External test data is used to execute the login test case with different combinations of usernames and passwords.

| Username | Password | Expected Result |
|---|---|---|
| Valid username | Valid password | Login succeeds |
| Invalid username | Valid password | Validation or login rejection |
| Valid username | Empty password | Login is rejected |
| Empty username | Valid password | Login is rejected |
| Invalid username | Invalid password | Validation or login rejection |

The test data can be stored in a Excel file and connected to the test case using Katalon's Test Data Binding.

### 3. Global Variables
A Global Variable named baseUrl is used to store the application's base URL and avoid hardcoding the URL in test scripts.

Example:
GlobalVariable.baseUrl

The variable is configured in Katalon Studio under Profiles and referenced whenever the application URL is required.

### 4. Test Suite Execution
All login test cases are grouped into a Test Suite.
The Test Suite is used to execute the test cases in one run and collect their results.

### 5. Execution Report
After the Test Suite finishes, Katalon Studio generates execution results containing test statuses, errors, and execution details.
The report is used to evaluate the test results and investigate failed test cases.

## How to Run the Tests
1. Clone or download the repository.
2. Open the project in Katalon Studio.
3. Configure the baseUrl Global Variable in the execution profile.
4. Verify the test data and Test Data Binding.
5. Select the target browser and click Run.
6. Review the execution results and generated report.

## Limitations
- The project focuses only on login functionality.
- Test results depend on the availability and behavior of the demo application.
- Valid login testing requires an appropriate test account.
- Actual execution results are not included until the Test Suite has been executed.

## Conclusion
This project demonstrates login web automation using Katalon Studio, Hybrid Mode (Manual + Script), Data-Driven Testing, Global Variables, and Test Suite execution. The goal is to create reusable and maintainable test cases while validating both successful and unsuccessful login attempts.

## Disclaimer
This project is intended for educational and demonstration purposes only.
