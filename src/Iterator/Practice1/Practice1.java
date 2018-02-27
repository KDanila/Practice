package Iterator.Practice1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Practice1 {
    public static void main(String[] args) {
        MenuOne mo = new MenuOne();
/*        MenuTwo mt = new MenuTwo();

        Iterator s = mo.createIterator();
        while (s.hasNext()){
            String temp = (String) s.next();
            System.out.println(temp);
        }*/
        List<String> a = new ArrayList<String>();
        a.add("1");
        a.add("2");
        a.add("3");
        a.add("4");
        System.out.println(a);
        String[] be = new String[a.size()];

        be = a.toArray(be);
        int sum = 0;
        for (String s : be
                ) {
            sum += Integer.valueOf(s);
            System.out.printf("Промежуточная сумма: %-3d \n", sum);
        }
        System.out.printf("Полная сумма: %3d", sum);
    }
}
