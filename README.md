# Algorithm to Java Code Generator

A Java Swing-based GUI application that generates Java code snippets based on algorithm descriptions provided by the user. This project is designed to help users quickly generate boilerplate code for common algorithms like Factorial, Fibonacci, and Sum of Array.

## Features

- **Algorithm Identification**: Detects the algorithm type based on the user-provided description.
- **Code Generation**: Generates ready-to-use Java code snippets for the identified algorithm.
- **Graphical User Interface**: Intuitive GUI built using Java Swing.
- **Clear and Reset Options**: Allows users to clear input and reset the application easily.

## Supported Algorithms

- **Factorial**: Recursive function to calculate the factorial of a number.
- **Fibonacci**: Recursive function to find the Fibonacci number at a given position.
- **Sum of Array**: Iterative function to calculate the sum of elements in an array.

## How to Use

1. Clone the repository:
    ```bash
    git clone https://github.com/codehub-ui/algorithm-to-java-code-generator.git
    ```
2. Open the project in your favorite Java IDE (e.g., IntelliJ IDEA, Eclipse, NetBeans).
3. Compile and run the `AlgorithmToJavaCodeGUI` class.
4. Enter the description of the algorithm in the input field (e.g., "Find the factorial of a number").
5. Click on the "Generate Code" button to see the corresponding Java code in the output area.
6. Use the "Clear" button to reset the input and output fields.

## Screenshot

Algorithm-to-java-codeGenerator/screenshot.png


## Technologies Used

- **Java**: Core programming language.
- **Swing**: For building the graphical user interface.

## Future Enhancements

- Support for more algorithms (e.g., Searching, Sorting, Matrix Operations).
- Improved algorithm detection using NLP or regular expressions.
- Copy-to-clipboard functionality for generated code.
- Theming options for the GUI.

## Contributing

Contributions are welcome! If you want to add features or fix bugs, feel free to fork this repository and create a pull request.

## License

This project is licensed under the [Apache License](LICENSE).

---

### Example Usage

```java
public class Factorial {
    public static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int number = 5; // Example input
        System.out.println("Factorial of " + number + " is: " + factorial(number));
    }
}
