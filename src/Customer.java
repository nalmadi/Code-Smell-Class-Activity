// too difficult - you can ignore it, if you like

public class Customer {
    private Order order;

    public Customer(Order order) {
        this.order = order;
    }

    public void processPurchase() {
        order.getItems().stream()
            .filter(item -> item.isInStock())
            .map(item -> item.applyDiscount(10))
            .forEach(item -> item.addToOrder(order))
            .reduce((item1, item2) -> item1)
            .ifPresent(item -> System.out.println("Order processed for " + item.getName()));
    }
}

public class Order {
    private List<Item> items;

    public Order(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItems() {
        return items;
    }
}

public class Item {
    private String name;
    private boolean inStock;
    private double price;

    public Item(String name, boolean inStock, double price) {
        this.name = name;
        this.inStock = inStock;
        this.price = price;
    }

    public boolean isInStock() {
        return inStock;
    }

    public Item applyDiscount(double discount) {
        this.price -= discount;
        return this;
    }

    public void addToOrder(Order order) {
        // Add item to order
    }

    public String getName() {
        return name;
    }
}
