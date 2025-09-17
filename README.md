# Emplyze - Employee Data Analyzer System

Emplyze is a **Java-based Employee Data Analyzer System** that allows efficient management and analysis of employee data such as names, departments, and salaries.  
This project demonstrates core Java concepts like **Object-Oriented Programming (OOP), Exception Handling, Multithreading, and Data Manipulation** in a structured way.

---

## 🚀 Features
- Add and manage employee details (ID, name, department, salary).
- Retrieve and display employee records.
- Filter and sort employees based on different criteria.
- Process employee data concurrently using **multithreading**.
- Handle errors gracefully with **custom exceptions**.

---

## ⚙️ Working of the System
1. **Employee Class (`Employee.java`)**  
   Represents an employee’s details such as ID, name, department, and salary.

2. **Employee Manager (`EmployeeManager.java`)**  
   Provides functionalities to add, fetch, filter, and sort employees.

3. **Employee Processor (`EmployeeProcessor.java`)**  
   Uses multithreading to process employee data in separate threads for better efficiency.

4. **Custom Exception (`EmployeeNotFoundException.java`)**  
   Handles cases where employee data is not found.

5. **Main Analyzer (`EmployeeDataAnalyzer.java`)**  
   The entry point of the project, integrates all components and demonstrates the system workflow.

---

## 🛠️ Concepts Used
- **Object-Oriented Programming (OOP)**
- **Collections Framework**
- **Exception Handling (Custom Exception)**
- **Multithreading**
- **Data Filtering & Sorting**

---
## 📂 Project Structure

Emplyze/
├── src/
│ ├── Employee.java
│ ├── EmployeeManager.java
│ ├── EmployeeProcessor.java
│ ├── EmployeeNotFoundException.java
│ └── EmployeeDataAnalyzer.java
└── README.md
---


## ▶️ How to Run
1. Clone this repository:
   ```bash
   git clone https://github.com/your-username/Emplyze.git
2. Open the project in your preferred IDE (e.g., IntelliJ IDEA, Eclipse, VS Code).

3. Compile and run the main class:
javac EmployeeDataAnalyzer.java
java EmployeeDataAnalyzer

📖 Learning Outcomes

Understanding OOP principles in Java.

Implementing multithreading for concurrent execution.

Creating and using custom exceptions.

Performing data manipulation (filtering, sorting, managing collections).

📜 License

This project is licensed under the MIT License – see the LICENSE
 file for details.

 👨‍💻 Author

Aman Manwatkar
