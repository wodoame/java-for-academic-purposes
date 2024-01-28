// The "for-each" loop in Java is also known as the "enhanced for loop" or "foreach loop."
// It provides a concise way to iterate over arrays or other iterable collections without the need for explicit indexing or counting of elements.
// The syntax of the for-each loop is as follows:


for (elementType variable : iterable) {
    // Code to be executed for each element
}

// Here, `iterable` can be an array or any object that implements the `Iterable` interface, and `elementType` 
// is the type of elements stored in the array or iterable collection.
// The `variable` is a temporary variable that takes on the value of each element in the iteration.
// Here's an example using the for-each loop to iterate over an array:


public class ForEachLoopExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // Using the for-each loop to iterate over the array
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}


// In this example, the for-each loop iterates over the elements in the `numbers` array, and the variable `num` takes on the value of each element in each iteration.
// The for-each loop is particularly useful when you need to iterate through all elements in a collection and don't need the index of the elements.
// It enhances code readability and reduces the chance of off-by-one errors.
// Note that the for-each loop cannot be used when you need to modify the elements of the collection during iteration or when you need access to the index of the elements.
// In such cases, the traditional `for` loop with an explicit index is more appropriate.
