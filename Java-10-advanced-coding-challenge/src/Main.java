// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //reverse the string without using reverse function
        System.out.print("Please input the string what you want to reverse : ");
        Scanner scn = new Scanner(System.in);
        String originString = scn.nextLine();
        System.out.print("The String what you reverse is : ");
        for(int i = originString.length(); i > 0; i--){
            System.out.print(originString.charAt(i - 1));
        }

    }
}