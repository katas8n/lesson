import Human.Human;
import utils.MessageTool;
import utils.CheckUserAge;
import utils.GenerateCharacter;

import java.util.HashMap;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        // ! Scream case for constants 
        String NEGATIVE_USER_ANSWER = "NO";

        Scanner scanner = new Scanner(System.in);
        Boolean stillAlive = true; 

        int i = 0;

        Human character = GenerateCharacter.createCharacter();

        while(stillAlive) {
            if(i <= 0) {
                MessageTool.printMessage("Do you wanna play a game?");

                String userChoice = scanner.nextLine();

                String userAnswer = userChoice.toUpperCase();

                if(userAnswer.equals(NEGATIVE_USER_ANSWER) && i == 0) { stillAlive = false;}
                else {  MessageTool.printMessage("Hello , user!"); }
            }

            if(i <= 0) {
                    System.out.println("What is your name : "); 
                    String userName = scanner.nextLine();

                    character.setName(userName);
            }

            System.out.println("What is a time range that you expected to live : m) month y) year q) quit"); 

            String range = scanner.nextLine();

            String UpperCasedRange = range.toUpperCase();

            if(UpperCasedRange.equals("M")) { 
                character.liveForMonth();

                MessageTool.printMessage("You successfully lived for a month"); 
            } else if(UpperCasedRange.equals("Y")) { 
                character.liveForYear();

                MessageTool.printMessage("You successfully lived for a year");
            } else if(UpperCasedRange.equals("Q"))  {
                 break; 
            }
            else { 
                MessageTool.printMessage("There aren't any command which match your request!"); 
            }

            CheckUserAge checkedData = new CheckUserAge();
            checkedData.getCheckedData(character);

          
            System.out.println(checkedData.getCheckedData(character));

            i++;
        }
        scanner.close();

        MessageTool.printMessage("Goodbye!");
    }

}
