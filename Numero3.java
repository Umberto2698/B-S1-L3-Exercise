import eCommerce.Articolo;
import eCommerce.Cliente;

public class Numero3 {
    public static void main(String[] args) {
        Cliente primoCliente = new Cliente("Umberto", "Zappulla", "zappulla850@gmail.com");
        Articolo primoArticolo = new Articolo("Cuffie Fnatic", 59.99, 1);
        Articolo secondoArticolo = new Articolo("Sedia da gaming", 89.99, 0);
        Articolo terzoArticolo = new Articolo("Chiavetta USB 15 giga", 19.99, 4);
        primoCliente.buyArticle(primoArticolo);
        System.out.println(primoArticolo.getStock());

        primoCliente.buyArticle(secondoArticolo);
        primoCliente.buyArticle(terzoArticolo);
        System.out.println(primoCliente.getCart());
        
    }
}
