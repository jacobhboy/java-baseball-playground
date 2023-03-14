package view.input;

public class ValidateNumber {

    public static void validate(final int number){
        isNumberHundredNumber(number);
        allNumberDifferent(number);
        allNumberNotZero(number);
    }

    private static void allNumberNotZero(final int number) {
        String[] split = String.valueOf(number).split("");
        for (String s : split) {
            if(s.equals("0")) throw new IllegalArgumentException("0은 들어갈 수 없습니다.");
        }
    }

    private static void allNumberDifferent(final int number) {
        String[] split = String.valueOf(number).split("");
        for(int i=0, length = split.length;i< length;i++){
            int nextChar = (i + 1) % 3;
            int beforeChar = (i + 2) % 3;

            if(split[i].equals(split[nextChar]) || split[i].equals(split[beforeChar]))
                throw new IllegalArgumentException("같은 수는 입력될 수 없습니다.");
        }
    }

    private static void isNumberHundredNumber(final int number) {
        if(number <= 100 || 1000 <= number)
            throw new IllegalArgumentException("세 자릿수를 입력해주세요.");
    }
}
