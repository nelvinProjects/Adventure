package JourneyTests;

import Journey.Player;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class PlayerTest {
    @Test
    void getName() {
        Player player = new Player("Sim");
        Assert.assertEquals("Name doesn't match", "Sim", player.getName());
    }

    @Test
    void getSetPoints() {
        Player player = new Player("Sim");
        player.setPoints(5);
        Assert.assertEquals("Points don't match", 5, player.getPoints());
        player.setPoints(6);
        Assert.assertEquals("Points don't match", 11, player.getPoints());
    }

    @Test
    void getWatch() {
        Player player = new Player("Sim");
        Assert.assertEquals("Doesn't match", 50, player.getWatch());
    }

    @Test
    void setWatch() {
        Player player = new Player("Sim");
        player.setWatch(5);
        Assert.assertEquals("Watch didn't decrement", 45, player.getWatch());
        player.setWatch(2);
        Assert.assertEquals("Watch didn't decrement", 43, player.getWatch());
    }


}