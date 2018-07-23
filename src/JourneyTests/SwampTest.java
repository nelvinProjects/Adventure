package JourneyTests;

import Journey.Swamp;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwampTest {
    @Test
    void wrongChoice() {
        Swamp swamp = new Swamp();
        swamp.wrongChoice('b');
        Assert.assertEquals("Wrong result", true, swamp.getForward());
        Assert.assertEquals("Wrong result", "Hahahahahaha!!!!", swamp.wrongChoice('m'));
    }

    @Test
    void getSetLevel() {
        Swamp swamp = new Swamp();
        swamp.setLevel();
        Assert.assertEquals("Levels don't match", 1, swamp.getLevel());
        swamp.setLevel();
        Assert.assertEquals("Levels don't match", 2, swamp.getLevel());
    }

    @Test
    void getSetForward() {
        Swamp swamp = new Swamp();
        swamp.setForward(true);
        Assert.assertEquals("Forward wrong", true, swamp.getForward());
        swamp.setForward(false);
        Assert.assertEquals("Forward wrong", false, swamp.getForward());
    }

    @Test
    void levelAction() {
        Swamp swamp = new Swamp();
        Assert.assertEquals("Output doesn't match", "You can see a faint image of a tree in front of you that's moving towards you, do you" +
                "face it or run?", swamp.levelAction('n', swamp.getLevel()));
        swamp.setLevel();
        Assert.assertEquals("Output doesn't match", "In front of you is a skeleton wolf, do you wish to fight or run?"
                , swamp.levelAction('e', swamp.getLevel()));
        Assert.assertEquals("Output doesn't match", "You are surrounded by thick fog...Where to now?"
                , swamp.levelAction('w', swamp.getLevel()));

    }

}