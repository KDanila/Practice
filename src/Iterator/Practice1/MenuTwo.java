package Iterator.Practice1;

import java.util.Iterator;
import java.util.ArrayList;

public class MenuTwo{
    ArrayList<String> menu = new ArrayList<String>();
    MenuTwo(){
        menu.add("0");
        menu.add("1");
        menu.add("2");
        menu.add("3");
        menu.add("4");
        menu.add("5");
        menu.add("6");
        menu.add("7");
        menu.add("8");
        menu.add("9");
    }

    Iterator createIterator(){
        return (Iterator) this.menu.iterator();
    }

}
