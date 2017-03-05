import junitparams.Parameters;
import org.junit.Test;

import static junitparams.JUnitParamsRunner.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
//import static junitparams.JUnitParamsRunner.$;

/**
 * Created by c0249298 on 01/03/2017.
 */
public class FootballTeamTest {

    public static final int GAMES_WON = 3;
    public static final int INVALID_GAMES_WON = -10;
    private static final int ANY_NUMBER = 123;

    @Test
    public void constructorShouldSetGamesWon() throws Exception {
        FootballTeam team = new FootballTeam(GAMES_WON);

        assertEquals(GAMES_WON + "games passed to constructor, but " + team.getGamesWon() + " games were returned", GAMES_WON, team.getGamesWon());
    }

    @Test
    public void shouldBePossibleToCompareTeams() throws Exception {

        FootballTeam team = new FootballTeam(ANY_NUMBER);

        assertTrue("Football team should implement Comparable", team instanceof Comparable);
    }

    @Test
    public void teamsWithMoreWinsShouldBeGreater() throws Exception {
        FootballTeam manUtd = new FootballTeam(3);
        FootballTeam liverpool = new FootballTeam(2);

        assertTrue("team with 3 games won should be ranked before the team with 2 games won",
                manUtd.compareTo(liverpool) > 0);
    }

    @Test
    public void teamsWithLessMatchesWonShouldBeLesserRanked() throws Exception {
        FootballTeam team1 = new FootballTeam(2);
        FootballTeam team2 = new FootballTeam(5);

        assertTrue("team with " + team1.getGamesWon() + " games won should be ranked after the team with "
                + team2.getGamesWon() +" games won",
                team1.compareTo(team2) < 0);
    }

    @Test
    public void teamsWithSameNumberOfGamesWonShouldBeEqual() throws Exception {
        FootballTeam team1 = new FootballTeam(4);
        FootballTeam team2 = new FootballTeam(4);

        assertTrue("both teams have won the same number of games: " +
                team1.getGamesWon() + " VS " + team2.getGamesWon() + "and should be ranked equal",
                team1.compareTo(team2) == 0);
    }
}
