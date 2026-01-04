# Prototype Pattern for Object Cloning in Testing

## Problem Statement

You are developing a testing framework for a user API of a social media platform. Each test case requires generating multiple mock users with different attributes to simulate various scenarios. Creating these mock users involves complex setup logic and is time-consuming. To optimize the user creation process during testing, the Prototype pattern is introduced.

The Prototype pattern allows prototype objects to be created once and then cloned as needed, eliminating the overhead of repeatedly constructing complex user objects.

---

## Assignment

The objective of this assignment is to implement the Prototype pattern to support efficient cloning of mock user objects within the testing framework.

You are required to define a cloning interface and implement it in user objects. Additionally, you must create a registry to manage user prototypes and facilitate cloning based on user type. This approach streamlines the process of generating mock users for testing scenarios.

---

## Implementing the Prototype Pattern

### Define the ObjectClonable Interface

Create an interface named `ObjectClonable` that declares a `clone()` method. This method should return a cloned copy of the implementing object. All objects intended to be cloned must implement this interface.

### Implement the User Object

Implement the `User` class with attributes such as `userId`, `username`, `email`, `displayName`, `age`, and `type`. The `User` class must implement the `ObjectClonable` interface and provide a proper implementation of the clone method that performs a deep copy of the user object.

### Define the UserPrototypeRegistry Interface

Create an interface named `UserPrototypeRegistry` that defines methods for managing user prototypes. This interface should include methods for adding user prototypes, retrieving prototypes by user type, and cloning user objects.

### Create the Registry Implementation

Implement a concrete class that adheres to the `UserPrototypeRegistry` interface. This class should maintain a collection of user prototypes and provide functionality to add new prototypes, retrieve existing ones, and create cloned user instances based on their type.

### Test Your Implementation

Write test cases to verify that the `User` class correctly implements the `ObjectClonable` interface and that the registry implementation properly manages user prototypes. Ensure that cloning a user produces a new object with identical attribute values while confirming that the cloned object is a distinct instance in memory.
