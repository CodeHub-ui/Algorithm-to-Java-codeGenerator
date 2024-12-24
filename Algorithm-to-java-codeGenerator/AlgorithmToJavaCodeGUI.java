import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AlgorithmToJavaCodeGUI {

    // Method to identify the algorithm based on the description
    public static String identifyAlgorithm(String description) {
        description = description.toLowerCase();

        if (description.contains("factorial")) {
            return "factorial";
        } else if (description.contains("fibonacci")) {
            return "fibonacci";
        } else if (description.contains("sum of array")) {
            return "sum_of_array";
        }
        return "unknown";
    }

    // Method to generate Java code for the identified algorithm
    public static String generateCode(String algorithm) {
        switch (algorithm) {
            case "factorial":
                return """
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
                """;

            case "fibonacci":
                return """
                    public class Fibonacci {
                        public static int fibonacci(int n) {
                            if (n <= 1) return n;
                            return fibonacci(n - 1) + fibonacci(n - 2);
                        }

                        public static void main(String[] args) {
                            int number = 10; // Example input
                            System.out.println("Fibonacci number at position " + number + " is: " + fibonacci(number));
                        }
                    }
                """;

            case "sum_of_array":
                return """
                    public class SumOfArray {
                        public static int sumArray(int[] arr) {
                            int sum = 0;
                            for (int num : arr) {
                                sum += num;
                            }
                            return sum;
                        }

                        public static void main(String[] args) {
                            int[] array = {1, 2, 3, 4, 5}; // Example array
                            System.out.println("Sum of array elements: " + sumArray(array));
                        }
                    }
                """;

            default:
                return "Error: Algorithm not recognized. Please provide a valid algorithm description.";
        }
    }

    public static void main(String[] args) {
        // Create the JFrame
        JFrame frame = new JFrame("Algorithm to Java Code Generator");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Input Panel
        JPanel inputPanel = new JPanel(new BorderLayout());
        JLabel inputLabel = new JLabel("Enter Algorithm Description:");
        JTextField inputField = new JTextField();
        inputPanel.add(inputLabel, BorderLayout.WEST);
        inputPanel.add(inputField, BorderLayout.CENTER);

        // Output Panel
        JPanel outputPanel = new JPanel(new BorderLayout());
        JLabel outputLabel = new JLabel("Generated Java Code:");
        JTextArea outputArea = new JTextArea();
        outputArea.setEditable(false);
        outputArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
        JScrollPane scrollPane = new JScrollPane(outputArea);
        outputPanel.add(outputLabel, BorderLayout.NORTH);
        outputPanel.add(scrollPane, BorderLayout.CENTER);

        // Button Panel
        JPanel buttonPanel = new JPanel();
        JButton generateButton = new JButton("Generate Code");
        JButton clearButton = new JButton("Clear");
        buttonPanel.add(generateButton);
        buttonPanel.add(clearButton);

        // Add Action Listeners
        generateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String description = inputField.getText();
                String algorithm = identifyAlgorithm(description);
                String generatedCode = generateCode(algorithm);
                outputArea.setText(generatedCode);
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputField.setText("");
                outputArea.setText("");
            }
        });

        // Add components to the frame
        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(outputPanel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        // Make the frame visible
        frame.setVisible(true);
    }
}
