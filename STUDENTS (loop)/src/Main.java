import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Y = new Scanner(System.in);
        System.out.print("Enter the number of students : ");
        int N_OF_S = Y.nextInt();
        Y.nextLine();

        for (int i = 1; i <= N_OF_S; i++) {
            if ( i <= N_OF_S ){
                System.out.print("Enter the name of student number " + "("+ i +")"+ " : ");
            }
            String name = Y.nextLine();
            System.out.print("Enter the first grade : ");
            double G1 = Y.nextDouble();
            System.out.print("The second : ");
            double G2 = Y.nextDouble();
            System.out.print("The third : ");
            double G3 = Y.nextDouble();
            Y.nextLine();
            System.out.println("_________________");

            double average = average(G1, G2, G3);
            char Grade = determineGrade(average);

            System.out.println("-Thank you now you will know the average and the grade by (A , B , C , F).");
            System.out.println("-Please press [Enter] to show the data.");
            System.out.println("_______________________________________");
            Y.nextLine();

            System.out.println("For the student number "+ "(" + i + ")" +" whose name is " + name +".");
            System.out.println("The average is : " + average);
            System.out.println("The grade is : " + Grade);
            System.out.println("__________________________");


        }
    }

    public static double average(double G1, double G2, double G3) {
        return (G1 + G2 + G3) / 3.0;
    }

    public static char determineGrade(double average) {
        if (average >= 85) {
            return 'A';
        } else if (average >= 70 && average <= 84) {
            return 'B';
        } else if (average >= 50 && average <= 69) {
            return 'C';
        } else if (average < 50){
            return 'F';
        }
        return 0;
    }
}


