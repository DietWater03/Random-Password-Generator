import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        int passwordLength;

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Minimum password length: ");
            passwordLength = input.nextInt();
        }

        PasswordGen pass = new PasswordGen(passwordLength);
        pass.randomPassGen();
        pass.addNeededChar();
        pass.printPassword();

    }

}