package Iterator.Practice1;

import java.util.Iterator;

public class MenuOneIterator implements Iterator {

    String[] menu;
    int position;

    public MenuOneIterator(String[] menu) {
        this.menu = menu;
    }

    @Override
    public boolean hasNext() {
        if (position >= menu.length || menu[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        String s = menu[position];
        position++;
        return s;
    }
}
