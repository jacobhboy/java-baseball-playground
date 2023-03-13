package view.input;

import java.util.Random;

public class RandomNumber {
    static final int aThousandToMakeThreeDigit = 1000;
    public static int randomNumber(){
        Random random = new Random();
        int randomNumber = random.nextInt() % aThousandToMakeThreeDigit;

        try {
            ValidateNumber.validate(randomNumber);
        } catch(IllegalArgumentException e){
            return randomNumber();
        }

        return randomNumber;
    }
}
