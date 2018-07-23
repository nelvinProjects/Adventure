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
                    "\n---+ The watch shows \"" + player.getWatch() + "m\" in red text and \"Points: \" " + player.getPoints() +
                    " +---");
            System.out.println("Each level is worth 2 pts, and facing challenge is worth 5 pts, and running is -3 pts." +
                    "If you lose challenge its -4 pts");
            System.out.println("BEWARE NEGATIVE POINTS MEANS DEATH!!!");
            while (game) {
                if (player.getPoints() < 0) {
                    System.out.println("Points: " + player.getPoints() + "\nYou died!!!!");
                    break;
                }
                player.printEachLevel();
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
                        if (swamp.getLevel() == 3){
                            System.out.println(swamp.levelAction('s', swamp.getLevel()));
                            if (player.getPoints() > 12){
                                System.out.println(player.getName() + ", you have completed the challenage," +
                                        " you may wish for anything and it will be granted. You will also get a " +
                                        "treasure box with many jewels");
                                String input = scanner.nextLine();
                                System.out.println("Your wish \""+ input + "\" is granted, and you are back in your room." +
                                        " \nBye forever :)");
                                break;
                            }
                            else {
                                System.out.println("You found a treasure box with few gold and diamonds");
                                System.out.println(player.getName()+ ", you have completed the game, and are " +
                                        "taken back to your room. \n Bye forever -_-");
                                break;
                            }
                        }
                        boolean result = Math.random() < 0.5;
                        if (result) {
                            System.out.println("You won the challenge :)");
                            player.setPoints(5);
                            swamp.setLevel();
                            player.setWatch(10);
                        } else {
                            System.out.println("You lost the challenge :(");
                            player.setPoints(-4);
                            swamp.setLevel();
                            player.setWatch(10);
                        }
                    }
                    System.out.println("FOR TEST PURPOSE:::: Level "+ swamp.getLevel());
                } else {
                    while (!swamp.getForward()) {
                        if (countWrongChoice > 2) {
                            System.out.println("You are beyond help now :(. Best luck in next life");
                            break;
                        }
                        player.setWatch(-2);
                        player.printEachLevel();
                        System.out.println("If you wish to go back, type back or type forward, for forward");
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
