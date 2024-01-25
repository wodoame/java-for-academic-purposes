// In Java, functions are typically referred to as methods.
// Methods are blocks of code that perform a specific task and are defined within a class.
// Here's a basic guide on how to write methods in Java:

// ### 1. **Method Declaration:**
//    - A method declaration consists of a method signature and a method body.
//    - The method signature includes the access modifier, return type, method name, and parameters (if any).

     
     public class MyClass {
         // Method declaration
         public int addNumbers(int a, int b) {
             // Method body
             int sum = a + b;
             return sum; // Return statement
         }
     }
     

   // - In the above example:
   //    - `public` is the access modifier (other options include `private`, `protected`, or package-private/default).
   //    - `int` is the return type.
   //    - `addNumbers` is the method name.
   //    - `(int a, int b)` are the method parameters.

// ### 2. **Method Invocation:**
//    - To use a method, you need to create an instance of the class (for non-static methods) and then invoke the method using the dot notation.

     
     public class MethodExample {
         public static void main(String[] args) {
             MyClass myObject = new MyClass();  // Creating an instance of MyClass
             int result = myObject.addNumbers(5, 7);  // Invoking the addNumbers method
             System.out.println("Sum: " + result);
         }
     }
     

// ### 3. **Return Statement:**
//    - A method can return a value using the `return` statement.

     
     public int multiply(int x, int y) {
         int product = x * y;
         return product;
     }
     

   // - If a method does not return any value, you can use `void` as the return type.

     
     public void greetUser(String name) {
         System.out.println("Hello, " + name + "!");
     }
     

// ### 4. **Method Overloading:**
//    - Java supports method overloading, which allows you to define multiple methods with the same name but different parameter lists.

     
     public int addNumbers(int a, int b) {
         return a + b;
     }

     public double addNumbers(double a, double b) {
         return a + b;
     }
     

   // - The compiler determines which version of the method to call based on the arguments provided.

// ### 5. **Static Methods:**
//    - You can declare a method as `static` if it belongs to the class rather than an instance of the class.

     
     public class MathUtils {
         public static int square(int x) {
             return x * x;
         }
     }
     

   // - Static methods can be called using the class name: `MathUtils.square(5)`.

// ### 6. **Variable-Length Argument Lists (Varargs):**
//    - You can use varargs to allow a method to accept a variable number of arguments.

     
     public int sum(int... numbers) {
         int total = 0;
         for (int num : numbers) {
             total += num;
         }
         return total;
     }
     

   // - Varargs should be the last parameter in the method's parameter list.

// These are basic concepts for writing methods in Java.
// Methods play a crucial role in breaking down code into reusable and modular components, promoting good code organization and maintainability.
