# Selenium Automation Framework

A structured and maintainable Selenium Test Automation Framework built using Java, TestNG, Maven, WebDriverManager, and Page Object Model (POM) design pattern.

This framework supports functional UI testing with clean reporting, utilities, and proper test management.

## Features
- Selenium WebDriver for browser automation
- TestNG for test execution and reporting
- Page Object Model (POM) design pattern
- Extent Reports for HTML reporting
- WebDriverManager for automatic driver setup
- Utilities for screenshots and reporting
- Listeners for capturing failures
- Maven for build and dependency management

## Project Structure
selenium-framework
│
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── base
│   │   │   ├── pages
│   │   │   ├── utils
│   │   │   └── listeners
│   │   └── resources
│   └── test
│       ├── java
│       │   └── tests
│       └── resources
│
├── pom.xml
├── testng.xml
├── .gitignore
└── README.md

## Tech Stack
- Java
- Selenium WebDriver
- TestNG
- Maven
- Extent Reports
- WebDriverManager
- Page Object Model (POM)

## How to Run Tests
Run all tests:
mvn clean test

Run tests in Chrome:
mvn clean test -Dbrowser=chrome

Run tests in Firefox:
mvn clean test -Dbrowser=firefox

## Reports
HTML reports are generated after execution.  
Report location may be:
- test-output/
- ExtentReports/

## Example Test
@Test
public void loginTest() {
    LoginPage login = new LoginPage(driver);
    login.enterUsername("admin");
    login.enterPassword("password");
    login.clickLogin();
}

## Future Enhancements
- Add DataProvider for test data
- Add configuration reader
- Add CI pipeline (GitHub Actions)
- Add parallel and cross-browser execution
- Add Docker + Selenium Grid support

## Author
sSibbalaPoojitha57-netizen
GitHub Profile: https://github.com/sSibbalaPoojitha57-netizen
