class Item {
    int itemCode;
    String itemName;
    double price;
    void displayDetails(int quantity) {
        double totalCost = quantity * price;
        System.out.println("ItemCode: " + itemCode);
        System.out.println("ItemName: " + itemName);
        System.out.println("UnitPrice: $" + price);
        System.out.println("TotalCostfor " + quantity + ": $" + totalCost);
    }
    public static void main(String[] args) {
        Item i = new Item();
        i.itemCode = 01;
        i.itemName = "notebok";
        i.price = 50;
        i.displayDetails(5);
    }
}
