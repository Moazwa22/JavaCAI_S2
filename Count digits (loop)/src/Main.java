import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int N = num.nextInt();

        int Counter = 0;

        while (N > 0) {
         N /= 10 ;
         Counter++;

        }

        System.out.println("The number of digits is : " + Counter);
    }
}

