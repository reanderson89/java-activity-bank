# Abstract Methods and Classes

* Step 1: Review of Polymorphism and Inheritance
  - Create 2 child classes of the Bird class. One should be capable of flight (sparrow, pigeon, crow, hawk, eagle, etc...). The other should not be capable of flight (penguin, ostrich, emu, etc...)
  - Each child class should have at least 1 attribute and method specific to it. It should also Override the fly() method from the parent stating whether they can fly or not.
  - Create an object of each subclass in the Nature class and call on their methods and attributes to check your work. 

* Step 2: Refactor your code using an abstract class and abstract method for fly()
  - Check out this [website](https://www.w3schools.com/java/java_abstract.asp) for help on abstract classes and methods.
  - You will have to change the declaration of the Bird class to be an abstract class.
  - You will also need to use the abstract keyword for the method you wish to make abstract.
  - Notice from the website given how to set up your abstract method in the parent class. 
  - Delete the fly() method from your child classes and see the error that it creates. Using an abstract class and method is a way of guaranteeing that the child classes will handle the method in their own way.

* Step 3: `After completing the interface_activity` we are going to now use an interface for the fly() method to add even further abstraction, so we only use the methods where we need them.
  - delete or comment out all the fly() methods in the Bird and child classes you created.
  - Create an interface and call it CapableOfFlight
  - create a method inside it called fly()
  - implement the interface on your child class that is capable of flight and create the fly() method to meet the standards of the interface you created.
  - You can delete the abstract keyword from the Bird class if you would like now as well. 