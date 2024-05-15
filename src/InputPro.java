import java.util.Scanner;

public class InputPro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String d = scanner.nextLine();
        System.out.println("The name is " + d);
        System.out.println("Enter any number");
        int a = scanner.nextInt();
        System.out.println("Enter any number");
        int b = scanner.nextInt();
        System.out.println("The output is " + (a+b));
        System.out.println("Enter any character");
        char f = scanner.next().charAt(0);
        System.out.println("The output is " + f);

    }
}
