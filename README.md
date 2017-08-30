# TC-Design-Singleton-ObjectCreator
* **Purpose** - To demonstrate [singleton design pattern](http://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-examples)
* **Objective** - To implement 4 different types of singleton design patterns.
* **Design Description** - Ensure a class only has one instance, and provide a global point of access to it.
  * **Source** - _Design Patterns: Elements of Reusable Object Oriented Software_

# Instructions
* Create implementations of the `ObjectCreator` class by making use of the singleton design pattern for each of the following archetypes:
  * [Eager Initialization](https://github.com/Zipcoder/TC-Design-Singleton-ObjectCreator/blob/master/src/main/java/io/zipcoder/zcw_demo_singleton/theory/SingletonInitializationEager.java)
  * [Lazy Initialization](https://github.com/Zipcoder/TC-Design-Singleton-ObjectCreator/blob/master/src/main/java/io/zipcoder/zcw_demo_singleton/theory/SingletonInitializationLazy.java)
  * [Enum Singleton](https://github.com/Zipcoder/TC-Design-Singleton-ObjectCreator/blob/master/src/main/java/io/zipcoder/zcw_demo_singleton/theory/SingletonEnum.java)
  * [Bill Pugh Singleton](https://github.com/Zipcoder/TC-Design-Singleton-ObjectCreator/blob/master/src/main/java/io/zipcoder/zcw_demo_singleton/theory/SingletonBillPugh.java)

* Ensure each of the classes implement `ObjectCreator`.
* Ensure each of the [test cases](https://github.com/Zipcoder/TC-Design-Singleton-ObjectCreator/tree/master/src/test/java/io/zipcoder/zcw_demo_singleton/practical) pass.
* Use the singleton pattern examples in the `io.zipcoder.zcw_demo_singleton.theory` package to guide you.
