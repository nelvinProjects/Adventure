package Journey;

import java.util.ArrayList;
import java.util.List;

public class Swamp {
    private List<String> levels = new ArrayList<>();
    public Swamp(){
        initialiseLevels();
    }

    private void initialiseLevels(){
        levels.add("You are surrounded by thick fog...Where to now?");
        levels.add("You can see a faint image of a tree in front of you that's moving towards you, do you" +
                "face it or run?");
        levels.add("In front of you is a skeleton wolf, do you wish to fight or run?");
        levels.add("There is a huge hole in front of you, do you wish to jump or run?");
        levels.add("You can smell blood, do you wish to follow it or run?");
        levels.add("You did it ");
    }


}
