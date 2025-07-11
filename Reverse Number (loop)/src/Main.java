import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     Scanner num = new Scanner(System.in);
        System.out.print("Enter the number : ");
     int N = num.nextInt();
     int Y = 0;
     while ( N > 0){

         Y = N % 10 + Y * 10;
         N/= 10;
     }
        System.out.println("The reverse of this number is : " + Y);
    }
}