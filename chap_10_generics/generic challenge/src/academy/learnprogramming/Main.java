package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        BaseballPlayer playerA = new BaseballPlayer("A");
        BaseballPlayer playerB = new BaseballPlayer("B");
        BaseballPlayer playerC = new BaseballPlayer("C");
        BaseballPlayer playerD = new BaseballPlayer("D");

        Team<BaseballPlayer> teamA= new Team<>("TeamA", 10);
        Team<BaseballPlayer> teamB= new Team<>("TeamB", 112);
        Team<BaseballPlayer> teamC= new Team<>("TeamC", 15);


        League<Team<BaseballPlayer>> baseballLeague = new League<>("Baseball");
        baseballLeague.addTeam(teamA);
        baseballLeague.addTeam(teamA);
        baseballLeague.addTeam(teamB);
        baseballLeague.addTeam(teamC);
        baseballLeague.printTeams();
        baseballLeague.showLeagueTable();
    }
}
