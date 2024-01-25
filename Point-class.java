// The `Point` class in the `java.awt` package is a part of the Abstract Window Toolkit (AWT) library, which is Java's original set of GUI components.
// The `Point` class represents a point in a two-dimensional space with integer coordinates (x, y).
// This class is commonly used for handling graphical operations and interactions within graphical user interfaces.

// Here's a brief overview of the `Point` class:

// 1. **Package and Import:**
//    - The `Point` class is part of the `java.awt` package.
//    - To use the `Point` class, you need to import it into your Java code:

     
     import java.awt.Point;
     

// 2. **Constructor:**
//    - The `Point` class has two constructors:
//      - `Point()`: Constructs a point at the origin (0, 0).
//      - `Point(int x, int y)`: Constructs a point with the specified coordinates (x, y).

     // Example:

     
     import java.awt.Point;

     public class PointExample {
         public static void main(String[] args) {
             // Creating Point objects
             Point p1 = new Point();          // Point at (0, 0)
             Point p2 = new Point(3, 5);      // Point at (3, 5)

             // Displaying point coordinates
             System.out.println("Point 1: " + p1);
             System.out.println("Point 2: " + p2);
         }
     }
     

// 3. **Methods:**
//    - The `Point` class provides methods for accessing and modifying the coordinates of the point. Some of the commonly used methods include:
//      - `getX()` and `getY()`: Retrieve the x and y coordinates, respectively.
//      - `setLocation(double x, double y)`: Set the location of the point.
//      - `translate(int dx, int dy)`: Move the point by the specified offset.

     // Example:

     
     import java.awt.Point;

     public class PointExample {
         public static void main(String[] args) {
             // Creating a Point object
             Point point = new Point(2, 3);

             // Displaying original coordinates
             System.out.println("Original Point: " + point);

             // Modifying coordinates
             point.setLocation(5, 8);
             System.out.println("Modified Point: " + point);

             // Translating the point
             point.translate(2, -1);
             System.out.println("Translated Point: " + point);
         }
     }
     

// The `Point` class is just one of many classes in the `java.awt` package that provides functionality for GUI programming.
// It's worth noting that while AWT was the original GUI library for Java, Swing and JavaFX are more modern alternatives 
// that provide enhanced features and a richer set of components for building graphical user interfaces.
