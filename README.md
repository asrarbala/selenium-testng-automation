```md
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
- ChromeOptions configured for stable execution  

---

## 📂 Project Structure
```
<pre>
src
├── main/java/config
├── test/java
│   ├── pages
│   ├── stepdefinitions
│   ├── hooks
│   ├── runners
│   └── utils
└── test/resources/features
</pre>

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
Framework is CI-ready and can be executed via GitHub Actions using headless browser execution.

---

## 👨‍💻 Author
Asrar Ahmad Bala  
QA Automation Engineer
