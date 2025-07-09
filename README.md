# 🧬 All Types of Inheritance in Java - Object Oriented Programming

Welcome to this Java project demonstrating **all types of inheritance** in **Object-Oriented Programming (OOP)**. This repository is designed to help learners understand how inheritance works in Java with clear examples and organized code files.

## 📚 Table of Contents

- [Overview](#overview)
- [Types of Inheritance Covered](#types-of-inheritance-covered)
- [Project Structure](#project-structure)
- [Getting Started](#getting-started)
- [Code Examples](#code-examples)
- [Contributing](#contributing)
- [License](#license)

---

## 🧩 Overview

Inheritance is a key concept in OOP that allows a class to acquire the properties and methods of another class. This project illustrates **different types of inheritance** in Java with real code examples.

Java supports:

- Single Inheritance
- Multilevel Inheritance
- Hierarchical Inheritance

> ⚠️ Java does **not** support multiple inheritance through classes, but it supports it through **interfaces**, which is also covered.

---

## 🧠 Types of Inheritance Covered

1. **Single Inheritance**  
   A class inherits from one superclass.

2. **Multilevel Inheritance**  
   A class inherits from a derived class which in turn inherits from another class.

3. **Hierarchical Inheritance**  
   Multiple classes inherit from a single superclass.

4. **Multiple Inheritance via Interfaces**  
   A class implements multiple interfaces.

---

## 🚀 Getting Started

To run any of the inheritance examples:

1. Clone the repository:
   ```bash
   git clone https://github.com/Zion-O-create/All-types-of-INHERITANCE-in-Java-Object-Oriented-Programming.git
   cd All-types-of-INHERITANCE-in-Java-Object-Oriented-Programming
   ```

2. Compile and run the desired file:
   ```bash
   Main.java
   java SingleInheritance
   ```

Repeat for other files like `Animal.java`, etc.

---

## 🧪 Code Examples

Here’s a quick look at **Single Inheritance**:

```java
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();   // Inherited method
        d.bark();  // Own method
    }
}
```

Output:
```
This animal eats food.
The dog barks.
```

---

## 🤝 Contributing

Contributions are welcome! If you have other inheritance examples or improvements, feel free to open an issue or submit a pull request.

---

## 📄 License

This project is open-source and available under the [MIT License](LICENSE).

---

> Made with 💻 by [Zion O. Create](https://github.com/Zion-O-create)
