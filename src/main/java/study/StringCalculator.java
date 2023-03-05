package study;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

    static public int CalculateString(String line){
        if(line == null) {
            line = getLine();
        }

        if(!validatingExpression(line)){
            throw new IllegalArgumentException("올바른 문장이 아닙니다.");
        }

        return calculate(splitWithNull(line));
    }

    private static String getLine(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static boolean validatingExpression(String line) {
        Pattern pattern = Pattern.compile("^[+\\-]?\\d*( ?[*\\-+/] ?\\d*)*$");
        Matcher matcher = pattern.matcher(line);

        return matcher.find();
    }

    private static String[] splitWithNull(String line){
        return line.split(" ");
    }

    private static int calculate(String[] values){
        int result = Integer.parseInt(values[0]);
        for (int i=1;i<values.length;i+=2) {
            result = calculating(values, i, result);
        }
        return result;
    }

    private static void checkDivideWithZero(String value) {
        if(Integer.parseInt(value) == 0){
            throw new IllegalArgumentException("0으로 나눌 수 없습니다");
        }
    }

    private static int calculating(String[] values, int i, int result){
        switch(values[i]){
            case "+":
                result += Integer.parseInt(values[i+1]);
                break;

            case "-":
                result -= Integer.parseInt(values[i+1]);
                break;

            case "*":
                result *= Integer.parseInt(values[i+1]);
                break;
            case "/":{
                checkDivideWithZero(values[i+1]);
                result /= Integer.parseInt(values[i+1]);
                break;
            }
        }
        return result;
    }
}
