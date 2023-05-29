// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
import java.util.*;
public class Main {

    static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }
        for(int i=2;i<Math.sqrt(num);i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Input the number what you want to check : ");
        int input_number = scn.nextInt();
        if(isPrime(input_number)){
            System.out.print("Prime!!!");
        }else {
            System.out.print("Not Prime!!!");
        }
    }
}