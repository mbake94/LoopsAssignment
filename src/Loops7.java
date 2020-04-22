import java.util.Scanner;

// Have the user enter a number and print the sum of all numbers from that inputted value to 1.
public class Loops7 {
    public static void main(String[]args){
        Scanner keybd = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = keybd.nextInt();

        for (int i = num-1; i >= 1; i--){
            num += i;
        }
        System.out.println(num);


    }

}
