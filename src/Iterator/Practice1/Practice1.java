package Iterator.Practice1;

import java.util.Iterator;

public class Practice1 {
    public static void main(String[] args) {
        MenuOne mo = new MenuOne();
        MenuTwo mt = new MenuTwo();

        Iterator s = mo.createIterator();
        while (s.hasNext()){
            String temp = (String) s.next();
            System.out.println(temp);
        }
    }
}
