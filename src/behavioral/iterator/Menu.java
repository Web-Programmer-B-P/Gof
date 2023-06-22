package behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class Menu {
//       String[] items = {"one", "two"};
    List<String> items = new ArrayList<>();

    public Menu(List<String> items) {
        this.items = items;
    }

    Iterator<String> getIterator() {
        return new Iterator<String>() {
            int i;

            @Override
            public boolean hasNext() {
//                return i < items.length;
                return i < items.size();
            }

            @Override
            public String next() {
//                return items[i++];
                return items.get(i++);
            }
        };
    }
}
