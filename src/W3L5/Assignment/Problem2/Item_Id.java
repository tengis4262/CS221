package W3L5.Assignment.Problem2;

import java.util.Objects;

public class Item_Id {
    private String item_ID;

    public Item_Id(String item) {
        item_ID = item;
    }

    public String getItem_ID() {
        return item_ID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item_Id id = (Item_Id) o;
        return Objects.equals(item_ID, id.item_ID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(item_ID);
    }
}
