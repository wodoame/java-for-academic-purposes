// In Java, the `String` class is part of the `java.lang` package and is used to represent sequences of characters.
// Strings in Java are immutable, which means that once a `String` object is created, its value cannot be changed.
// Additionally, Java provides a variety of methods within the `String` class to perform operations on strings.

// Here are some key aspects of the `String` class and common methods:

// ### 1. **Creating Strings:**
//    - You can create a string using a string literal or the `new` keyword.

     
     String str1 = "Hello, World!";  // Using a string literal
     String str2 = new String("Java");  // Using the new keyword
     

// ### 2. **String Concatenation:**
//    - The `+` operator is used for string concatenation.

     
     String greeting = "Hello";
     String name = "John";
     String message = greeting + ", " + name + "!";
     

// ### 3. **String Length:**
//    - The `length()` method returns the number of characters in a string.

     
     String text = "Java Programming";
     int length = text.length();  // Returns 17
     

// ### 4. **Accessing Characters:**
//    - You can access individual characters in a string using the `charAt(index)` method.

     
     String word = "Java";
     char firstChar = word.charAt(0);  // Returns 'J'
     

// ### 5. **Substring:**
//    - The `substring(beginIndex, endIndex)` method returns a substring from the specified range.

     
     String text = "Programming";
     String subString = text.substring(3, 7);  // Returns "gram"
     

// ### 6. **String Comparison:**
//    - The `equals()` method checks if two strings have the same content.
//    - The `equalsIgnoreCase()` method is similar but ignores case differences.

     
     String str1 = "Java";
     String str2 = "java";
     boolean isEqual = str1.equals(str2);  // Returns false
     boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2);  // Returns true
     

// ### 7. **Searching and Matching:**
//    - The `indexOf()` method returns the index of the first occurrence of a substring.
//    - The `contains()` method checks if a string contains a specified substring.

     
     String sentence = "Java is fun!";
     int index = sentence.indexOf("is");  // Returns 5
     boolean containsWord = sentence.contains("fun");  // Returns true
     

// ### 8. **Conversion to Other Types:**
//    - The `valueOf()` method converts other data types to strings.
//    - The `toCharArray()` method converts a string to a character array.

     
     int num = 42;
     String strNum = String.valueOf(num);  // Converts int to string

     String text = "Java";
     char[] charArray = text.toCharArray();  // Converts string to char array
     

// These are just a few examples of the many methods available in the `String` class.
// It's a good practice to refer to the [official Java documentation](https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/lang/String.html)
// for a comprehensive list of methods and their descriptions.
