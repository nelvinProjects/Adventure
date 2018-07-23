package Journey;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean fight;
        boolean game = true;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your name...");
            String name = scanner.nextLine();
            Player player = new Player(name);
            Swamp swamp = new Swamp();
            System.out.println("The adventure of " + player.getName() + " in Decision Swamp");
            System.out.println("You have awaken in a foggy swamp, the smell reeks of blood and " +
                    "decaying bodies. You have a sword in one hand and a smart-watch in other. " +
                    "\n---+ The watch shows " + player.getWatch() + "m in red text and \"Points: \" " + player.getPoints() +
                    " +---");
            System.out.println("Each level is worth 2 pts, and facing challenge is worth 5 pts, and running is -3 pts." +
                    "If you lose challenge its -4 pts");
            System.out.println("BEWARE NEGATIVE POINTS MEANS DEATH!!!");
            while (game) {
                if (player.getPoints() < 0) {
                    System.out.println("Points: " + player.getPoints() + "\n You died!!!!");
                    break;
                }
                player.printEachLevel();
//                System.out.println("Type in \"north\", \"east\", \"west\" or \"south\" to move in that direction");
                char value = scanner.nextLine().toLowerCase().charAt(0);
                System.out.println(swamp.levelAction(value, swamp.getLevel()));
                int countWrongChoice = 0;
                if (swamp.getForward() == true) {
                    player.setPoints(2);
                    System.out.println("Whats you decision?");
                    value = scanner.nextLine().toLowerCase().charAt(0);
                    if (value == 'r') {
                        player.setPoints(-3);
                    } else {
                        boolean result = Math.random() < 0.5;
                        if (result) {
                            player.setPoints(5);
                            swamp.setLevel();
                        } else {
                            player.setPoints(-4);
                            swamp.setLevel();
                        }
                    }
                } else {
                    while (!swamp.getForward()) {
                        if (countWrongChoice > 2) {
                            System.out.println("You are beyond help now :(. Best luck in next life");
                            break;
                        }
                        player.setWatch(-2);
                        player.printEachLevel();
                        value = scanner.nextLine().toLowerCase().charAt(0);
                        System.out.println(swamp.wrongChoice(value));
                        countWrongChoice++;
                    }
                    if (countWrongChoice > 2) {
                        break;
                    }
                }
            }

            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
