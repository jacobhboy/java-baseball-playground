package baseball.ui.input;

import java.util.Scanner;

public class PlayNewGameInput {

    public static boolean doesPlayerWantNewGame(){
        int number = getNumber();
        if(number == 2) return false;

        return true;
    }
    private static int getNumber(){
        final Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
