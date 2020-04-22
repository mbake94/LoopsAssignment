// Write loops to print the following:

public class Loops8 {
    public static void main(String[]args){
        String space = " ";
        String noSapce = "";
        String ascii = "*";

        for (int i = 0; i<4;i++){
            System.out.println("**********");
        }
        System.out.println();

        for (int i =0; i<=4; i++){
            System.out.println(ascii);
            ascii+="*";
        }
        System.out.println();

        String message1 = "    *";
        System.out.println(message1);
        for (int i =0; i<=4; i++){
            System.out.println(message1.replaceFirst(" ", ""));
            message1 = space+ascii;
        }
    }
}
