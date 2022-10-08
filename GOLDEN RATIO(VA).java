import java.util.Scanner;
public class Main {

   public static double golden(int n) {
      if (n <= 0) {
         return 1;
      }
      return 1.0 + 1.0 / golden(n - 1);
   }

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int n = scan.nextInt();
      System.out.println(golden(n));
      scan.close();
   }
}
