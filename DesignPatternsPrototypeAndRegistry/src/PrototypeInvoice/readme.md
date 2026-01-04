# Prototype Pattern for Efficient Invoice Generation

## Problem Statement

You are tasked with creating an API for invoice generation and testing. During testing, generating invoices from scratch requires fetching data from a database, which is time-consuming, as retrieving a single invoice can take several seconds. When a large number of invoices are required for testing, this approach becomes inefficient and impractical.

To optimize the testing process, the Prototype pattern is introduced. This pattern enables the creation of prototype invoice objects that can be cloned efficiently, significantly reducing the time and resources required for invoice generation during testing.

---

## Assignment

The objective of this assignment is to implement the Prototype pattern to create prototype invoice objects for efficient testing. You are required to define a cloning interface and implement it in invoice objects. Additionally, you must create a registry that manages invoice prototypes and supports cloning operations.

The primary goal is to streamline the process of generating invoices for testing, making it faster and more resource-efficient.

---

## Implementing the Prototype Pattern

### Define the ObjectClonable Interface

Create an interface named `ObjectClonable` that declares a single method, `clone()`, which returns a cloned copy of the implementing object.

### Implement the Invoice Object

Implement the `Invoice` class with attributes such as `invoiceId`, `customerName`, `amount`, `dueDate`, and `invoiceType`. The `Invoice` class must implement the `ObjectClonable` interface and provide a proper implementation of the clone method that performs a deep copy of the invoice object.

### Define the InvoicePrototypeRegistry Interface

Create an interface named `InvoicePrototypeRegistry` that defines methods for managing invoice prototypes. This interface should include methods for adding invoice prototypes, retrieving prototypes by invoice type, and cloning invoice objects.

### Create the Registry Implementation

Implement a concrete class that adheres to the `InvoicePrototypeRegistry` interface. This class should manage a collection of invoice prototypes and provide functionality to add prototypes, retrieve them by type, and create cloned invoice instances based on their type.

### Test Your Implementation

Write test cases to verify that the `Invoice` class correctly implements the `ObjectClonable` interface and that the registry implementation properly manages invoice prototypes. Ensure that cloning an invoice results in a new object with identical attribute values while confirming that the cloned object is a distinct instance in memory.
