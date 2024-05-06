package assignment_of_conditonal_loops;
import java.util.Scanner;

public class ReverseString {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("please enter a string : ");
    String con = sc.nextLine();
    int l = con.length();
    for(int i=l-1; i>=0; i--){
      System.out.print(con.charAt(i));  
    }
  }
}
