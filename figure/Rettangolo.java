package figure;


public class Rettangolo {

    private double height;
    private double width;

    public Rettangolo(double height, double width) {
        if (height > 0 && width > 0) {
            this.height = height;
            this.width = width;
        } else {
            System.out.println("Inserisci un'altezza e una larghezza maggiori di 0");
        }

    }

    public double perimetro() {
        return (this.height + this.width) * 2;
    }

    public double area() {
        return this.height * this.width;
    }


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("Inserisci un'altezza maggiore di 0");
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("Inserisci una larghezza maggiore di 0");
        }
    }
}