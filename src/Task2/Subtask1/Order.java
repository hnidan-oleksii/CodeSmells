package Task2.Subtask1;

import java.util.List;

public class Order {
    private String customerName;
    private List<Item> items;
    private double totalPrice;

    public Order(String customerName, List<Item> items) {
        this.customerName = customerName;
        this.items = items;
        this.totalPrice = calculateTotalPrice();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    private double calculateTotalPrice() {
        return items.stream()
                .mapToDouble(Item::price)
                .sum();
    }
    // Багато інших методів, які опрацьовують замовлення
}
