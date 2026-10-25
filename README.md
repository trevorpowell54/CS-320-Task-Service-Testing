# CS 320 Portfolio Artifacts: Task Service Testing

## Overview

This repository contains my CS 320 Task Service project. It demonstrates my experience with Java programming, object-oriented design, input validation, and automated unit testing using JUnit.

The task service allows tasks to be created, stored, retrieved, updated, and deleted while enforcing requirements for task IDs, names, and descriptions.

### Project Files

- **`Task.java`** — Defines the task object and validates its information. Task IDs cannot be changed, task names cannot exceed 20 characters, and descriptions cannot exceed 50 characters.
- **`TaskService.java`** — Manages tasks using a `HashMap`. It supports adding, retrieving, updating, and deleting tasks while preventing duplicate task IDs.
- **`TaskTest.java`** — Contains unit tests for task creation, input validation, and updating task names and descriptions.
- **`TaskServiceTest.java`** — Contains unit tests for service operations, including adding tasks, preventing duplicate IDs, deleting tasks, and updating task information.

## Portfolio Reflections

### 1. How can I ensure that my code, program, or software is functional and secure?

I can ensure that my code is functional and secure by validating input, writing unit tests, and checking that the program meets its requirements. In this project, I used JUnit tests to verify that tasks could be created with valid information and that invalid information was rejected. For example, I tested null task IDs, task IDs that exceeded the character limit, and names and descriptions that were too long. I also tested service operations to make sure duplicate task IDs were rejected, and that attempts to update or delete tasks that did not exist were handled correctly. These tests helped me verify that the program behaved as expected and handled invalid situations appropriately. In future projects, I will continue testing my code throughout development and reviewing it for potential security and reliability issues.

### 2. How do I interpret user needs and incorporate them into a program?

I interpret user needs by reviewing the requirements and identifying what the program must accomplish. I then use those requirements to guide my code and create tests to verify that the program behaves correctly. In this project, tasks had specific requirements for their IDs, names, and descriptions. Task IDs had to be unique and could not be changed, names could not exceed 20 characters, and descriptions could not exceed 50 characters. I incorporated these rules into the `Task` and `TaskService` classes and wrote tests to check that valid information was accepted and invalid information was rejected. This experience taught me that understanding requirements before and during development helps ensure that the finished program meets the user's expectations.

### 3. How do I approach designing software?

My approach to designing software is to understand the requirements first, break the problem into smaller parts, and decide what responsibilities each part should handle. In this project, the `Task` class represents individual tasks and validates their information, while the `TaskService` class manages task operations such as adding, updating, retrieving, and deleting tasks. Separating these responsibilities makes the code easier to understand, test, and maintain. I also consider testing an important part of the design process rather than something that should only happen at the end. By testing individual classes and service methods, I can identify problems and make corrections before they become larger issues. I will continue using organized code, clear requirements, and appropriate testing strategies in future software development projects.

## What I Learned

This project helped me strengthen my understanding of Java programming, object-oriented design, input validation, and automated unit testing. I learned how to use JUnit to test successful operations as well as situations where the program should reject invalid information. I also gained experience testing service methods and verifying that task information could be managed according to the requirements. These skills will help me develop more reliable and maintainable software in future projects.

## Technologies Used

- Java
- JUnit 5
- Object-oriented programming
- Automated unit testing
- Input validation
- Java Collections Framework (`HashMap`)

## Portfolio Purpose

This project is part of my computer science portfolio and demonstrates my ability to develop a Java task management service, apply validation rules, and write automated tests to verify software behavior. It showcases the programming and software quality assurance skills I developed in CS 320.
