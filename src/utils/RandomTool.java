package utils;

import java.util.Random;

public class RandomTool {
    public static Random intelligence() {
        Random intelligenceProp = new Random(100);

        return intelligenceProp;
    }

    public static Random family() {
        Random family = new Random(100);

        return family;
    }

    public static Random chooseGender() {
        Random gender = new Random(100);

        return gender;
    }
}
