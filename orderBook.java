// Package declaration
import org.agrona.collections.Int2ObjectHashMap;

class Order<T> {
    private int orderId;
    private T orderDetails;

    public Order(int orderId, T orderDetails) {
        this.orderId = orderId;
        this.orderDetails = orderDetails;
    }

    public int getOrderId() {
        return orderId;
    }

    public T getOrderDetails() {
        return orderDetails;
    }
}

public class orderBook<T> {
    private Int2ObjectHashMap<Order<T>> orderMap;

    public orderBook() {
        orderMap = new Int2ObjectHashMap<>();
    }

    public void addOrder(int orderId, Order<T> order) {
        orderMap.put(orderId, order);
    }

    public void removeOrder(int orderId) {
        orderMap.remove(orderId);
    }

    public Order<T> getOrder(int orderId) {
        return orderMap.get(orderId);
    }
}
