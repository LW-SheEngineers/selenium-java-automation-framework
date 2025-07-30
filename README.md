# Selenium Java Automation Framework

## 📌 Overview
This is a Java-based Selenium WebDriver automation testing framework.  
It uses **JUnit 4** as the test runner and follows the **Page Object Model (POM)** for better maintainability.  

The test suite includes:
- Search functionality test
- (Future) Account Page tests
- (Future) Cart Page tests

## 🛠 Tech Stack
- **Java 17+**
- **Selenium WebDriver**
- **JUnit 4**
- **Maven** (optional for dependency management)
- **Firefox (Geckodriver)**

## 📂 Project Structure
src/
main/
java/
pages/        # Page classes (Page.java, AccountPage.java, CartPage.java)
utils/        # Utility classes (DriverManager.java, Links.java)
widgets/      # Reusable components (SearchResults.java)
test/
java/
search/       # Search tests
utils/        # Base test class

## ⚙️ Setup Instructions

### 1️⃣ Install Dependencies
Make sure you have:
- Java 17+
- Firefox browser
- [Geckodriver](https://github.com/mozilla/geckodriver/releases) in `resources/` folder or system PATH

### 2️⃣ Clone the Repository
```bash
git clone https://github.com/YOUR-USERNAME/selenium-java-automation-framework.git
cd selenium-java-automation-framework

3️⃣ Run Tests from Eclipse
	•	Right-click the test class (e.g., SearchTests.java)
	•	Select Run As → JUnit Test

4️⃣ Run Tests from Terminal (Optional - if Maven is used)
