# Builder Pattern Implementation for Building Queries

## Problem Statement

You are tasked with developing a database management system that involves creating and executing SQL queries. Queries can vary in complexity, involving different `SELECT` clauses, `JOIN` operations, `WHERE` conditions, and other SQL components. The current approach of constructing queries using string concatenation is error-prone, difficult to read, and challenging to modify.

To address these issues, the Builder pattern should be implemented to create query objects with various configurations, resulting in more maintainable, readable, and flexible code.

---

## Assignment

The objective of this assignment is to implement the Builder pattern to construct query objects with different configurations. The Builder pattern enables step-by-step construction of complex objects while keeping the creation logic separate from the main object.

---

## Implementing the Builder Pattern

### Review the Original Class

You are provided with a class named `Query`, which represents SQL queries composed of multiple components. Your task is to implement the Builder pattern to create instances of a class with the same properties as the `Query` class.

### Create the Builder Class

Create a new class annotated with the `@WithBuilder` annotation. This class should implement the Builder pattern and allow flexible construction of query objects. A starter class is provided to help you begin. The name of the class is not important, as long as it is annotated with `@WithBuilder`.

### Test Your Implementation

Test cases are provided to verify the correctness of your implementation. Run the test cases in the `QueryBuilderTest` class to ensure that your Builder pattern implementation works as expected.

---

## Instructions

- Create a new class annotated with the `@WithBuilder` annotation.
- Implement the Builder pattern within your `QueryBuilder` class.
- Execute the provided test cases in the `QueryBuilderTest` class to validate your implementation.
