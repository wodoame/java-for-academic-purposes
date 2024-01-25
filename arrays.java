// In Java, an array is a data structure that allows you to store multiple values of the same data type under a single variable name.
// Arrays in Java are fixed in size, meaning you must declare the size of an array when you create it, and that size cannot be changed afterward.

// Here are the key aspects of arrays in Java:

// ### 1. **Declaration and Initialization:**
//    - You can declare an array using the square bracket notation. The size is specified during declaration.

     
     // Declaration and initialization of an integer array with size 5
     int[] numbers = new int[5];
     

   - You can also initialize an array at the time of declaration:

     
     // Declaration and initialization of an integer array
     int[] numbers = {1, 2, 3, 4, 5};
     

// ### 2. **Accessing Elements:**
//    - Elements in an array are accessed using their index, starting from 0.

     
     int[] numbers = {1, 2, 3, 4, 5};
     int thirdElement = numbers[2];  // Accessing the element at index 2 (value: 3)
     

// ### 3. **Array Length:**
//    - The `length` property is used to find the length (number of elements) of an array.

     
     int[] numbers = {1, 2, 3, 4, 5};
     int arrayLength = numbers.length;  // Returns 5
     

// ### 4. **Iterating Through an Array:**
//    - You can use loops to iterate through the elements of an array.

     
     int[] numbers = {1, 2, 3, 4, 5};

     // Using a for loop
     for (int i = 0; i < numbers.length; i++) {
         System.out.println(numbers[i]);
     }

     // Using an enhanced for loop (for-each loop)
     for (int num : numbers) {
         System.out.println(num);
     }
     

// ### 5. **Multidimensional Arrays:**
//    - Java supports multidimensional arrays, such as 2D arrays.

     
     // Declaration and initialization of a 2D array
     int[][] matrix = {
         {1, 2, 3},
         {4, 5, 6},
         {7, 8, 9}
     };
     

// ### 6. **Arrays Class:**
//    - The `java.util.Arrays` class provides utility methods for working with arrays, such as sorting and searching.

     
     import java.util.Arrays;

     int[] numbers = {5, 2, 8, 1, 3};
     Arrays.sort(numbers);  // Sorts the array in ascending order
     int index = Arrays.binarySearch(numbers, 8);  // Returns the index of 8 in the sorted array
     

// ### 7. **Copying Arrays:**
//    - The `System.arraycopy()` method or `Arrays.copyOf()` method can be used to copy elements from one array to another.

     
     int[] sourceArray = {1, 2, 3, 4, 5};
     int[] destinationArray = new int[sourceArray.length];
     System.arraycopy(sourceArray, 0, destinationArray, 0, sourceArray.length);
     

// Arrays are fundamental data structures in Java and are widely used in various applications.
// Understanding how to declare, initialize, and manipulate arrays is essential for effective Java programming.
