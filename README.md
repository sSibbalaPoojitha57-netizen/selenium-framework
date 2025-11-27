# Selenium Java Automation Framework (Job-ready)

**What this repo contains**
- Selenium WebDriver + Java (17)
- TestNG
- WebDriverManager (automatic driver handling)
- ExtentReports (basic setup)
- Test Listener with screenshots on failure
- Page Object Model example
- Sample LoginTest

**How to run**
1. Ensure Java 17 and Maven are installed.
2. From project root:
   ```
   mvn clean test
   ```
3. Reports and screenshots will be in `test-output` folder.

**Structure**
- src/main/java - base classes, pages, utils, listeners
- src/test/java - test classes
- pom.xml - Maven config
- testng.xml - TestNG suite
