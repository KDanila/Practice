package Temp;

import java.util.*;

public class Temp {
    public static void main(String[] args) {
        ArrayList<String> temp = new ArrayList<String>();
        temp.add("0");
        temp.add("1");
        temp.add("2");
        temp.add("3");
        temp.add("4");
        temp.add("5");
        temp.add("6");
        ListIterator<String> i = temp.listIterator();
        while (i.hasPrevious()){
            String t = i.previous();
            System.out.println(t);
        }
    }
}
