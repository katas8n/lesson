package utils;

import Country.Country;
import Country.MiddleCountry;
import Country.PoorCountry;
import Country.RichCountry;

import Human.Human;
import Human.Man;
import Human.Woman;

import java.util.HashMap;

public class GenerateCharacter {
    public static Country getRandomPickedCountry(int COUNTRY_BY_DEFAULT_NUMBER) {
        if(COUNTRY_BY_DEFAULT_NUMBER % 2 == 0) {
            return new PoorCountry();
        }else if (COUNTRY_BY_DEFAULT_NUMBER % 3 == 0 && COUNTRY_BY_DEFAULT_NUMBER % 5 == 0) {
            return new MiddleCountry();
        }else {
            return new RichCountry();
        }
    }

    public static Human createCharacter(){
        HashMap<String , Integer> INTELLIGENCE_BY_DEFAULT = new HashMap<>();
        HashMap<String , Integer> COUNTRY_BY_DEFAULT = new HashMap<>();
        HashMap<String , Integer> GENDER_BY_DEFAULT = new HashMap<>();

        INTELLIGENCE_BY_DEFAULT.put(
            "intelligence",
            RandomTool.getRandomNumber(0,100)
        );

        COUNTRY_BY_DEFAULT.put(
            "country",
            RandomTool.getRandomNumber(0,100)
        );

        GENDER_BY_DEFAULT.put(
            "gender",
            RandomTool.getRandomNumber(0,100)
        );

        if(GENDER_BY_DEFAULT.get("gender") % 2 == 0 ) { 
            return new Man("Hero",
                INTELLIGENCE_BY_DEFAULT.get("intelligence"),
                0,
                null,
                0,
                getRandomPickedCountry(COUNTRY_BY_DEFAULT.get("country"))
            ); 
        }

        return new Woman(
                "Hero",
                INTELLIGENCE_BY_DEFAULT.get("intelligence"),
                0,
                null,
                0,
                getRandomPickedCountry(COUNTRY_BY_DEFAULT.get("country"))
        );
    }
}
