package view.input;

import java.util.Scanner;

public class UserNumber {
    private static final Scanner scanner = new Scanner(System.in);

    public static int getUserNumber(){
        int userNumber = scanner.nextInt();

        ValidateNumber.validate(userNumber);

        return userNumber;
    }

    public static int getRegameNumber(){
        return scanner.nextInt();
    }
}
