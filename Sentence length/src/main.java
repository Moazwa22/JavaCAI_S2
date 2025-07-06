import java.util.Scanner;
public class main {
    public static void main(String[] args) {

      Scanner S = new Scanner(System.in);
      System.out.print("Enter The Sentence : ");
      String Sentence = S.nextLine();
        System.out.println("The sentence in Uppercase : " + Sentence.toUpperCase());
        System.out.println("The number of Characters is : " + Sentence.length());
        System.out.println("The first Character is : " + Sentence.charAt(0));
        }
    }

