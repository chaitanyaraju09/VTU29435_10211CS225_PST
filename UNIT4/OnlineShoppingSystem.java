import java.util.*;

class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return id + " - " + name + " - Rs." + price;
    }
}

class Order implements Comparable<Order> {
    int orderId;
    String productName;
    int priority;

    Order(int orderId, String productName, int priority) {
        this.orderId = orderId;
        this.productName = productName;
        this.priority = priority;
    }

    @Override
    public int compareTo(Order o) {
        return Integer.compare(o.priority, this.priority);
    }

    public String toString() {
        return "Order " + orderId +
               " - " + productName +
               " - Priority: " + priority;
    }
}

public class OnlineShoppingSystem {

    public static void main(String[] args) {

        // Linear Collection: ArrayList
        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product(101, "Laptop", 55000));
        products.add(new Product(102, "Mobile", 25000));
        products.add(new Product(103, "Headphones", 2000));
        products.add(new Product(104, "Keyboard", 1500));

        System.out.println("PRODUCT LIST:");
        for (Product p : products) {
            System.out.println(p);
        }

        // Non-linear Collection: HashMap
        HashMap<Integer, Product> productMap = new HashMap<>();

        for (Product p : products) {
            productMap.put(p.id, p);
        }

        // Search product by ID
        int searchId = 102;

        System.out.println("\nSEARCH PRODUCT:");
        if (productMap.containsKey(searchId)) {
            System.out.println("Product Found: " +
                    productMap.get(searchId));
        } else {
            System.out.println("Product Not Found");
        }

        // Non-linear Collection: PriorityQueue
        PriorityQueue<Order> orderQueue = new PriorityQueue<>();

        orderQueue.add(new Order(1, "Laptop", 2));
        orderQueue.add(new Order(2, "Mobile", 5));
        orderQueue.add(new Order(3, "Headphones", 1));
        orderQueue.add(new Order(4, "Keyboard", 4));

        // Process orders according to priority
        System.out.println("\nPROCESSING ORDERS:");

        while (!orderQueue.isEmpty()) {
            System.out.println(orderQueue.poll());
        }
    }
}