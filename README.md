# Sports Club System

## Overview

Sports Club System is a computerized system developed in Java to manage the operations and transactions of
Sports Club.
The system is designed to handle various aspects of the club, including member registration, sports
details, store management, financial transactions, and reporting.

## System Features

### 1. Member Management

- **Registration:** Capture details such as full name, gender, date of birth, contact details, sub-counties, school or
  college, and other relevant information during registration.
- **Membership Fee:** Calculate and manage individual and group membership fees.

### 2. Sports Management

- **Sports Details:** Maintain details of sports offered by the club.
- **Categorization:** Categorize members into minors, middle group, and seniors based on their ages.

### 3. Store Management

- **Item Listing:** Provide a list of sporting items available for purchase.
- **Pricing:** Assign prices to each item and offer discounts for purchases exceeding KSh 10,000.
- **Stock Management:** Keep track of stock levels, and alert management when stock drops to 20%.

### 4. Financial Transactions

- **Membership Fee Calculation:** Compute total membership fees.
- **Discount Calculation:** Calculate discounted prices for items.
- **Total Amount Calculation:** Compute the total amount for items bought.
- **Facilitation Fee Calculation:** Calculate facilitation fees for sports events.
- **Commission Calculation:** Determine patrons' commission.
- **Surcharged Fee Calculation:** Calculate surcharged fees for lost or damaged equipment.
- **Total Income Calculation:** Compute the total income for the club.

### 5. Reporting

Generate reports on various aspects, including member details, sports information, store inventory, financial
transactions, and overall club performance.

## System Requirements

- Java Development Kit (JDK 21)
- Integrated Development Environment (IDE) such as IntelliJ IDEA
- MongoDB Database (for data persistence)
- Java Database Connectivity (JDBC) driver for MongoDB

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/Gideon-Yebei/MongoDB-JAVA-CLUB-SYSTEM.git
2. Open the project in your preferred Java IDE.
3. Run the application.
4. Default credentials `username: admin` and `password: admin`

## Usage

1. Run the application to access the main menu.
2. Navigate through the menu to perform various functions, such as member registration, item purchase, financial
   calculations, and report generation.

## Contributing

Contributions are welcome!
If you have suggestions, feature requests, or bug reports, please open an issue or submit a
pull request.

## License

This project is licensed under the MIT License.


<h1 align="center">Sports Club System With MongoDB Atlas Database</h1>

## Table of Contents

- [Introduction](#introduction)
- [System Description](#system-description)
- [System Requirements](#system-requirements)
- [System Design](#system-design)
- [Implementation](#implementation)
- [Testing](#testing)
- [How to Run the System](#how-to-run-the-system)
- [Future Enhancements](#future-enhancements)

## Introduction

Technology we use:

- JAVA + JDBC library (MongoDB)
- MongoDB Atlas ~ remote database
- Intellij Idea Ultimate

## System Description

The Maringo Sports Club Management System is designed to manage and streamline the club's operations effectively.
It
offers features and functionalities for various aspects of the club's activities, including:

1. **Membership Management**: The system maintains detailed records of club members, categorizing them into minors,
   middle group, and seniors based on their ages.
   It also stores information such as full name, gender, date of birth,
   and more.

2. **Sports Activity Management**: The system keeps track of the various sports activities offered by the club.

3. **Store Management**: The system manages sports equipment available for purchase, including their prices, initial
   stock levels, and maximum stock levels.
   It also tracks item purchases and reordering when stock levels drop to 20%.

4. **Facilitation Fees**: The system records facilitation fees for sports events, which are payable by team members.

5. **Financial Calculations**: It computes various financial aspects such as the total membership fees, discounted
   prices for item purchases exceeding Ksh 10,000, the total amount for items bought, surcharged fees for lost or
   damaged equipment, facilitation fees, patrons' commissions, and the total income for the club.

6. **Reporting**: The system generates appropriate reports for club management and decision-making.

## System Requirements

To run and use the Maringo Sports Club Management System, you will need the following:

- **Java Development Kit (JDK)**: The system is developed in Java, so you need a compatible JDK to execute the code.

- **Database (e.g., MariaDB/MySQL)**: The system uses a database to store and manage member data, sports activities,
  store items, facilitation fees, and other relevant information.

- **IDE (e.g., Eclipse, IntelliJ IDEA)**: An Integrated Development Environment is recommended for Java application
  development.

- **Java Libraries (JDBC)**: Libraries for database connectivity are required to connect the system with the database.

- **Dependencies (e.g., JDBC Driver for MariaDB/MySQL)**: Specific dependencies might be needed based on the database
  used.

## System Design

The system follows a modular design, with components for managing members, sports activities, store items, facilitation
fees, and financial calculations.
It also includes a graphical user interface (GUI) for user interaction.

### Database Schema

A NoSQL database schema is designed to store information about members, sports activities,
store items, purchases, facilitation fees, patrons, game captains, and equipment surcharges.

`MongoDB Atlas`

## Implementation

The system is implemented using Java, utilizing JDBC for database connectivity.
It incorporates object-oriented
programming principles and follows best practices for code organization, including classes and methods for each system
component.
The GUI is built using Swing for user-friendly interaction.

## Testing

The system should undergo comprehensive testing, including unit testing and integration testing.
Test cases should be
developed to ensure the system functions correctly and meets the specified requirements.
This involves testing
membership management, sports activity management, store management, financial calculations, and reporting.

## How to Run the System

To run the system:

1. Ensure you have a compatible JDK and an IDE.
2. Ensure you have a stable internet connection for database connectivity
    - MongoDB Atlas as a database
3. Compile and execute the main application.

Please note that detailed instructions for running the system and configuring the database are provided within the
system documentation.

## Future Enhancements

For future improvements, include adding user authentication and authorization features for data security, enhancing the
reporting capabilities, and expanding the system to support more advanced data analysis.

By implementing the Sports Club Management System, the club aims to streamline its operations, manage resources
efficiently, and provide an organized platform for promoting sports and talent development among the youth in Maringo
County.
