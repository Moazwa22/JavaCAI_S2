import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     float totalSalary = 0;
        Scanner S = new Scanner(System.in);
     float[] salaries = new float [10];
     for (int i = 0 ; i < 10 ; i++){
         System.out.println("Enter the salaries of employees : ");
        salaries[i] = S.nextFloat();

     }
     for ( int j = 0 ; j < 10 ; j++){
        double bounus =  salaries[j] * 0.10;
        salaries [j] += bounus;
        totalSalary += salaries[j];
         System.out.println(totalSalary);
     }
        }
    }
