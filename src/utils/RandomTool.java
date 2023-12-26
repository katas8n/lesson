package utils;

import java.util.Random;

public class RandomTool {
    public static int getRandomNumber(int min ,int max) {
        boolean isInvalidNumber = true;
        int intelligenceProp = 0;
        
        while(isInvalidNumber) {
            intelligenceProp = new Random().nextInt();

            if(intelligenceProp >= min && intelligenceProp <= max) {
                isInvalidNumber = false;
            }

        }

        return intelligenceProp;
    }
}
