package Task2.Subtask1;

public class OrderProcessor {
    public void processOrder(Order order) {
        if (!isValidOrder(order)) {
            System.out.println("501");
        }

        removeFromDatabase(order);
        System.out.println("200");
    }

    private boolean isValidOrder(Order order) {
        boolean isCustomerNameEmpty = order.getCustomerName().isEmpty();
        boolean isItemsEmpty = order.getItems().isEmpty();
        boolean isTotalPriceNotNegative = order.getTotalPrice() >= 0;

        return isCustomerNameEmpty && isItemsEmpty && isTotalPriceNotNegative;
    }

    private void removeFromDatabase(Order order) {
        // Calls to DAL
    }
}
