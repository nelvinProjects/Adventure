package Journey;

import java.util.Scanner;

public class Main {
//    private int level = 0;
    private boolean fight;
    private int points = 0;


    public static void main(String[] args) {
        boolean game = true;
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your name...");
            String name = scanner.nextLine();
            Player player = new Player(name);
            System.out.println("The adventure of "+ player.getName() + " in decision swamp");
            System.out.println("You have awaken in a foggy swamp, the smell reeks of blood and " +
                    "decaying bodies. You have a sword in one hand and a smart-watch in other. " +
                    "The watch shows 'forward' in red text");
            while (game){
                System.out.println("Type in \"north\", \"east\", \"west\" or \"south\" to move in that direction");
            }
//            scan.nextLine()

            scanner.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
