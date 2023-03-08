package baseball.ui.output;

public class MessageOutput {
    private final static String GET_NUMBER = "숫자를 입력해 주세요 : ";
    private final static String GAME_END = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
    private final static String START_NEW_GAME = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";
    private final static String USER_NUMBER_NOT_VALID = "각 자리가 0이 아니고 서로 다른 세 자릿수를 입력해주세요.";

    public static void printNumberMessage(){
        System.out.print(GET_NUMBER);
    }

    public static void printGameEndMessage(){
        System.out.println(GAME_END);
    }

    public static void printStartNewGame(){
        System.out.println(START_NEW_GAME);
    }

    public static void printUserNumberNotValid(){
        System.out.println(USER_NUMBER_NOT_VALID);
    }
}
