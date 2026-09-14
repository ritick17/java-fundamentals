# Java Fundamentals

My hands-on practice with core Java and object-oriented programming concepts.
Each folder is a small, self-contained program that demonstrates one concept.

## Contents

| # | Topic | What it covers | Files |
|---|-------|----------------|-------|
| 01 | [Classes and Objects](01-classes-and-objects) | Defining a class, instance fields, default and parameterised constructors, instance methods, `toString()` | `Student.java`, `MainClass.java` |
| 02 | [Variables and Objects](02-variables-and-objects) | Instance vs. local variables, creating and populating multiple objects of the same class | `Friends.java`, `Main.java` |
| 03 | [Constructors](03-constructors) | Parameterised constructor, `this` keyword, initialising state at object creation | `Dog.java`, `Main.java` |
| 04 | [Methods](04-methods) | Methods with parameters, performing a computation and returning output | `ThirdClass.java`, `Main.java` |
| 05 | [Encapsulation](05-encapsulation) | `private` fields with `public` getters and setters, access modifiers | `Friends.java`, `Main.java` |

## How to run

Every folder compiles on its own with nothing but a JDK — no build tool required.

```bash
cd 01-classes-and-objects
javac *.java
java MainClass
```

For folders `02` to `05` the entry point is `Main`:

```bash
cd 03-constructors
javac *.java
java Main
```

## Requirements

JDK 17 or higher (`java -version` to check).

## Notes

These were originally five separate repositories created while learning Java.
I merged them into this single repository so the progression reads in order,
removed the committed IDE configuration, and made each folder runnable
standalone.
