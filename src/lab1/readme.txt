
Objectives for Lab #1:
---------------------
   * Practice using abstraction by creating an Abstract super class and
     choosing an appropriate class name (should be a noun).
   * Practice identifying common properties and behaviors (methods) and placing
     those things in the super class
   * In the files provided many mistakes have been made with regard to proper
     encapsulation (declaring properties private, e.g.) and placement of
     common members. You may have to move some things around, remove things
     and/or create new things to make this work better.
   * Practice deciding which super class methods should be abstract, if any,
     and which super class methods should be fully implemented, if any.
     (TIP: implement (concrete) methods that should not change and declare them 
      final; if a method has the potential for being overridden in the 
      sub-class, declare that method abstract)

      ///////////don't worry about these 3 principles below here///////////

   * Observe the Open/Closed Principle
   * Make sure you throw new IllegalArgumentException if validation fails
   * Use the Liskov Substitution Principle for greater flexibility.

Instructions for Lab #1:
----------------------
1. Create an abstract super class that contains COMMON properties and methods
   to be inherited by the sub-classes that are provided.
2. Modify your sub-classes to take advantage of this inheritance. Will you
   need to re-implement and/or override methods? Will you need to re-declare all
   properties?
3. Fix any and all encapsulation problems.
4. Create a class "College" that has a method to add a course to the current 
   semester inventory. Pass a course to this method. In the body of the method 
   output a message saying that the course name has been added to the semester 
   inventory.
5. Create a startup class to test your code. In this startup class create 
   instances of each sub-class and set all properties. Then create a College
   object and call the method to add courses to semester inventory. Add each
   course, one at a time.


