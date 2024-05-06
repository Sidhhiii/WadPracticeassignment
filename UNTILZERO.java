package assignment_of_conditonal_loops;
import java.util.*;

public class UNTILZERO {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  // int sum = 0;
  // System.out.println("Please enter the number :");
  // int number = sc.nextInt();
  // while(number!=0){
  //   sum += number;
  //   number = sc.nextInt();
  // }
  // System.out.println(sum);
    
  // Take integer inputs till the user enters 0 and print the largest number from all.
  int largest = 0;
  int number;
  do{
    System.out.println("Please enter the number :");
    number = sc.nextInt();
    if(number!=0 && number> largest){
      largest = number;
    }
  }while(number!=0);
  
  System.out.println(largest+" this is largest among all of them");
    
  }
}
