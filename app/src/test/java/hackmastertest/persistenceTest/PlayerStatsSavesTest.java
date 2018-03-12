package hackmastertest.persistenceTest;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.fail;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import hackmaster.objects.PlayerStatsSaves;

public class PlayerStatsSavesTest {
    private PlayerStatsSaves playerStats;

    @Before
    public void Setup() {
        playerStats = new PlayerStatsSaves();
    }


    @Test
    public void testLevelUp() {
        playerStats.addLevel();
        assertEquals("The Level should be 1",1, playerStats.getLevel());
    }
    @Test
    public void testWinAndLose() {
        assertEquals("The value of win/lose ratio should be 0" ,0.00,playerStats.getLevel(), 0.0001);
        playerStats.addWin();
        assertEquals("The value of win/lose ratio should be 1", 1.00, playerStats.getWinLossRatio(), 0.0001);
        playerStats.addLoss();
        playerStats.addLoss();
        assertEquals("The value of win/lose ratio should be .5", 0.50, playerStats.getWinLossRatio(), 0.0001);
    }

    @Test
    public void testInitPlayerStats() {
        assertNotNull(playerStats);
        assertEquals("The total wins 0.0", 0.0, playerStats.getWin(), 0.01);
        assertEquals("The Level should be 0", 0, playerStats.getLevel());
    }

    @Test
    public void testGetWin() {
        assertEquals(0, playerStats.getWin());
        playerStats.addWin();
        assertEquals(1, playerStats.getWin());

        playerStats.addWin();
        assertEquals(2, playerStats.getWin());

        playerStats.addWin();
        playerStats.addWin();
        assertEquals(4, playerStats.getWin());
    }

    @Test
    public void testGetLoss() {
        assertEquals(0, playerStats.getLoss());
        playerStats.addLoss();
        assertEquals(1, playerStats.getLoss());

        playerStats.addLoss();
        assertEquals(2, playerStats.getLoss());

        playerStats.addLoss();
        playerStats.addLoss();
        assertEquals(4, playerStats.getLoss());
    }

    @Test
    public void testPlayerName() {
        fail("Test that the saved player name is correct");
    }

    @Test
    public void testGetTotalGame() {
        fail("test that the total games comes out right");
    }
}