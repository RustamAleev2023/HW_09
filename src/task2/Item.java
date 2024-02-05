package task2;

public class Item {
    private String itemName;
    private String unit;
    private int amount;
    private int price;
    private int totalPrice;

    public Item(String itemName, String unit, int amount, int price) {
        this.itemName = itemName;
        this.unit = unit;
        this.amount = amount;
        this.price = price;
        this.totalPrice = amount * price;
    }

    public String getItemName() {
        return itemName;
    }

    public String getUnit() {
        return unit;
    }

    public int getAmount() {
        return amount;
    }

    public int getPrice() {
        return price;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    @Override
    public String toString() {
        return "itemName: " + itemName + ", unit: " + unit + ", amount: " + amount +
                ", price: " + price + ", totalPrice: " + totalPrice;
    }
}
