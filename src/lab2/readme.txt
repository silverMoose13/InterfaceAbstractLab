
Objectives for Lab #2:
---------------------
   * Practice using abstraction by creating an Interface super class and
     choosing an appropriate interface name (should be a noun).
   * Practice identifying common behaviors (methods) and placing
     those things in the super class
   * In the files provided many mistakes have been made with regard to proper
     encapsulation (declaring properties private, e.g.) and placement of
     common members. You may have to move some things around, remove things
     and/or create new things to make this work better.
   * Observe the Open/Closed Principle
   * Make sure you throw new IllegalArgumentException if validation fails
   * Use the Liskov Substitution Principle for greater flexibility.

Instructions for Lab #2:
----------------------
1. Create an interface super class that contains common methods
   to be inherited by the sub-classes that are provided.
2. Modify your sub-classes to take advantage of this inheritance. You will 
   need to implement all methods in the sub classses. Remember that Netbeans has
   a wizard to help you with this. You will see a little yellow light bulb
   at the left of the code. Clicking it will let "implement all abstract
   methods". How will you deal with common properties? Remember, Interfaces
   can't have properties! You'll need to put them in the sub-classes.
3. Fix any and all encapsulation problems.
4. Create a class "College" that has a method to add a course to the current 
   semester inventory. Pass a course to this method. In the body of the method 
   output a message saying that the course name has been added to the semester 
   inventory.
5. Create a startup class to test your code. In this startup class create 
   instances of each sub-class and set all properties. Then create a College
   object and call the method to add courses to semester inventory. Add each
   course, one at a time.

