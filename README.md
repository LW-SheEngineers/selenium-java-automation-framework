# 🚀 Selenium Java Automation Framework

---

## 📌 Overview
This is a **Java-based Selenium WebDriver automation testing framework** built using the **Page Object Model (POM)** for better maintainability and scalability.  
The framework includes:
- ✅ Search functionality test
- 🔜 Account Page tests (future)
- 🔜 Cart Page tests (future)

This project is integrated with **Jenkins CI/CD** for automated builds and tests whenever code is pushed to GitHub.

---

## 🛠 Tech Stack
- Java 17+
- Selenium WebDriver
- JUnit 4
- Maven
- Firefox (Geckodriver)
- Jenkins
- GitHub

---

## 📂 Project Structure

selenium-java-automation-framework/
src/
  main/
    java/
      pages/        # Page classes (Page.java, AccountPage.java, CartPage.java)
      utils/        # Utility classes (DriverManager.java, Links.java)
      widgets/      # Reusable components (SearchResults.java)
  test/
    java/
      search/       # Search tests (SearchTests.java)
      utils/        # Base test class
resources/          # Geckodriver and other resources
README.md
pom.xml             # Maven configuration file└── README.md

---

## ⚙️ Setup Instructions

### 1️⃣ Install Dependencies
Make sure you have:
- Java 17+
- Maven
- Firefox browser
- Geckodriver (inside `resources/` folder or in system PATH)

### 2️⃣ Clone the Repository
git clone https://github.com/YOUR-USERNAME/selenium-java-automation-framework.git  
cd selenium-java-automation-framework

### 3️⃣ Run Tests in Eclipse
- Open the project in Eclipse
- Right-click on the test class (e.g., SearchTests.java)
- Select Run As → JUnit Test

### 4️⃣ Run Tests from Terminal (Maven)
mvn clean test

---

## 🔄 CI/CD Pipeline with Jenkins
This framework is configured to run automatically in Jenkins when code is pushed to GitHub.

---

### Step 1 – Install Jenkins Plugins
Go to **Manage Jenkins → Plugins → Available** and install:
- Git Plugin
- GitHub Plugin
- Maven Integration Plugin  

📸 – Installed Plugins page

---

### Step 2 – Create a Jenkins Job
1. Click **New Item** → Select **Freestyle Project**
2. Name it (e.g., Selenium-Java-Automation)
3. Under **Source Code Management**, select Git and paste your repo URL:
   https://github.com/YOUR-USERNAME/selenium-java-automation-framework.git
4. Add GitHub credentials using your **Personal Access Token**.

📸– Job Configuration with GitHub repo

---

### Step 3 – Configure Maven Build
- Go to **Build Steps**
- Select **Invoke top-level Maven targets**
- Set:
  Goals: clean test

📸Maven Build Step

---

### Step 4 – Build the Job
- Click **Build Now**
- Check **Console Output**
- ✅ Expect **BUILD SUCCESS**

📸Successful Build


## 📊 Pipeline Flow Diagram
       ┌───────────────┐
       │   Developer   │
       │   pushes to   │
       │   GitHub      │
       └──────┬────────┘
              │  Webhook Trigger
              ▼
       ┌───────────────┐
       │   Jenkins     │
       │  Pull Latest  │
       │   Code        │
       └──────┬────────┘
              │  Run Maven Build & Tests
              ▼
       ┌───────────────┐
       │   JUnit       │
       │ Test Results  │
       └──────┬────────┘
              │  Build Status
              ▼
       ┌───────────────┐
       │  SUCCESS /    │
       │   FAILURE     │
       └───────────────┘

---

##👩🏾‍💻 Author
Laniqua Webster  
🐙 GitHub: https://github.com/LW-SheEngineers
