import java.util.Scanner;

public class main {
    public static void main ( String[] args){
        Scanner N = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int n1 = N.nextInt();
        System.out.print("Enter the second number : ");
        int n2 = N.nextInt();
        double Sum = (n1 + n2), Subtract = (n1 - n2), Multiply = ( n1 * n2), Div = (n1 / n2);
        System.out.println( "The sum is = " + Sum);
        System.out.println("The subtraction = " + Subtract);
        System.out.println("The multiplication = " + Multiply);
        System.out.println("The division = " + Div);
    }
}
