🖥 Selenium Java Automation Framework

📌 Overview

This is a Java-based Selenium WebDriver automation testing framework.
It uses JUnit 4 as the test runner and follows the Page Object Model (POM) design pattern for better maintainability and scalability.

✅ Current Test Coverage 🛠 Tech Stack •	Java 17+ •	Selenium WebDriver •	JUnit 4 •	Maven (optional for dependency management) •	Firefox with Geckodrive •	🔍 Search Functionality Test •	🧾 (Planned) Account Page Tests
•	🛒 (Planned) Cart Page Test

🛠 Tech Stack •	Java 17+
•	Selenium WebDriver
•	JUnit 4
•	Maven (optional for dependency management)
•	Firefox with Geckodriver

📂 Project Structure

selenium-java-automation-framework/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── pages/      # Page classes (Page.java, AccountPage.java, CartPage.java)
│   │   │   ├── utils/      # Utility classes (DriverManager.java, Links.java)
│   │   │   ├── widgets/    # Reusable components (SearchResults.java)
│
│   ├── test/
│       ├── java/
│       │   ├── search/     # Search tests (SearchTests.java)
│       │   ├── utils/      # Base test class (BaseTests.java)
│
└── resources/        # Geckodriver and other test resources

⚙️ Setup Instructions

1️⃣ Install Dependencies

Make sure you have:
•	Java 17+ installed and configured in your PATH
•	Firefox browser installed
•	Geckodriver placed in resources/ or set in your system PATH

3️⃣ Run Tests from Eclipse
1.	Open the project in Eclipse
2.	Right-click the test class (e.g., SearchTests.java)
3.	Select Run As → JUnit Test

4️⃣ Run Tests from Terminal (Optional - if Maven is used)

mvn test


🚀 Future Improvements
•	Add Account Page test cases
•	Add Cart Page test cases
•	Integrate with Jenkins CI/CD pipeline
•	Generate Allure Reports for test execution results

⸻

🤝 Contributing

Contributions are welcome! 🚀
	1.	Fork the repository
	2.	Create a new branch for your feature or bug fix
	3.	Commit your changes
	4.	Push to your branch and submit a Pull Request

	
