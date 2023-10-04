package eCommerce;

public class Articolo {
    private int id;
    private String description;

    private double price;

    private int stock;

    public Articolo(String description, double price, int stock) {
        if (price > 0 && stock >= 0) {
            this.id = (int) (Math.random() * 100);
            this.description = description;
            this.price = price;
            this.stock = stock;
        } else if (price <= 0) {
            System.out.println("Inserici un prezzo maggiore di 0.");
        } else {
            System.out.println("Inserisci un numero intero maggiore o uguale di zero per indicare la quantità in magazzino.");
        }
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Inserici un prezzo maggiore di 0.");
        }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("Inserisci un numero intero maggiore o uguale di zero per indicare la quantità in magazzino.");
        }
    }

    @Override
    public String toString() {
        return "Articolo{" +
                "description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
