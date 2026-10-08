public class CalculatorExample {
    public static void main(String[] args) {
        char operator = '+'; // Can be '+' or '-'
        int num1 = 12;
        int num2 = 5;
        int result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result of addition: " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("Result of subtraction: " + result);
                break;

            default:
                System.out.println("Error: Invalid operator chosen.");
                break;
        }
    }
}
