package eCommerce;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Cliente {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    LocalDateTime now = LocalDateTime.now();
    int id;
    Carrello cart;
    private String name;
    private String surname;
    private String email;
    private String subscriptionDate = dtf.format(now);

    public Cliente(String name, String surname, String email) {
        this.id = (int) (Math.random() * 100);
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.cart = new Carrello(this.id);
    }

    public void buyArticle(Articolo articolo) {
        if (articolo == null) {
            System.out.println("L'elemento fornito non è un articolo del nostro negozio.");
        } else {
            if (articolo.getStock() == 0) {
                System.out.println("Articolo esaurito.");
            } else {
                this.cart.addToCart(articolo);
                articolo.setStock(articolo.getStock() - 1);
            }
        }

    }

    public Carrello getCart() {
        return cart;
    }
}
