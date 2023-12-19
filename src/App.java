import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean stillAlive = true; 

        while(stillAlive) {
            System.out.println("Welcome to the game! You might choose : 'Do you wanna play our game or not' . Positive answers :\nYes\nYep\nOk");
            String userChoice = scanner.nextLine();

            switch(userChoice.toString().toLowerCase()) {
                case "yes":
                case "y":
                case "ok":
                case "yep":
                    System.out.println("--------------------------------------");
                    System.out.println("Currently you are playing in the game!");
                    break;
                    
                    default :
                    System.out.println("--------------------------------------");
                    System.out.println("You should go!");
                    stillAlive = false;
                    break;
            }
        }

        scanner.close();
    }
}
