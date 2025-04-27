# Automation of Sign-Up and Login Flows

## Overview
This project automates the sign-up and login functionalities of the **[Expand Testing Practice Website](https://practice.expandtesting.com)** using **Selenium WebDriver** with **Java**.

## Tools and Technologies
- **Java** – Programming language
- **Selenium WebDriver** – For browser automation
- **Maven** – For dependency management
- **Page Object Model (POM)** – To structure the test automation code
- **TestNG** (optional in the future) – For running tests and generating reports (if added later)

## Project Structure
- `/src/main/java`: Contains the main code.
  - `/pages`: Contains Page Object classes, e.g., `LoginPage`, `SignUpPage`.
  - `/tests`: Contains test scripts for executing test cases.
  
## How to Run the Tests
1. **Clone the repository**:  
   `git clone https://github.com/konstantinosvlc/Automation.git`

2. **Set up your environment**:
   - Install **Java** and **Maven** on your machine if you haven’t already.
   - Open the project in your IDE (e.g., IntelliJ, Eclipse).

3. **Run the tests**:
   - You can run the tests directly from your IDE or use Maven with the following command:
     ```
     mvn test
     ```

4. **Viewing Test Results**:
   - Results can be found in the `target` folder after running the tests.

## Project Demo
You can view the full source code and ongoing updates here:  
**[GitHub Repository](https://github.com/konstantinosvlc/Automation)**

## Author
Konstantinos VLC

## License
This project is licensed under the MIT License – see the [LICENSE](LICENSE) file for details.
