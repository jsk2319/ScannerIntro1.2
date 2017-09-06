import java.util.Scanner;

public class EnterYourName {

    public static void main(String[] args) {

        //Instantiation
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your username");
        String name = input.next();
        //String name saves username answer

        System.out.print ("Enter your password");
        String password = input.next();
        //String password saves answer

    System.out.print("Hello " + name + ", Welcome to CSC200 class! Your password is " + password);

    }
}