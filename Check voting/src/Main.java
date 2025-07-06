import java.util.Scanner;
public class Main {
    public static void main (String[] args)
    {
        Scanner N = new Scanner(System.in);
        System.out.print(" Please enter you age : ");
        int age = N.nextInt();
        N.nextLine();
        System.out.print("Please enter you nationality : ");
        String Nationality = N.nextLine();

        if (age >= 18 && Objects.equals(Nationality, "Egyptian")){
            System.out.println("Eligible to vote");

        }
        else {
            System.out.println("Not Eligible");
        }
    }

}
