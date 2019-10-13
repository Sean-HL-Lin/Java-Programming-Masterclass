package academy.learnprogramming;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>>{
    private String name;
    private ArrayList<T> players;
    private int score;

    public void addPlayer(T player) {
        players.add(player);
    }

    public int getScore() {
        return score;
    }

    public Team(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }


    @Override
    public int compareTo(Team<T> team) {
        if(this.getScore() < team.getScore()) {
            return 1;
        } else {
            return -1;
        }
    }

}
