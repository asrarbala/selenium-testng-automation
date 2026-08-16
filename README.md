
# Selenium Cucumber TestNG Automation Framework

## 📌 Overview
This project is a UI test automation framework built using Selenium WebDriver, Cucumber (BDD), and TestNG.  
It follows the Page Object Model (POM) design and demonstrates data-driven testing, tagging strategies, and CI-ready execution.

The framework automates the SauceDemo application to simulate real-world e-commerce user flows.

---

## 🛠 Tech Stack
- Java  
- Selenium WebDriver  
- Cucumber (BDD)  
- TestNG  
- Maven  
- WebDriverManager  
- GitHub Actions (CI-ready)

---

## 🏗 Framework Design
- Page Object Model (POM)  
- Cucumber BDD structure  
- DriverFactory for browser management  
- Hooks for setup/teardown  
- Explicit waits for stability  
- ChromeOptions configured for stable local execution and headless CI execution

---
## 📂 Project Structure
```text
src
├── main
│   └── java
│       └── config              # DriverFactory, ConfigReader
│
├── test
│   ├── java
│   │   ├── hooks               # Cucumber hooks
│   │   ├── pages               # Page Object classes
│   │   ├── runners             # Test runners
│   │   ├── stepdefinitions     # Step definitions
│   │   └── utils               # Utility classes
│   │
│   └── resources
│       ├── config              # config.properties
│       └── features            # Cucumber feature files
```

---

## ✅ Features Covered
- Login (valid & invalid scenarios)  
- Add product to cart  
- Checkout flow (end-to-end purchase)  
- Scenario Outline for data-driven tests  
- Smoke & Regression tagging strategy  

---

## 🏷 Tag Strategy
- `@smoke` → Critical user journeys  
- `@regression` → Full test suite  

---

## ▶️ How to Run Tests

Run all tests:
```

mvn clean test

```

Run smoke tests:
```

mvn test -Dcucumber.filter.tags="@smoke"

```

Run regression suite:
```

mvn test -Dcucumber.filter.tags="@regression"

```

---

## 📊 Reporting
Cucumber HTML reports are generated at:
```

target/cucumber-report.html

```

---

## 🚀 CI Integration
Integrated with GitHub Actions for automated test execution.

Features:
- Headless browser execution in CI
- Maven-based test execution
- Automated runs on push/pull requests
- HTML report generation as CI artifacts
---

## 👨‍💻 Author
Asrar Ahmad Bala  
QA Engineer
