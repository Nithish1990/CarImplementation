package helper;

import java.util.Scanner;

public class CustomScanner {
        public static CustomScanner sc;
        public static Scanner scan;
        private  CustomScanner(){}
        public static CustomScanner getInstanceOf(){
            if(sc == null){
                sc = new CustomScanner();
                scan = new Scanner(System.in);
            }
            return sc;
        }
        public int scan(String str){
            System.out.print(str+"\nEnter Input: ");
            return  scan.nextInt();
        }
        public int scan(){
            System.out.println("Enter Input: ");
            return scan.nextInt();
        }
}
