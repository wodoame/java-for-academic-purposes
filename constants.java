// In Java, constants are variables whose values should not be changed once they are assigned.
// You can create constants using the `final` keyword, and it is a common practice to name constants in uppercase letters to distinguish them from regular variables.
// Java also supports the `static final` combination for class-level constants.

// Here's how you can define constants in Java:

// ### 1. **Using `final` Keyword:**
//    - For instance variables:

     
     public class MyClass {
         final int MAX_VALUE = 100;  // Instance variable constant

         public void printConstant() {
             System.out.println(MAX_VALUE);
         }
     }
     

   // - For local variables:

     
     public void myMethod() {
         final int TEMP_VALUE = 42;  // Local variable constant
         System.out.println(TEMP_VALUE);
     }
     

// ### 2. **Using `static final` for Class-Level Constants:**
//    - Class-level constants are often declared with the `static final` modifiers.

     
     public class MathConstants {
         public static final double PI = 3.14159;
         public static final double E = 2.71828;
     }
     

   // - These constants can be accessed using the class name: `MathConstants.PI`.

// ### 3. **Enums for Constants:**
//    - Java Enums are a powerful way to define a set of constants.

     
     public enum Day {
         SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
     }
     

   // - Enums are often used when you have a fixed set of related constants.

// ### 4. **Using `final` with Methods:**
//    - You can use the `final` keyword to prevent method overriding in subclasses.

     
     public class MyBaseClass {
         public final void myMethod() {
             // Method implementation
         }
     }

     public class MyDerivedClass extends MyBaseClass {
         // Error: Cannot override the final method from MyBaseClass
         // public void myMethod() {
         //     // Subclass implementation
         // }
     }
     

// ### 5. **Constants in Interfaces:**
//    - Interfaces can have constants, and all fields in an interface are implicitly `public`, `static`, and `final`.

     
     public interface Colors {
         String RED = "Red";
         String GREEN = "Green";
         String BLUE = "Blue";
     }
     

   // - Classes implementing the interface can directly use these constants.

public class Example implements Colors {
    public void printColors() {
        System.out.println(RED + ", " + GREEN + ", " + BLUE);
    }
}

// Using constants in your code makes it more readable, maintainable, and less error-prone, as the values remain consistent throughout the program.
// It's a good practice to use constants for values that should not be changed during the execution of your program.
