// In Java, `ArrayList` is a part of the Java Collections Framework and is implemented in the `java.util` package.
// It is a resizable array implementation of the `List` interface. Here are some key points about `ArrayList`:

// 1. **Dynamic Sizing:** Unlike arrays in Java, `ArrayList` can dynamically resize itself, meaning you don't need to specify the size of the list when you create it.
// 2. **Generic Type:** `ArrayList` is a generic class, meaning it can hold elements of a specific type. When you create an `ArrayList`, you specify the type of elements it will contain.
// 3. **Methods:** `ArrayList` provides various methods for adding, removing, and accessing elements. Some common methods include `add()`, `remove()`, `get()`, `size()`, and more.
// 4. **Indexed Access:** Elements in an `ArrayList` are stored in an indexed manner, and you can access them using their index.
// Here's a simple example of using `ArrayList`:


import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();

        // Adding elements to the ArrayList
        stringList.add("Java");
        stringList.add("Python");
        stringList.add("C++");

        // Accessing elements using index
        System.out.println("Element at index 0: " + stringList.get(0));

        // Iterating through the ArrayList
        System.out.println("Elements in the ArrayList:");
        for (String language : stringList) {
            System.out.println(language);
        }

        // Removing an element
        stringList.remove("Python");

        // Size of the ArrayList
        System.out.println("Size of the ArrayList: " + stringList.size());
    }
}


// In this example, an `ArrayList` of strings is created, elements are added, accessed, and removed.
// The `for` loop is used to iterate through the elements.
// Remember that you need to import `ArrayList` from `java.util` to use it in your Java program.

// Here are some commonly used methods available in the `ArrayList` class in Java:

// 1. **Adding Elements:**
//    - `add(E element)`: Appends the specified element to the end of the list.
//    - `add(int index, E element)`: Inserts the specified element at the specified position in the list.

// 2. **Accessing Elements:**
//    - `get(int index)`: Returns the element at the specified position in the list.

// 3. **Removing Elements:**
//    - `remove(Object o)`: Removes the first occurrence of the specified element from the list.
//    - `remove(int index)`: Removes the element at the specified position in the list.

// 4. **Checking Existence:**
//    - `contains(Object o)`: Returns `true` if the list contains the specified element.

// 5. **Size and Empty Check:**
//    - `size()`: Returns the number of elements in the list.
//    - `isEmpty()`: Returns `true` if the list contains no elements.

// 6. **Index-related Operations:**
//    - `indexOf(Object o)`: Returns the index of the first occurrence of the specified element.
//    - `lastIndexOf(Object o)`: Returns the index of the last occurrence of the specified element.

// 7. **Sublist Operations:**
//    - `subList(int fromIndex, int toIndex)`: Returns a view of the portion of this list between the specified `fromIndex`, inclusive, and `toIndex`, exclusive.

// 8. **Replacing and Updating Elements:**
//    - `set(int index, E element)`: Replaces the element at the specified position in the list with the specified element.

// 9. **Clearing the List:**
//    - `clear()`: Removes all elements from the list.

// Here's an example demonstrating some of these methods:


import java.util.ArrayList;

public class ArrayListMethodsExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Accessing elements
        System.out.println("Element at index 1: " + fruits.get(1));

        // Removing an element
        fruits.remove("Banana");

        // Checking existence
        System.out.println("Contains 'Banana': " + fruits.contains("Banana"));

        // Size of the ArrayList
        System.out.println("Size of the ArrayList: " + fruits.size());

        // Index-related operations
        System.out.println("Index of 'Orange': " + fruits.indexOf("Orange"));

        // Replacing an element
        fruits.set(0, "Mango");

        // Clearing the list
        fruits.clear();

        // Checking if the list is empty
        System.out.println("Is the list empty? " + fruits.isEmpty())
    }
}

// This example demonstrates the use of various `ArrayList` methods for adding, accessing, removing, checking, and updating elements in the list.
