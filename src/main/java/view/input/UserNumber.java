package view.input;

import view.output.MessageOutput;

import java.util.Scanner;

public class UserNumber {
    private static final Scanner scanner = new Scanner(System.in);

    public static int getUserNumber(){
        int userNumber = scanner.nextInt();

        try {
            ValidateNumber.validate(userNumber);
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            MessageOutput.askNumber();

            return getUserNumber();
        }

        return userNumber;
    }

    public static int getRegameNumber(){
        return scanner.nextInt();
    }
}
