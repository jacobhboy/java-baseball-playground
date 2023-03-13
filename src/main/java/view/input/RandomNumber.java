package view.input;

import java.util.Random;

public class RandomNumber {
    static final int aThousandToMakeThreeDigit = 1000;
    public static int getRandomNumber(){
        Random random = new Random();
        int randomNumber = random.nextInt() % aThousandToMakeThreeDigit;

        try {
            ValidateNumber.validate(randomNumber);
        } catch(IllegalArgumentException e){
            return getRandomNumber();
        }

        return randomNumber;
    }
}
