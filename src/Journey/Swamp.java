package Journey;

import java.util.ArrayList;
import java.util.List;

public class Swamp {
    private List<String> levels = new ArrayList<>();
    private boolean forward;
    private int level;

    public Swamp() {
        setLevels();
    }

    private void setLevels() {
        levels.add("You are surrounded by thick fog...Where to now?");
        levels.add("You can see a faint image of a tree in front of you that's moving towards you, do you" +
                " face it or run?");
        levels.add("In front of you is a skeleton wolf, do you wish to fight or run?");
        levels.add("There is a huge hole in front of you, do you wish to jump or run?");
        levels.add("You step into land covered in blood and you hear a scream for help" +
                ", do you wish to follow it or run?");
        levels.add("You did it!!!");
    }

    public boolean getForward() {
        return forward;
    }

    public void setForward(boolean value) {
        forward = value;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel() {
        level += 1;
    }

    public String levelAction(char direction, int level) {
        if (level == 0 && direction == 'n') {
            setForward(true);
            return levels.get(1);
        } else if (level == 1 && direction == 'e') {
            setForward(true);
            return levels.get(2);
        } else if (level == 2 && direction == 'w') {
            setForward(true);
            return levels.get(3);
        } else if (level == 3 && direction == 's') {
            setForward(true);
            return levels.get(4);
        } else if (level == 4 && direction == 's') {
            setForward(true);
            return levels.get(5);
        } else {
            setForward(false);
            return levels.get(0);
        }
    }

    public String wrongChoice(char decision) {
        if (decision == 'b') {
            forward = true;
            return "You are back to where you were before";
        } else {
            return "Hahahahahaha!!!!";
        }
    }

}
