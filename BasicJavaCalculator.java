import java.util.Scanner;

public class BasicJavaCalculator {

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      double firstNum;
      double secondNum;
      int operator;
         System.out.println("Enter the first number:");
         firstNum = input.nextDouble();
         System.out.println("Enter the operator (1 for addition, 2 for subtraction, 3 for multiplication, and 4 for division)");
         operator = input.nextInt();
         System.out.println("Enter the second number:");
         secondNum = input.nextDouble();
      
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
         
