// In Java, data types can be broadly categorized into two main groups: primitive types and reference types.

// 1. **Primitive Types:**
//    - These are the basic data types provided by Java.
//    - They represent simple values, and they are not objects.
//    - There are eight primitive data types in Java: `byte`, `short`, `int`, `long`, `float`, `double`, `char`, and `boolean`.
//    - Primitive types are stored directly in memory and are more efficient in terms of memory usage and performance.

   // Example of primitive types:

   
   int x = 5;        // primitive type
   char c = 'A';     // primitive type
   boolean flag = true;  // primitive type
   

// 2. **Reference Types:**
//    - Reference types are used to store references or memory addresses of objects.
//    - Objects are instances of classes and are created using the `new` keyword.
//    - Reference types include classes, interfaces, arrays, and enumerations.
//    - Reference types are more versatile than primitive types, as they can represent complex structures and behaviors.

   // Example of reference types:

   
   String str = new String("Hello");   // reference type (String is a class)
   Scanner scanner = new Scanner(System.in);  // reference type (Scanner is a class)
   int[] array = new int[5];  // reference type (array is an object)
   

// **Key Differences:**

// - **Memory Allocation:**
//   - Primitive types are stored directly in the memory stack, and their values are held in the memory location.
//   - Reference types are stored in the memory heap, and variables of reference types store the memory address of the object.

// - **Default Values:**
//   - Primitive types have default values (e.g., 0 for numeric types, false for boolean, '\u0000' for char) if not explicitly initialized.
//   - Reference types have a default value of `null` if not explicitly initialized.

// - **Passing by Value vs. Passing by Reference:**
//   - When passing a primitive type to a method, you pass the actual value (pass by value).
//   - When passing a reference type to a method, you pass the memory address (reference) of the object (pass by reference).
// However, it's essential to note that Java is technically "pass-by-value" even for reference types. The value being passed is the reference to the object.

// Understanding the differences between primitive and reference types is crucial for effective Java programming and memory management.
