package Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayCollection {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("11");
        list.add("1133");
        list.add("11444");
        list.add("11555");
        list.add("11666");
        list.set(2,"0000");
        for (String g :
                list) {
            System.out.println(g);
        }

    }
}
