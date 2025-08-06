# 🚀 Selenium Java Automation Framework with Jenkins Integration

Welcome to my **Java Selenium Automation Framework**! 🎯  
This project was built **from scratch** to demonstrate my skills in **test automation, CI/CD integration, and problem-solving**.

---

## 🛠 Tech Stack
- **Language:** Java ☕
- **Framework:** JUnit 🧪
- **Automation Tool:** Selenium WebDriver 🌐
- **Build Tool:** Maven 📦
- **CI/CD Tool:** Jenkins ⚙️
- **Version Control:** Git & GitHub 🐙

---

## 📌 Project Overview
This framework automates test cases for the [SuperQA Demo Store](http://demostore.superqa.com) 🛒.  
It includes:
- **Page Object Model (POM)** for maintainable code structure 📂
- **Reusable Base Test Class** for setup & teardown ⚡
- **Multiple Test Classes** covering:
  - Search functionality 🔍
  - Login scenarios (valid & invalid) 🔑
  - Cart operations 🛍️

---

## ⚠️ Challenges & How I Overcame Them

Building this framework came with **real-world challenges** that strengthened my skills:

1. **Element Locator Issues** 🔎  
   - Some locators on the demo site changed during testing.  
   - **Solution:** Used multiple locator strategies (XPath, CSS selectors) and implemented waits for dynamic elements.

2. **Test Data Management** 📂  
   - Hardcoding test data made scripts less flexible.  
   - **Solution:** Externalized test data for easier maintenance and scalability.

3. **CI/CD Integration with Jenkins** ⚙️  
   - Initial Jenkins build failed due to missing dependencies.  
   - **Solution:** Configured `pom.xml` properly, ensured all required dependencies were included, and updated Jenkins job to clean & build before execution.

4. **Cross-Browser Compatibility** 🌍  
   - Tests behaved differently in Chrome vs. Firefox.  
   - **Solution:** Added WebDriver configurations to handle multiple browsers.

---

## 🚀 How to Run the Tests

### **1️⃣ Clone the Repository**
```bash
git clone https://github.com/LW-SheEngineers/selenium-java-automation-framework.git

2️⃣ Open in IDE
•	Import as a Maven project in Eclipse or IntelliJ.

3️⃣ Install Dependencies

mvn clean install

4️⃣ Run Tests Locally

mvn test

5️⃣ Run Tests in Jenkins
•	Create a new Jenkins job.
•	Link it to your GitHub repo.
•	Configure build steps to:

mvn clean test

	•	Run the build and view results in Jenkins 📊.

💡 Key Learning Outcomes
•	Gained hands-on experience with framework design principles.
•	Learned to debug & troubleshoot automation issues effectively.
•	Integrated automation scripts into a CI/CD pipeline with Jenkins.
•	Improved ability to adapt to changing application behavior.



