package Practices;

public class InventoryMain {
    public static void main(String[] args) {
        
        Product p1 = new Product("3/4 inch Pipe", 180, 50);
        Product p2 = new Product("Toilet Seat", 980, 20);
        Product p3 = new Product("Aree Blade", 10, 200);
        
        System.out.println("=== SHOP INVENTORY ===");
        p1.display();
        p2.display();
        p3.display();
        
        System.out.println("\n--- Selling 5 units of Pipe ---");
        p1.reduceStock(5);
        p1.display();
        
        System.out.println("\n--- Selling 100 units of Blade ---");
        p3.reduceStock(100);
        p3.display();
        
        System.out.println("\n--- Trying to sell 100 units of Toilet Seat ---");
        p2.reduceStock(100);
        p2.display();
    }
}