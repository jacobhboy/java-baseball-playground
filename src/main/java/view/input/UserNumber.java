package view.input;

import java.util.Scanner;

public class UserNumber {
    public static int getUserNumber(){
        Scanner scanner = new Scanner(System.in);

        return scanner.nextInt();
    }
}
