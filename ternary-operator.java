// Yes, Java has a ternary operator, which is a shorthand way of expressing an `if-else` statement in a single line.
// The ternary operator is also known as the conditional operator. 

// The syntax is as follows:
// result = condition ? expression1 : expression2;


// Here, `condition` is evaluated first.
// If it is `true`, the entire expression evaluates to `expression1`; otherwise, it evaluates to `expression2`.
// The result is then assigned to the variable on the left side of the assignment.

// Here's a simple example:


public class TernaryOperatorExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        // Using the ternary operator to find the maximum of two numbers
        int max = (x > y) ? x : y;

        System.out.println("The maximum value is: " + max);
    }
}


// In this example, the ternary operator `(x > y) ? x : y` is used to find the maximum of two numbers (`x` and `y`). 
// If `x` is greater than `y`, the value of `x` is assigned to the variable `max`; otherwise, the value of `y` is assigned.
// The ternary operator is a concise way to express simple conditional assignments.
// However, it's important to use it judiciously and not make the code overly complex or hard to read.
// In some cases, using a regular `if-else` statement might be more readable, especially for more complex conditions or multiple statements.
