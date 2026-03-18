package level2;
class CartItem {
    String itemName;
    double price;
    int quantity;

    void add(String name, double p, int q) {
        itemName = name;
        price = p;
        quantity = q;
    }

    void remove() {
        quantity = 0;
    }

    void totalCost() {
        System.out.println("Total Cost: " + (price * quantity));
    }

    public static void main(String[] args) {
        CartItem c = new CartItem();
        c.add("Book", 200, 2);
        c.totalCost();
        c.remove();
        c.totalCost();
    }
}