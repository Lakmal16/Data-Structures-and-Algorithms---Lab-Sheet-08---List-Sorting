public class SalesDetails {
    public static void main(String[] args) {
        Product[] products = new Product[10];

        products[0] = new Product("P108", "Wireless Mouse", "Electronics", 2160, 30);
        products[1] = new Product("P034", "Handbag", "Accessories", 3450, 5);
        products[2] = new Product("P078", "Phone cover", "Accessories", 1750, 26);
        products[3] = new Product("P105", "Bluetooth Speaker", "Electronics", 13780, 5);
        products[4] = new Product("P003", "Ladies blouse", "Clothing", 1650, 18);
        products[5] = new Product("P053", "Shampoo", "Groceries", 2370, 20);
        products[6] = new Product("P114", "Laptop", "Electronics", 250000, 3);
        products[7] = new Product("P004", "Frock", "Clothing", 4520, 10);
        products[8] = new Product("P117", "Earphone", "Electronics", 7860, 2);
        products[9] = new Product("P120", "Microwave oven", "Electronics", 56830, 15);
        
        // Calculate and display sales amount
        for (Product p : products) {
            System.out.println(p);
        }
    }
}

