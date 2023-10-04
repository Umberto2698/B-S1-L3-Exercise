package eCommerce;

public class Articolo {
    private int id;
    private String description;

    private double price;

    private int stock;

    public Articolo(String description, double price, int stock) {
        if (price > 0 && stock > 0) {
            this.id = (int) (Math.random() * 100);
            this.description = description;
            this.price = price;
            this.stock = stock;
        } else if (price <= 0) {
            System.out.println("Inserici un prezzo maggiore di 0.");
        } else {
            System.out.println("Inserisci un numero intero maggiore di zero per indicare la quantità in magazzino.");
        }
    }
}
