import java.util.Scanner;
public class lab1{
  public static void main (String [] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    substract(a, b);
  }
  static void substract(int a, int b ){
    System.out.println(a-b);
  }
} 