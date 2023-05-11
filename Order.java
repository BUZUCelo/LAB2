package restaurant;

import java.util.List;

public class Order {
    private Customer customer;
    private List<MenuItem> items;
    private double totalPrice;

    private Order(Customer customer, List<MenuItem> items) {
        this.customer = customer;
        this.items = items;
        this.totalPrice = calculateTotalPrice();
    }

    public static Order createOrder(Customer customer, List<MenuItem> items) {
        return new Order(customer, items);
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<MenuItem> getItems() {
        return items;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    private double calculateTotalPrice() {
        double total = 0;
        for (MenuItem item : items) {
            total += item.getPrice();
        }
        return total;
    }
}
