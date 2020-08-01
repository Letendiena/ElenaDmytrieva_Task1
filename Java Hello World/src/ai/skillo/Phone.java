package ai.skillo;

public class Phone {
    private int price;
    String color;

    Phone() {
        color = "black";
        price = 500;
    }
    public void setPrice (int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
}