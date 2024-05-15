import util.ScannerInput;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
       System.out.println("Enter any number");
       int a = ScannerInput.getInput().nextInt();
       if(a % 2 == 0 )
           System.out.println("The number is even");
       else
           System.out.println("The number is odd");
    }
}
