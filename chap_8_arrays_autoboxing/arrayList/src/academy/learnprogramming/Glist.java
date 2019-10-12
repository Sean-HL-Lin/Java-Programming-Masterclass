package academy.learnprogramming;

import java.util.ArrayList;

public class Glist {
    private ArrayList<String> glocerylist = new ArrayList<String>();

    public void addItems(String item) {
        glocerylist.add(item);
    }

    public void print() {
        for (int i = 0; i < glocerylist.size(); i++) {
            System.out.println("print out: " + i);
        }
    }

    public String find(String item) {
        int position = glocerylist.indexOf(item);
        if(position >= 0) {
            return glocerylist.get(position);
        }
        return null;
    }
}
