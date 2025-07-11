import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String dayname;
      for ( int day = 1 ; day<= 7 ; day++)

        switch (day){
            case 1:
                System.out.println( day + " is saturday");
                break;
            case 2:
                System.out.println( day + " day is sunday");
                break;
            case 3:
                System.out.println( day + " day is monday");
                break;
            case 4 :
                System.out.println( day + " day is Tuesday");
                break;
            case 5:
                System.out.println( day + " day is Wednesday");
                break;
            case 6:
                System.out.println( day + " day is Thursday");
                break;
            case 7:
                System.out.println( day + " day is Friday");
                break;
        }
      }
    }

