import java.util.Scanner;

public class BasicJavaCalculator {

   public static void main(String[] args) {
      Scanner numbers = new Scanner(System.in);
      double firstNum;
      double secondNum;
      int operator;
      Scanner opera = new Scanner(System.in);
         System.out.println("Enter the first number:");
         firstNum = numbers.nextDouble();
         System.out.println("Enter the operator (1 for addition, 2 for subtraction, 3 for multiplication, and 4 for division)");
         operator = opera.nextInt();
         System.out.println("Enter the second number:");
         secondNum = numbers.nextDouble();
      
      if (operator == 1){
      
      System.out.println("The answer is " + (firstNum + secondNum));
      }
      else if (operator == 2){
     System.out.println("The answer is " + (firstNum - secondNum));
     }
     else if (operator == 3){
     System.out.println("The answer is " + (firstNum * secondNum));
     }
     else if (operator == 4){
     System.out.println("The answer is " + (firstNum / secondNum));
     }
  }
 }
         