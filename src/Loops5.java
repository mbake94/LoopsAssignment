// Have the user input a number and print all numbers from that input value to 1.
import java.util.Scanner;

public class Loops5 {
    public static void main (String[] args){
        Scanner keybd = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = keybd.nextInt();

        for (int i = num; i > 0; i--){
            num = i;
            System.out.print(num + " ");
        }

    }
}
