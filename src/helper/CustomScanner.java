package helper;

import java.util.InputMismatchException;
import java.util.Scanner;

public final class CustomScanner {
        public static int scan(String str){
            System.out.println(str);
            return scan();
        }
        public static int scan() {
            System.out.print("Enter Input: ");
            int userInput = -1;
            while (true){
                try{
                    userInput = new Scanner(System.in).nextInt();
                    return userInput;
                }catch (InputMismatchException e) {
                    System.out.println("Enter Valid Input");
                }
            }
        }
}
