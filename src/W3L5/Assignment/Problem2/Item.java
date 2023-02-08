package W3L5.Assignment.Problem2;

public class Item {
    private String itemName;
    private double price;
    private int qty;
    private String Id;

    public Item(String itemName, double price, int qty , String id) {
        this.itemName = itemName;
        this.price = price;
        this.qty = qty;
        this.Id = id;
    }
    public String getId(){
        return Id;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public String toString(){
        return Id + " " + price*qty;
    }
}
