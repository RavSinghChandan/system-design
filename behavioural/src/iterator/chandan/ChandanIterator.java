package iterator.chandan;

import java.util.List;

public class ChandanIterator implements Iterator<String>{
    private final List<String> items;
    private int position = 0;

    public ChandanIterator(List<String> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.size();
    }

    @Override
    public String next() {
        if (this.hasNext()) {
            return items.get(position++);
        }
        return null;
    }
}
