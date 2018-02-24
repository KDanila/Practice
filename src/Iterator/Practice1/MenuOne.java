package Iterator.Practice1;

import java.util.Iterator;

public class MenuOne  {
    String[] menu = new String[10];

    MenuOne() {
        menu[0] = "0";
        menu[1] = "1";
        menu[2] = "2";
        menu[3] = "3";
        menu[4] = "4";
        menu[5] = "5";
        menu[6] = "6";
        menu[7] = "7";
        menu[8] = "8";
    }



    Iterator createIterator(){
        return (Iterator) new MenuOneIterator(this.menu);
    }
}
