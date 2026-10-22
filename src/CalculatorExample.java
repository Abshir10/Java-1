public class CalculatorExample {
       static char operator = '+'; // Can be '+' or '-'
       static int num1 = 12;
       static int num2 = 5;
       static int result = 0;
     static  void usingSwitch() {


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
