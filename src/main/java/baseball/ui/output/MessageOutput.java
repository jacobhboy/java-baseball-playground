package baseball.ui.output;

public class MessageOutput {
    private final static String GETNUMBER = "숫자를 입력해 주세요 : ";
    private final static String GAMEEND = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
    private final static String STARTNEWGAME = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";
    private final static String USERNUMBERNOTVALID = "각 자리가 0이 아니고 서로 다른 세 자릿수를 입력해주세요.";

    public static void printNumberMessage(){
        System.out.print(GETNUMBER);
    }

    public static void printGameEndMessage(){
        System.out.println(GAMEEND);
    }

    public static void printStartNewGame(){
        System.out.println(STARTNEWGAME);
    }

    public static void printUserNumberNotValid(){
        System.out.println(USERNUMBERNOTVALID);
    }
}
