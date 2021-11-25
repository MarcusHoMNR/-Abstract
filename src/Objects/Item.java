package Objects;

public class Item extends AbstractItem{
    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Item(String type, int price, int quantity) {
        super(type, price);
        setQuantity(quantity);
    }

    @Override
    public String toString() {
        return "We should buy " + this.getQuantity() + " " + this.getType();
    }
}
