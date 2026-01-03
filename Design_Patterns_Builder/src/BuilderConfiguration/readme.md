# Builder Pattern Implementation for a Database Configuration Class

## Problem Statement

You are tasked with creating a system-wide database configuration for a complex software suite. This configuration is responsible for managing various settings that affect the data layer. To ensure a flexible, readable, and immutable way of creating configuration instances, the Builder pattern is used.

---

## Assignment

The objective of this assignment is to implement the Builder pattern to create instances of a database configuration manager class. The Builder pattern enables step-by-step construction of complex objects while keeping the creation logic separate from the main object.

---

## Implementing the Builder Pattern

### Review the Original Class

You are provided with a class named `DatabaseConfiguration` that represents the database configuration. This class contains multiple properties used to configure the database connection. Your task is to implement the Builder pattern to create instances of a class with the same properties.

### Create the Builder Class

Create a new class annotated with the `@WithBuilder` annotation. This class should implement the Builder pattern for constructing database configuration instances. A dummy class is provided to help you get started. The class name is not important, as long as it is annotated with `@WithBuilder`.

### Test Your Implementation

A test case is provided to verify your implementation. Run the test case to ensure that your Builder pattern implementation is correct. The test framework will automatically select the correct builder implementation based on the presence of the `@WithBuilder` annotation.
