package eCommerce;

import java.util.Arrays;

public class Carrello {
    private Articolo[] articlesList = new Articolo[10];
    private double total;

    Carrello(int id) {
        this.total = 0;
    }

    void addToCart(Articolo articolo) {
        if (articolo == null) {
            System.out.println("L'elemento fornito non è un articolo del nostro negozio.");
        } else {
            boolean pieno = false;
            short n = 0;
            for (int i = 0; i < this.articlesList.length; i++) {
                if (this.articlesList[i] == null) {
                    this.articlesList[i] = articolo;
                    pieno = true;
                    break;
                }
                n++;
            }
            if (n == 10 && !pieno) {
                short k = 8;
                for (int i = 0; i < this.articlesList.length - 1; i++) {
                    if (i + k >= 9) {
                        this.articlesList[8 - i] = this.articlesList[8 - i - 1];
                    } else {
                        this.articlesList[i + k + 1] = this.articlesList[i + k];
                    }
                }
                this.articlesList[0] = articolo;
            }
            setTotal(this.total + articolo.getPrice());
        }
    }

    @Override
    public String toString() {
        return "Carrello{" +
                "articlesList=" + Arrays.toString(articlesList) +
                ", total=" + total +
                '}';
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
