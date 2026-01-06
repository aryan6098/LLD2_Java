# Simple Factory Pattern for Document Processing

## Problem Statement
You are designing a document processing application. Depending on the type of document (e.g., text, spreadsheet, presentation), different processing routines are required. You need a way to create document processors without explicitly specifying their concrete classes, ensuring the application is open for future document types.

---

## Assignment
Your task is to implement the **Simple Factory pattern** to create document processors in the document processing application.  
The Simple Factory pattern provides a way to create objects without exposing the instantiation logic, allowing for easy addition of new document processor types.

---

## Task 1 – Creating a Common Parent Class (Product Hierarchy)
To streamline the creation of document processors, implement a common parent class named **`DocumentProcessor`**.

This class should:
- Act as the base class for all document processors
- Contain attributes common to all processors (e.g., document name)
- Declare common behavior through abstract methods

The method `supportsType()` has already been abstracted out as an example. You must complete the `DocumentProcessor` class so that all document processors inherit from it.

---

## Task 2 – Implementing the Simple Factory
Implement a **`DocumentProcessorFactory`** class that follows the Simple Factory pattern.

The factory should:
- Contain a method to create document processors based on `DocumentType`
- Hide the instantiation logic from the client
- Accept the document name as a parameter when creating a processor
- Return the appropriate `DocumentProcessor` implementation

---

## Instructions
1. Implement the `DocumentProcessor` class as a common parent class for all document processors.
    - Include shared attributes such as the document name.
    - Declare abstract methods for common behavior.

2. Implement the `DocumentProcessorFactory` class.
    - Add a method that creates and returns document processors based on `DocumentType`.

3. Run the provided test cases in the `DocumentProcessorTest` class to verify correctness.
    - The tests will validate:
        - All document processors inherit from the common parent class.
        - The parent class contains a `String` field for the document name.
        - The factory correctly creates document processors based on document type and name.

---

## Outcome
By completing this assignment, you will have:
- Implemented the Simple Factory design pattern
- Centralized object creation logic
- Ensured the system is extensible for future document types
- Passed all structural and behavioral test cases
