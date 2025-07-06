import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner Y =new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = Y.nextInt();

        if (num % 2 == 0)
        {
            System.out.println("Even number");
        }
        else
        {
            System.out.println("Odd number");
        }
    }
}