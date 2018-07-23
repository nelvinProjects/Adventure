package Journey;

public class Player {
    private String name;
    private int points;
    private int watch;

    public Player(String name) {
        this.name = name;
        watch = 50;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public int getWatch() {
        return watch;
    }

    public void setWatch(int value) {
        watch -= value;
    }

    public void setPoints(int value) {
        points += value;
    }

    public void printEachLevel() {
        System.out.println("++ Points: " + getPoints());
        System.out.println("++ Watch: " + getWatch() + "m");
        System.out.println("Type in \"north\", \"east\", \"west\" or \"south\" to move in that direction");
    }
}
