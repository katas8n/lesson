import Country.Country;
import Country.MiddleCountry;
import Country.PoorCountry;
import Country.RichCountry;

import java.util.HashMap;
import java.util.Scanner;

import Human.Human;
import Human.Man;
import Human.Woman;
import utils.RandomTool;

public class App {
    private static void goodbyeMessage() {
        System.out.println("--------------------------------------");
        System.out.println("It was nice to meet you here!");
        System.out.println("--------------------------------------");
    }

    private static void greetingMessage() {
        System.out.println("--------------------------------------");
        System.out.println("Currently you are playing in the game! :");
        System.out.println("--------------------------------------");
    }

    public static Country getRandomPickedCountry(int COUNTRY_BY_DEFAULT_NUMBER) {
        if(COUNTRY_BY_DEFAULT_NUMBER % 2 == 0) {
            return new PoorCountry();
        }else if (COUNTRY_BY_DEFAULT_NUMBER % 3 == 0 && COUNTRY_BY_DEFAULT_NUMBER % 5 == 0) {
            return new MiddleCountry();
        }else {
            return new RichCountry();
        }
    }

    private static Human createCharacter(){
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

    public static void main(String[] args) {
        // Scream case for constants 
        String NEGATIVE_USER_ANSWER = "NO";

        Scanner scanner = new Scanner(System.in);
        Boolean stillAlive = true; 

        // If user.age == 16
        // We should ask him : "Do you want to go to middleSchool?"

        // If user.age == 18
        // We should ask him : "Do you want to become engaged?"
        // And every next year / month 


        // if ADULT 
        // We should ask him : "Do you want to get master degree?"
        // And every next year / month , until user age becomes more than 30 years old


        // IF country where user was born India
        // his money(budget) = 200
        // IF country where user was born Poland
        // his money(budget) = 1200
        // IF country where user was born USA
        // his money(budget) = 4000


        // PrimarySchool cost - 120
        // MiddleSchool cost - 500
        // HighSchool cost - 3500

        int TEENAGER = 16;
        int STUDENT = 18;
        int ADULT = 21;
        int PENSIONER = 70;

        boolean hasAverageOrHighIQ = false; 
        boolean isMarried = false;
        boolean hasWork = false; 

        int i = 0;

        Human character = createCharacter();

        while(stillAlive) {
            if(i <= 0) {
                System.out.println("'Do you wanna play our game or not'. If no , tipe there : no / No ");

                String userChoice = scanner.nextLine();

                String userAnswer = userChoice.toUpperCase();

                if(userAnswer.equals(NEGATIVE_USER_ANSWER) && i == 0) { stillAlive = false;}
                else { greetingMessage();}
            }

            if(i <= 0) {
                    System.out.println("What is your name : "); 
                    String userName = scanner.nextLine();

                    character.setName(userName);
            }

            System.out.println("What is a time range that you expected to live : m) month y) year"); 

            String range = scanner.nextLine();

            if(range.equals("13")) { character.getAllProps(); }

            System.out.println("[i] : " + i);
                
            i++;
        }
        scanner.close();

        goodbyeMessage();
    }

}
