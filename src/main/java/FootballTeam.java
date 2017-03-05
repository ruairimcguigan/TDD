/**
 * Created by c0249298 on 01/03/2017.
 */
public class FootballTeam implements Comparable{

    int gamesWon;

    public FootballTeam(int numberOfGames) {
        this.gamesWon = numberOfGames;
    }

    public int getGamesWon() {
        return gamesWon;
    }

//    public int compareTo(FootballTeam o) {
//        if (gamesWon > o.getGamesWon()){
//            return 1;
//        }
//        else if (gamesWon < o.getGamesWon()){
//            return -1;
//        }
//        return 0;
//    }
//
//    public int compareTo(Object o) {
//        return 0;
//    }

    public int compareTo(FootballTeam otherTeam) {
        return gamesWon - otherTeam.getGamesWon();
    }

    public int compareTo(Object o) {
        return 0;
    }
}
