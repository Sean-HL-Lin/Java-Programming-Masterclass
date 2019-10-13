package academy.learnprogramming;

public class Main  {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");

        Team<FootballPlayer> teamA = new Team<>("TeamA");

        teamA.addPlayer(joe);
//        teamA.addPlayer(pat);
    }
}
