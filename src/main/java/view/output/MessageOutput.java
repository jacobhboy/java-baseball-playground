package view.output;

public class MessageOutput {
    private static final String ASK_NUMBER = "숫자를 입력해 주세요 : ";
    private static final String END_GAME = "3개의 숫자를 모두 맞히셨습니다.";
    private static final String ASK_REGAME = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    public static void askNumber(){
        System.out.print(ASK_NUMBER);
    }

    public static void tellGameEnd(){
        System.out.println(END_GAME);
    }

    public static void askRegame(){
        System.out.println(ASK_REGAME);
    }
}
