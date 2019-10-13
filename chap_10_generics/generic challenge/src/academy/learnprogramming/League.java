package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class League<T extends Team> {
    private String name;
    private ArrayList<T> teamList;

    public League(String name) {
        this.name = name;
        this.teamList = new ArrayList<>();
    }

    public boolean addTeam(T team) {
        if(!teamList.contains(team)) {
            teamList.add(team);
            return true;
        }
        return false;
    }


    public void printTeams() {
//        Iterator teamIterator = teamList.iterator();
//        boolean forward = true;
//        while(forward) {
//            if (teamIterator.hasNext()) {
//                System.out.println("team : " + ((Team) teamIterator.next()).getName());
//            } else {
//                forward = false;
//            }
//        }
    }

    public String getName() {
        return name;
    }


    public void showLeagueTable() {
        Collections.sort(teamList);
        for(T t : teamList) {
            System.out.println(t.getName() + ": " + t.getScore());
        }
    }
}
