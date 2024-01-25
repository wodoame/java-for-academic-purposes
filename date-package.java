// In Java, the `java.util` package provides the `Date` class, which is commonly used for representing dates and times.
// However, it's important to note that the `Date` class has been around for a long time, and starting from Java 8, the java.time package was introduced,
// providing a more comprehensive set of classes for handling date and time operations.
// The java.time package is part of the Java Date and Time API (JSR-310).

// Let's briefly explore both:

// 1. **`java.util.Date` (Legacy):**
//    - The `Date` class in the `java.util` package is part of the legacy date and time API.
//    - It has several methods for getting and setting the date and time components.
//    - However, it has some limitations and is not recommended for new code, as it lacks many modern features and is not thread-safe.

   // Example using `java.util.Date`:

   
   import java.util.Date;

   public class DateExample {
       public static void main(String[] args) {
           // Creating a Date object representing the current date and time
           Date currentDate = new Date();

           // Displaying the current date and time
           System.out.println("Current Date and Time: " + currentDate);
       }
   }
   

// 2. **`java.time` Package (Java 8 and later):**
//    - The `java.time` package introduces a new set of classes to deal with date and time in a more flexible and comprehensive manner.
//    - It includes classes like `LocalDate`, `LocalTime`, `LocalDateTime`, `ZonedDateTime`, and more, each serving different purposes.
//    - The `java.time` classes are immutable and offer better support for operations involving time zones, durations, and periods.

//    Example using `java.time.LocalDate`:

   
   import java.time.LocalDate;

   public class LocalDateExample {
       public static void main(String[] args) {
           // Creating a LocalDate object representing the current date
           LocalDate currentDate = LocalDate.now();

           // Displaying the current date
           System.out.println("Current Date: " + currentDate);
       }
   }
   

// It's recommended to use the classes from the `java.time` package for new projects, as they provide better functionality and address 
// some of the issues present in the older `java.util.Date` and `java.util.Calendar` classes.
