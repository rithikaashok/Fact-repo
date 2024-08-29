public class Calculator {
    public static void main(String[] args) {
        double num1 = 20.0;
        double num2 = 4.0;

        double sum = num1 + num2;
        System.out.println("Addition: " + num1 + " + " + num2 + " = " + sum);

        double difference = num1 - num2;
        System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + difference);

        double product = num1 * num2;
        System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + product);

        double quotient = num1 / num2;
        System.out.println("Division: " + num1 + " / " + num2 + " = " + quotient);
    }
}
